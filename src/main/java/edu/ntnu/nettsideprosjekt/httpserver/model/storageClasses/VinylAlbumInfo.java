package edu.ntnu.nettsideprosjekt.httpserver.model.storageClasses;

public class VinylAlbumInfo {
  private final String imageURL;
  private final String title;
  private final String artist;
  private final String discogsURL;

  public VinylAlbumInfo(String title, String artist, String imageURL, String discogsURL) {
    this.title = title;
    this.artist = artist;
    this.imageURL = imageURL;
    this.discogsURL = discogsURL;
  }
  public String getTitle() {
    return title;
  }
  public String getArtist() {
    return artist;
  }
  public String getDiscogsURL() {
    return discogsURL;
  }
  public String getImageURL() {
    return imageURL;
  }
}
