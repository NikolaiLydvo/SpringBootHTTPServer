package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs;

public class UkensSangerInfo {
  private final String rank;
  private final String artistName;
  private final String trackName;
  private final String playcount;
  public UkensSangerInfo(String rank, String artistName, String trackName, String playcount) {
    this.rank = rank;
    this.artistName = artistName;
    this.trackName = trackName;
    this.playcount = playcount;
  }
  public String getRank() {
    return this.rank;
  }
  public String getArtistName() {
    return this.artistName;
  }
  public String getTrackName() {
    return this.trackName;
  }
  public String getPlaycount() {
    return this.playcount;
  }
}
