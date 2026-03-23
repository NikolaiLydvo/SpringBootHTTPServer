package edu.ntnu.nettsideprosjekt.httpserver.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import edu.ntnu.nettsideprosjekt.httpserver.controller.APIControllers.LastFM.LastFMController;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasksController {
  @Scheduled(cron = "0 0 0 * * 1")
  public void updateLastFMData() throws JsonProcessingException {
    LastFMController lastFMController = new LastFMController();
    lastFMController.update();
  }
}
