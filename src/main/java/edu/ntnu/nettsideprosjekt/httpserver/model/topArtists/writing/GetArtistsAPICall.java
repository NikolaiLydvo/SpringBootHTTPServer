package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing;

import edu.ntnu.nettsideprosjekt.httpserver.model.APICalls.LastfmAPIcall;

import java.net.URI;
import java.net.URISyntaxException;

public class GetArtistsAPICall extends LastfmAPIcall {
  String artistLimit;
  String period;

  public GetArtistsAPICall(String artistLimit, String period) {
    super();
    this.artistLimit = artistLimit;
    this.period = period;
  }

  public String call() {
    try {
      StringBuilder uriBuilder = new StringBuilder();
      uriBuilder.append("http://ws.audioscrobbler.com/2.0/?method=user.gettopartists&user=");
      uriBuilder.append(super.getUSER());
      uriBuilder.append("&api_key=");
      uriBuilder.append(super.getAPI_KEY());
      uriBuilder.append("&limit=");
      uriBuilder.append(artistLimit);
      uriBuilder.append("&period=");
      uriBuilder.append(period);
      uriBuilder.append("&format=json");
      return super.call(new URI(uriBuilder.toString()));
    } catch (URISyntaxException e) {
      System.out.println("URISyntaxException for GetArtistsAPICall");
    }
    return null;
  }
}