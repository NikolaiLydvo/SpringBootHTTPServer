package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords.GetArtistsResponse;

public class GetArtistsJSONParser {
  public GetArtistsJSONParser() {

  }
  public GetArtistsResponse parse(String response) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    GetArtistsAPICall request = new GetArtistsAPICall("6","7day");
    GetArtistsResponse parsed = mapper.readValue(request.call(), GetArtistsResponse.class);
    return parsed;
  }
}
