package edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.GetAlbumsRecords.*;

public class GetAlbumJSONParser {
  public GetAlbumJSONParser() {

  }
  public GetAlbumsResponse parse(String response) throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    GetAlbumsAPICall request = new GetAlbumsAPICall("6","7day");
    GetAlbumsResponse parsed = mapper.readValue(request.call(),GetAlbumsResponse.class);
    return parsed;
  }
}
