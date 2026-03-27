package edu.ntnu.nettsideprosjekt.httpserver.controller.APIControllers.LastFM;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsAPICall;
import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsJSONParser;
import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords.GetArtistsResponse;
import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.UkensArtisterCSVWriter;

import java.io.File;

public class UpdateTopArtistsController {
  GetArtistsAPICall getArtistsAPICall;
  GetArtistsJSONParser getArtistsJSONParser;
  UkensArtisterCSVWriter ukensArtisterCSVWriter;
  public UpdateTopArtistsController() {
    this.getArtistsAPICall = new GetArtistsAPICall("8","7day");
    this.getArtistsJSONParser = new GetArtistsJSONParser();
    this.ukensArtisterCSVWriter = new UkensArtisterCSVWriter(new File("ukensArtister.csv"));
  }

  public void execute() {
    String APIResponse = getArtistsAPICall.call();
    GetArtistsResponse getArtistsResponse = getArtistsJSONParser.parse(APIResponse);
    ukensArtisterCSVWriter.write(getArtistsResponse);
  }
}
