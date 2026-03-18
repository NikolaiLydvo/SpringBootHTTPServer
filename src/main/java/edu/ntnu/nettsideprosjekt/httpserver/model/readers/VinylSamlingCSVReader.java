package edu.ntnu.nettsideprosjekt.httpserver.model.readers;

import edu.ntnu.nettsideprosjekt.httpserver.model.storageClasses.VinylAlbumInfo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VinylSamlingCSVReader {
  File csvFile;

  public VinylSamlingCSVReader(File csvFile) {
    this.csvFile = csvFile;
  }

  public List<VinylAlbumInfo> read() {
    List<VinylAlbumInfo> list = new ArrayList<VinylAlbumInfo>();
    try (BufferedReader bufferedReader = new BufferedReader(new FileReader(csvFile))) {
      for (String s : bufferedReader.readAllLines()) {
        String[] split = s.split(";");
        list.add(new VinylAlbumInfo(split[0], split[1], split[2], split[3]));
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
    return list;
  }
}
