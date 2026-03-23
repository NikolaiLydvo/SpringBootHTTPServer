package edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing;

import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords.ArtistItem;
import edu.ntnu.nettsideprosjekt.httpserver.model.topArtists.writing.GetArtistsRecords.GetArtistsResponse;

import java.io.*;


public class UkensArtisterCSVWriter {
  File file;
  public UkensArtisterCSVWriter(File file) {
    this.file = file;
  }
  public void write(GetArtistsResponse body) {
    try (FileWriter fw = new FileWriter(this.file); BufferedWriter bufferedWriter = new BufferedWriter(fw)) {
      StringBuilder stringBuilder = new StringBuilder();
      for (ArtistItem a : body.getTopartists().getArtist()) {
        stringBuilder.append(a.getName());
        stringBuilder.append(";");
        stringBuilder.append(a.getUrl());
        stringBuilder.append("\n");
      }
      bufferedWriter.write(stringBuilder.toString());
    } catch  (IOException e) {
      System.out.println("error writing to file in UkensArtisterCSVWriter");
    }
    System.out.println("Success writing artists to file!");
  }
}
