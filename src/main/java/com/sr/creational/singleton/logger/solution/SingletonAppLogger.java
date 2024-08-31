package com.sr.creational.singleton.logger.solution;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SingletonAppLogger {
    /*Declaring instance as volatile ensures that changes made to the instance variable
     by one thread are immediately visible to all other threads.
     */

        private static volatile SingletonAppLogger instance;
        private List<String> logs;

        // Private constructor to restrict instantiation
        private SingletonAppLogger() {
            /*
            Safeguard against reflection-based attacks.
            Reflection can be used to bypass the private constructor's access control,
            potentially creating a second instance of the Singleton class
             */
            if (instance != null) {
                throw new IllegalStateException("Already initialized.");
            }
            logs = new CopyOnWriteArrayList<>();
        }
        // Double-checked locking to make it thread-safe
        public static SingletonAppLogger getInstance() {
           /* First Check (Outside the synchronized block):
           This is a quick check to see if the instance has already been created.
           If the instance is not null, it can return immediately without locking,
           which improves performance by avoiding unnecessary synchronization.
            */
            if (instance == null) {
                synchronized (SingletonAppLogger.class) {
                   /* Second Check (Inside the synchronized block):
                    This is necessary because multiple threads could pass the first check simultaneously.
                    Once inside the synchronized block, it checks again to ensure that the instance hasn't been created by another thread while the current thread was waiting for the lock.
                    */
                    if (instance == null) {
                        instance = new SingletonAppLogger();
                    }
                }
            }
            return instance;
        }
        public void log(String message) {
                logs.add(message);
                System.out.println("DEBUG: " + message);
            }

        public void printLogCount() {
                System.out.println(logs.size() + " Logs");

        }
    public int getLogCount() {
        return logs.size();
    }


}

