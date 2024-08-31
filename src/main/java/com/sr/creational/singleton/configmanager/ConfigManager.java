package com.sr.creational.singleton.configmanager;
import java.util.Properties;

    public class ConfigManager {
        private Properties configProperties;
        public ConfigManager() {
            configProperties = new Properties();
            loadDefaultConfig();
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


