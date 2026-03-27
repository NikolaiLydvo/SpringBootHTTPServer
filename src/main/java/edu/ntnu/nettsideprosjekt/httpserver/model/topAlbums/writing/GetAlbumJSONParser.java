package edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.GetAlbumsRecords.*;

public class GetAlbumJSONParser {
  public GetAlbumJSONParser() {

  }
  public GetAlbumsResponse parse(String response) {
    try {
      ObjectMapper mapper = new ObjectMapper();
      GetAlbumsResponse parsed = mapper.readValue(response, GetAlbumsResponse.class);
      return parsed;
    } catch (JsonProcessingException e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
}
