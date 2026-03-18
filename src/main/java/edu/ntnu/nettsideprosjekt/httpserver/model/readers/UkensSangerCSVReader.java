package edu.ntnu.nettsideprosjekt.httpserver.model.readers;

import edu.ntnu.nettsideprosjekt.httpserver.model.storageClasses.UkensSangerInfo;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class UkensSangerCSVReader {
  File csvFile;
  public UkensSangerCSVReader(File csvFile) {
    this.csvFile = csvFile;
  }
  public List<UkensSangerInfo> read() {
    List<UkensSangerInfo> ukensSangerInfoList = new ArrayList<>();
    try (FileReader fileReader = new FileReader(this.csvFile); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      for (String s : bufferedReader.readAllLines()) {
        String[] info = s.split(";");
        ukensSangerInfoList.add(new UkensSangerInfo(info[0], info[1], info[2], info[3]));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ukensSangerInfoList;
  }
}
