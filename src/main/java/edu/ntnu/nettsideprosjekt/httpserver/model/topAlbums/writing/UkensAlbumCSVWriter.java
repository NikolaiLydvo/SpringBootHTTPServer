package edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing;

import edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.writing.GetAlbumsRecords.*;

import java.io.*;

public class UkensAlbumCSVWriter {
  File file;
  public UkensAlbumCSVWriter(File file) {
    this.file = file;
  }

  public void write(GetAlbumsResponse body) {
    try (FileWriter fw = new FileWriter(this.file); BufferedWriter bufferedWriter = new BufferedWriter(fw)) {
      StringBuilder stringBuilder = new StringBuilder();
      for (AlbumItem a : body.getTopalbums().getAlbum()) {
        stringBuilder.append(a.getName());
        stringBuilder.append(";");
        stringBuilder.append(a.getArtist().getName());
        stringBuilder.append(";");
        stringBuilder.append(a.getImage().getLast().getText());
        stringBuilder.append("\n");
      }
      bufferedWriter.write(stringBuilder.toString());
    } catch (IOException e) {
      System.out.println("error writing to file");
    }
    System.out.println("Success writing albums to file!");
  }

}
