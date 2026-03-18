package edu.ntnu.nettsideprosjekt.httpserver.model.APIcallers;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.io.*;
import java.net.http.HttpResponse;

public class GetAlbumsAPICall {
  String albumLimit;
  String period;
  String USER;
  URI URI;
  String API_KEY;
  File credentials = new File("src/main/resources/LastFMcredentials.csv");

  public GetAlbumsAPICall(String albumLimit, String period) {
    this.albumLimit = albumLimit;
    this.period = period;
    try (FileReader fr = new FileReader(credentials); BufferedReader bufferedReader = new BufferedReader(fr)) {
      String[] line = bufferedReader.readLine().split(",");
      this.API_KEY = line[0];
      this.USER = line[1];
    } catch (IOException e) {
      System.out.println("Failed to initialize credentials for API request: GetAlbumsAPICall");
    }
    StringBuilder URIBuilder =  new StringBuilder();
    URIBuilder.append("http://ws.audioscrobbler.com/2.0/?method=user.gettopalbums&user=");
    URIBuilder.append(USER);
    URIBuilder.append("&api_key=");
    URIBuilder.append(API_KEY);
    URIBuilder.append("&limit=");
    URIBuilder.append(albumLimit);
    URIBuilder.append("&period=");
    URIBuilder.append(period);
    URIBuilder.append("&format=json");
    try {
      this.URI = new URI(URIBuilder.toString());
    } catch (URISyntaxException e) {
      System.out.println("Syntax error in URI for GetAlbumsAPICall");
    }
  }

  public String call() {
    try (HttpClient client = HttpClient.newHttpClient()) {
      HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();
      requestBuilder.uri(this.URI);
      requestBuilder.header("User-Agent", "NoLydvo/1.0");
      requestBuilder.GET();
      HttpRequest request = requestBuilder.build();
      HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
      return response.body();
    } catch (IOException | InterruptedException e) {
      e.printStackTrace();
    }
    return null;
  }
  public static void main(String[] args) throws IOException, InterruptedException {
    GetAlbumsAPICall test = new GetAlbumsAPICall("6", "7day");
    System.out.println(test.call());
  }
}
