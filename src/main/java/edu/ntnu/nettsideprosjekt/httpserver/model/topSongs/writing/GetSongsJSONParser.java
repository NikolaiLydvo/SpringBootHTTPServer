package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords.*;

public class GetSongsJSONParser {
  public GetSongsJSONParser() {

  }
  public GetSongsResponse parse(String response) {
    try {
      ObjectMapper mapper = new ObjectMapper();
      GetSongsResponse parsed = mapper.readValue(response, GetSongsResponse.class);
      return parsed;
    } catch  (JsonProcessingException e) {
      System.out.println(e.getMessage());
    }
    return null;
  }
}
