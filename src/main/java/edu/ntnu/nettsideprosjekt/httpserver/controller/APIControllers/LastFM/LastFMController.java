package edu.ntnu.nettsideprosjekt.httpserver.controller.APIControllers.LastFM;

import com.fasterxml.jackson.core.JsonProcessingException;

public class LastFMController {
  UpdateTopAlbumsController updateAlbums;
  UpdateTopArtistsController updateArtists;
  public LastFMController() {
    this.updateAlbums = new UpdateTopAlbumsController();
    this.updateArtists = new UpdateTopArtistsController();
  }

  public void update() throws JsonProcessingException {
    updateAlbums.execute();
    updateArtists.execute();
  }

  public static void main(String[] args) throws JsonProcessingException {
    LastFMController lastFMController = new LastFMController();
    lastFMController.update();
  }
}
