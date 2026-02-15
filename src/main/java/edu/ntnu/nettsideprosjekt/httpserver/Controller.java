package edu.ntnu.nettsideprosjekt.httpserver;

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
    UkasAlbumReaderCSV reader =  new UkasAlbumReaderCSV(csvFile);
    model.addAttribute("albums", reader.read());
    return "ukasAlbum";
  }
}
