package com.sr.creational.singleton.logger.solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LoggerClient {
    public static void main(String[] args) throws Exception {
    SingletonAppLogger appLogger1 = SingletonAppLogger.getInstance();
    SingletonAppLogger appLogger2 = SingletonAppLogger.getInstance();
    appLogger1.log("Starting the Application");
    appLogger1.printLogCount();

    appLogger2.log("Application is running");
    appLogger2.printLogCount();
    System.out.println(appLogger1 == appLogger2);
    SingletonAppLogger hackLogger = hackLogger();
    System.out.println(appLogger1 == hackLogger);

    }

    private static SingletonAppLogger hackLogger() throws Exception {
        Constructor<SingletonAppLogger> constructor = SingletonAppLogger.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonAppLogger hackedInstance = constructor.newInstance();
        return hackedInstance;
    }
}
