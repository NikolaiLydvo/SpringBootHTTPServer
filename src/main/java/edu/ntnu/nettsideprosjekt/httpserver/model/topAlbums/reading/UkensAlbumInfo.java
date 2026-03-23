package edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.reading;

public class UkensAlbumInfo {
  private final String artist;
  private final String albumName;
  private final String imageURL;
  public UkensAlbumInfo(String artist, String albumName, String imageURL) {
    this.artist = artist;
    this.albumName = albumName;
    this.imageURL = imageURL;
  }
  @Override
  public String toString() {
    return "artist: " + artist + "\n albumName: " + albumName + "\n imageURL: " + imageURL;
  }
  public String getArtist() {
    return artist;
  }
  public String getAlbumName() {
    return albumName;
  }
  public String getImageURL() {
    return imageURL;
  }
}
