package com.sr.creational.singleton.logger;

public class LoggerClient {
    public static void main(String[] args) {
    AppLogger appLogger1 =new AppLogger();
    AppLogger appLogger2 =new AppLogger();
    appLogger1.log("Starting the Application");
    appLogger1.printLogCount();

    appLogger2.log("Application is running");
    appLogger2.printLogCount();
    }
}
