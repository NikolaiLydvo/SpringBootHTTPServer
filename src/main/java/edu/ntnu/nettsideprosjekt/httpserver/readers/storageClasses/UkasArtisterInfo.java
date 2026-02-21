package edu.ntnu.nettsideprosjekt.httpserver.readers.storageClasses;

public class UkasArtisterInfo {
  private final String artistName;
  private final String artistURL;
  public UkasArtisterInfo(String artistName, String artistURL) {
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
