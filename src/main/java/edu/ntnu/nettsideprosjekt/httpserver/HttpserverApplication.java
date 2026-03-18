package edu.ntnu.nettsideprosjekt.httpserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HttpserverApplication {

  public static void main(String[] args) {
    SpringApplication.run(HttpserverApplication.class, args);
  }

}
