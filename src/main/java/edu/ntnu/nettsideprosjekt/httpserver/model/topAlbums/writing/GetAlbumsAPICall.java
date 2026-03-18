package edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing;

import edu.ntnu.nettsideprosjekt.httpserver.model.APICalls.LastfmAPIcall;

import java.net.URI;
import java.net.URISyntaxException;

public class GetAlbumsAPICall extends LastfmAPIcall {
  String albumLimit;
  String period;

  public GetAlbumsAPICall(String albumLimit, String period) {
    super();
    this.albumLimit = albumLimit;
    this.period = period;
  }

  public String call() {
    try {
      StringBuilder URIBuilder = new StringBuilder();
      URIBuilder.append("http://ws.audioscrobbler.com/2.0/?method=user.gettopalbums&user=");
      URIBuilder.append(super.getUSER());
      URIBuilder.append("&api_key=");
      URIBuilder.append(super.getAPI_KEY());
      URIBuilder.append("&limit=");
      URIBuilder.append(albumLimit);
      URIBuilder.append("&period=");
      URIBuilder.append(period);
      URIBuilder.append("&format=json");
      return super.call(new URI(URIBuilder.toString()));
    } catch (URISyntaxException e) {
      System.out.println("URISyntaxException for GetArtistsAPICall");
    }
    return null;
  }
}
