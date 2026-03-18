package edu.ntnu.nettsideprosjekt.httpserver.controller;

import edu.ntnu.nettsideprosjekt.httpserver.model.readers.UkensAlbumReaderCSV;
import edu.ntnu.nettsideprosjekt.httpserver.model.readers.UkensArtisterCSVReader;
import edu.ntnu.nettsideprosjekt.httpserver.model.readers.UkensSangerCSVReader;
import edu.ntnu.nettsideprosjekt.httpserver.model.readers.VinylSamlingCSVReader;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("/vinylSamling")
  public String vinylSamling(Model model) {
    File csvfile = new File("vinylSamling.csv");
    VinylSamlingCSVReader test = new VinylSamlingCSVReader(csvfile);
    model.addAttribute("albums", test.read());
    return "vinylSamling";
  }
  @GetMapping("/ukasAlbum")
  public String ukasAlbum(Model model) {
    File csvFile = new File("ukasAlbum.csv");
    UkensAlbumReaderCSV reader =  new UkensAlbumReaderCSV(csvFile);
    model.addAttribute("albums", reader.read());
    return "ukasAlbum";
  }
  @GetMapping("ukensMusikk")
  public String ukasMusikk(Model model) {
    File ukensAlbumCsvFile = new File("ukensAlbum.csv");
    File ukensArtisterCsvFile = new File("ukensArtister.csv");
    File ukensSangerCsvFile = new File("ukensSanger.csv");

    UkensAlbumReaderCSV albumReader = new UkensAlbumReaderCSV(ukensAlbumCsvFile);
    UkensArtisterCSVReader artistReader = new UkensArtisterCSVReader(ukensArtisterCsvFile);
    UkensSangerCSVReader songReader = new UkensSangerCSVReader(ukensSangerCsvFile);

    model.addAttribute("albums", albumReader.read());
    model.addAttribute("artists", artistReader.read());
    model.addAttribute("songs", songReader.read());

    return "ukensMusikk";
  }

  @GetMapping("/hangman")
  public String hangman(Model model) {
    return "hangman";
  }

  @GetMapping("/flappyBird")
  public String flappyBird(Model model) {
    return "flappyBird";
  }
}
