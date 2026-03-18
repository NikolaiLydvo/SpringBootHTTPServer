package edu.ntnu.nettsideprosjekt.httpserver.model.readers;

import edu.ntnu.nettsideprosjekt.httpserver.model.storageClasses.UkensArtisterInfo;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class UkensArtisterCSVReader {
  File csvFile;
  public UkensArtisterCSVReader(File csvFile) {
    this.csvFile = csvFile;
  }
  public List<UkensArtisterInfo> read() {
    ArrayList<UkensArtisterInfo> ukensArtisterInfoList = new ArrayList<>();
    try (FileReader fileReader = new FileReader(this.csvFile); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      for(String s : bufferedReader.readAllLines()) {
        String[] info = s.split(";");
        ukensArtisterInfoList.add(new UkensArtisterInfo(info[0],info[1]));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ukensArtisterInfoList;
  }
}
