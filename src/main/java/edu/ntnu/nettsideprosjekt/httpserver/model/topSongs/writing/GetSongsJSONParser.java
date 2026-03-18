package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords.*;

public class GetSongsJSONParser {
  public GetSongsJSONParser() {

  }
  public GetSongsResponse parse(String response) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    GetSongsAPICall request = new GetSongsAPICall("6","7day");
    GetSongsResponse parsed = mapper.readValue(request.call(), GetSongsResponse.class);
    return parsed;
  }
}
