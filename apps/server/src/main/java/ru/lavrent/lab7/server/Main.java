package ru.lavrent.lab7.server;

import ru.lavrent.lab7.server.managers.RuntimeManager;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    try {
      RuntimeManager runtimeManager = new RuntimeManager();
      runtimeManager.run();
    } catch (IOException e) {
      RuntimeManager.logger.severe("io exception in main: " + e.getMessage());
    }
  }
}
