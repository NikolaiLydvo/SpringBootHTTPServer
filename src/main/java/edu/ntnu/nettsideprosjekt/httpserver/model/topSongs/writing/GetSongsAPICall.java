package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing;

import edu.ntnu.nettsideprosjekt.httpserver.model.APICalls.LastfmAPIcall;
import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsAPICall;

import java.net.URI;
import java.net.URISyntaxException;

public class GetSongsAPICall extends LastfmAPIcall{
  String limit;
  String period;

  public GetSongsAPICall(String limit, String period) {
    super();
    this.limit = limit;
    this.period = period;
  }
  public String call() {
    try {
      StringBuilder uriBuilder = new StringBuilder();
      uriBuilder.append("http://ws.audioscrobbler.com/2.0/?method=user.gettoptracks&user=");
      uriBuilder.append(super.getUSER());
      uriBuilder.append("&api_key=");
      uriBuilder.append(super.getAPI_KEY());
      uriBuilder.append("&limit=");
      uriBuilder.append(limit);
      uriBuilder.append("&period=");
      uriBuilder.append(period);
      uriBuilder.append("&format=json");
      return super.call(new URI(uriBuilder.toString()));

    } catch (URISyntaxException e) {
      System.out.println("URI Syntax error in GetSongsAPICall");
    }
    return null;
  }
}
