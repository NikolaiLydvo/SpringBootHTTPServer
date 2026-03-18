package edu.ntnu.nettsideprosjekt.httpserver.model.APICalls;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class LastfmAPIcall {
  String USER;
  String API_KEY;
  File credentials = new File("src/main/resources/LastFMcredentials.csv");

  public LastfmAPIcall() {
    try (FileReader fr = new FileReader(credentials); BufferedReader bufferedReader = new BufferedReader(fr)) {
      String[] line = bufferedReader.readLine().split(",");
      this.API_KEY = line[0];
      this.USER = line[1];
    } catch (IOException e) {
      System.out.println("Failed to initialize credentials for API request: GetAlbumsAPICall");
    }
  }

  public String call(URI uri) {
    try (HttpClient client = HttpClient.newHttpClient()) {
      HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();
      requestBuilder.uri(uri);
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

  public String getAPI_KEY() {
    return API_KEY;
  }
  public String getUSER() {
    return USER;
  }
}
