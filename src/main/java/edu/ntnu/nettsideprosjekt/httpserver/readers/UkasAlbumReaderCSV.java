package edu.ntnu.nettsideprosjekt.httpserver.readers;
import edu.ntnu.nettsideprosjekt.httpserver.readers.storageClasses.UkasAlbumInfo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UkasAlbumReaderCSV {
  File csvFile;
  public UkasAlbumReaderCSV(File file) {
    this.csvFile = file;
  }
  public List<UkasAlbumInfo> read() {
    List<UkasAlbumInfo> list = new ArrayList<>();
    try (FileReader fileReader = new FileReader(this.csvFile); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      for (String s : bufferedReader.readAllLines()) {
        String [] info = s.split(",");
        list.add(new UkasAlbumInfo(info[0],info[1],info[2]));
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return list;
  }
}
