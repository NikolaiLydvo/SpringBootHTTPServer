package edu.ntnu.nettsideprosjekt.httpserver.controller.APIControllers.LastFM;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.scheduling.annotation.Scheduled;

public class LastFMController {
  UpdateTopAlbumsController updateAlbums;
  UpdateTopArtistsController updateArtists;
  UpdateTopSongsController updateSongs;
  public LastFMController() {
    this.updateAlbums = new UpdateTopAlbumsController();
    this.updateArtists = new UpdateTopArtistsController();
    this.updateSongs = new UpdateTopSongsController();
  }

  public void update() {
    updateAlbums.execute();
    updateArtists.execute();
    updateSongs.execute();
  }

  public static void main(String[] args) {
    LastFMController lastFMController = new LastFMController();
    lastFMController.update();
  }
}
