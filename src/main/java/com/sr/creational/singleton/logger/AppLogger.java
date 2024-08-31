package com.sr.creational.singleton.logger;

import java.util.ArrayList;
import java.util.List;

public class AppLogger {
    private final List<String> logs;
    // Public constructor allows multiple instances
    public AppLogger() {
        logs = new ArrayList<>();
    }
    public void log(String message) {
        logs.add(message);
        System.out.println("Logged: " + message);
    }
    public void printLogCount() {
        System.out.println(logs.size() + " Logs");
    }
}
