package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.reading;

public class UkensArtisterInfo {
  private final String artistName;
  private final String artistURL;
  public UkensArtisterInfo(String artistName, String artistURL) {
    this.artistName = artistName;
    this.artistURL = artistURL;
  }
  public String getArtistName() {
    return this.artistName;
  }
  public String getArtistURL(){
    return this.artistURL;
  }
}
