package edu.ntnu.nettsideprosjekt.httpserver.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.ntnu.nettsideprosjekt.httpserver.model.APIcallers.GetAlbumsAPICall;
import edu.ntnu.nettsideprosjekt.httpserver.model.JSONParsers.GetAlbumJSONParser;
import edu.ntnu.nettsideprosjekt.httpserver.model.JSONParsers.GetAlbumsRecords.GetAlbumsResponse;
import edu.ntnu.nettsideprosjekt.httpserver.model.writers.UkensAlbumCSVWriter;

import java.io.File;

public class LastfmAPIController {
  GetAlbumsAPICall getAlbumsAPICall;
  GetAlbumJSONParser getAlbumJSONParser;
  UkensAlbumCSVWriter ukensAlbumCSVWriter;
  public LastfmAPIController() {
    this.getAlbumsAPICall = new GetAlbumsAPICall("6","7day");
    this.getAlbumJSONParser = new GetAlbumJSONParser();
    this.ukensAlbumCSVWriter = new UkensAlbumCSVWriter(new File("src/main/resources/ukensAlbum.csv"));
  }

  public void execute() throws JsonProcessingException {
    String APIresponse = getAlbumsAPICall.call();
    GetAlbumsResponse getAlbumsResponse = getAlbumJSONParser.parse(APIresponse);
    ukensAlbumCSVWriter.write(getAlbumsResponse);
  }

  static void main(String[] args) throws JsonProcessingException {
    LastfmAPIController lastfmAPIController = new LastfmAPIController();
    lastfmAPIController.execute();
  }
}
