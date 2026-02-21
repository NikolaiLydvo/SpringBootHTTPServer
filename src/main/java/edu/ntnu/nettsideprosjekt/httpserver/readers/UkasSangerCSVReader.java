package edu.ntnu.nettsideprosjekt.httpserver.readers;

import edu.ntnu.nettsideprosjekt.httpserver.readers.storageClasses.UkasAlbumInfo;
import edu.ntnu.nettsideprosjekt.httpserver.readers.storageClasses.UkasSangerInfo;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class UkasSangerCSVReader {
  File csvFile;
  public UkasSangerCSVReader(File csvFile) {
    this.csvFile = csvFile;
  }
  public List<UkasSangerInfo> read() {
    List<UkasSangerInfo> ukasSangerInfoList = new ArrayList<>();
    try (FileReader fileReader = new FileReader(this.csvFile); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      for (String s : bufferedReader.readAllLines()) {
        String[] info = s.split(",");
        ukasSangerInfoList.add(new UkasSangerInfo(info[0], info[1], info[2], info[3]));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ukasSangerInfoList;
  }
}
