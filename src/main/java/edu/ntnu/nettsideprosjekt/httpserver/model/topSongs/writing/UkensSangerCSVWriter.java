package edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing;

import edu.ntnu.nettsideprosjekt.httpserver.model.topSongs.writing.GetSongsRecords.*;

import java.io.*;

public class UkensSangerCSVWriter {
  File file;
  public UkensSangerCSVWriter(File file) {
    this.file = file;
  }
  public void write(GetSongsResponse body) {
    try (FileWriter fw = new FileWriter(this.file); BufferedWriter bufferedWriter = new BufferedWriter(fw)) {
      StringBuilder builder = new StringBuilder();
      for (TrackItem t : body.getToptracks().getTrack()) {
        builder.append(t.getAttr().getRank());
        builder.append(";");
        builder.append(t.getArtist().getName());
        builder.append(";");
        builder.append(t.getName());
        builder.append(";");
        builder.append("Avspillinger: ");
        builder.append(t.getPlaycount());
        builder.append("\n");
      }
      bufferedWriter.write(builder.toString());
    } catch (IOException e) {
      System.out.println("Error writing to file in UkensSangerCSVWriter");
    }
    System.out.println("Success writing songs to file!");
  }
}
