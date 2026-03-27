package edu.ntnu.nettsideprosjekt.httpserver.model.topAlbums.reading;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UkensAlbumReaderCSV {
  File csvFile;
  public UkensAlbumReaderCSV(File file) {
    this.csvFile = file;
  }
  public List<UkensAlbumInfo> read() {
    List<UkensAlbumInfo> list = new ArrayList<>();
    try (FileReader fileReader = new FileReader(this.csvFile); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      for (String s : bufferedReader.readAllLines()) {
        String [] info = s.split(";");
        list.add(new UkensAlbumInfo(info[0],info[1],info[2]));
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return list;
  }
}
