package edu.ntnu.nettsideprosjekt.httpserver.controller.APIControllers.LastFM;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsAPICall;
import edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsJSONParser;
import edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords.GetSongsResponse;
import edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.UkensSangerCSVWriter;

import java.io.File;

public class UpdateTopSongsController {
  GetSongsAPICall getSongsAPICall;
  GetSongsJSONParser getSongsJSONParser;
  UkensSangerCSVWriter ukensSangerCSVWriter;
  public UpdateTopSongsController(){
    this.getSongsAPICall = new GetSongsAPICall("6", "7day");
    this.getSongsJSONParser = new GetSongsJSONParser();
    this.ukensSangerCSVWriter = new UkensSangerCSVWriter(new File("ukensSanger.csv"));
  }

  public void execute() throws JsonProcessingException {
    String APIResponse = getSongsAPICall.call();
    GetSongsResponse getSongsResponse = getSongsJSONParser.parse(APIResponse);
    ukensSangerCSVWriter.write(getSongsResponse);
  }
}
