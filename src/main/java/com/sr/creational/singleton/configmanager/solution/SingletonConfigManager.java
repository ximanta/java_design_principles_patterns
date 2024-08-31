package com.sr.creational.singleton.configmanager.solution;

import java.util.Properties;

public class SingletonConfigManager {
    private static volatile SingletonConfigManager instance;
    private final Properties configProperties;

    private SingletonConfigManager() {
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
        configProperties = new Properties();
        loadDefaultConfig();
    }

    public static SingletonConfigManager getInstance() {
        if (instance == null) {
            synchronized (SingletonConfigManager.class) {
                if (instance == null) {
                    instance = new SingletonConfigManager();
                }
            }
        }
        return instance;
    }

    private void loadDefaultConfig() {
        configProperties.setProperty("appName", "MyApplication");
        configProperties.setProperty("version", "1.0.0");
        configProperties.setProperty("defaultLanguage", "en");
    }
    public String getConfigValue(String key) {
        return configProperties.getProperty(key);
    }
    public void setConfigValue(String key, String value) {
        configProperties.setProperty(key, value);
    }
   public int getConfigSize() {
        return configProperties.size();
    }


}
