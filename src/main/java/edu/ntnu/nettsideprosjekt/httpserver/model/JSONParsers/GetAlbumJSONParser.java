package edu.ntnu.nettsideprosjekt.httpserver.model.JSONParsers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ntnu.nettsideprosjekt.httpserver.model.APIcallers.GetAlbumsAPICall;
import edu.ntnu.nettsideprosjekt.httpserver.model.JSONParsers.GetAlbumsRecords.*;

import java.net.http.HttpResponse;

public class GetAlbumJSONParser {
  public GetAlbumJSONParser() {

  }
  public GetAlbumsResponse parse(String response) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    GetAlbumsAPICall request = new GetAlbumsAPICall("6","7day");
    GetAlbumsResponse parsed = mapper.readValue(request.call(),GetAlbumsResponse.class);
    return parsed;
  }

  static void main (String[] args) throws JsonProcessingException {
    GetAlbumJSONParser test = new GetAlbumJSONParser();
    GetAlbumsAPICall request = new GetAlbumsAPICall("6","7day");
    GetAlbumsResponse parsed = test.parse(request.call());
    for (AlbumItem a : parsed.getTopalbums().getAlbum()) {
      System.out.println(a.getArtist().getName());
      System.out.println(a.getName());
      System.out.println(a.getUrl());
    }
  }
}
