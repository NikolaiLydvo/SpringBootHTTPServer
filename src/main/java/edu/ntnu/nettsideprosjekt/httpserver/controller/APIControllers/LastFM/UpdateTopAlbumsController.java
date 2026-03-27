package edu.ntnu.nettsideprosjekt.httpserver.controller.APIControllers.LastFM;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.GetAlbumJSONParser;
import edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.GetAlbumsAPICall;
import edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.GetAlbumsRecords.*;
import edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.UkensAlbumCSVWriter;

import java.io.File;

public class UpdateTopAlbumsController {
  GetAlbumsAPICall getAlbumsAPICall;
  GetAlbumJSONParser getAlbumJSONParser;
  UkensAlbumCSVWriter ukensAlbumCSVWriter;
  public UpdateTopAlbumsController() {
    this.getAlbumsAPICall = new GetAlbumsAPICall("6","7day");
    this.getAlbumJSONParser = new GetAlbumJSONParser();
    this.ukensAlbumCSVWriter = new UkensAlbumCSVWriter(new File("/ukensAlbum.csv"));
  }

  public void execute() {
    String APIresponse = getAlbumsAPICall.call();
    GetAlbumsResponse getAlbumsResponse = getAlbumJSONParser.parse(APIresponse);
    ukensAlbumCSVWriter.write(getAlbumsResponse);
  }

}
