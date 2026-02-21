package edu.ntnu.nettsideprosjekt.httpserver.readers;

import edu.ntnu.nettsideprosjekt.httpserver.readers.storageClasses.UkasArtisterInfo;

import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class UkasArtisterCSVReader {
  File csvFile;
  public UkasArtisterCSVReader(File csvFile) {
    this.csvFile = csvFile;
  }
  public List<UkasArtisterInfo> read() {
    ArrayList<UkasArtisterInfo> ukasArtisterInfoList = new ArrayList<>();
    try (FileReader fileReader = new FileReader(this.csvFile); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
      for(String s : bufferedReader.readAllLines()) {
        String[] info = s.split(",");
        ukasArtisterInfoList.add(new UkasArtisterInfo(info[0],info[1]));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return ukasArtisterInfoList;
  }
}
