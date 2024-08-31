package com.sr.creational.singleton.configmanager.solution;

import java.lang.reflect.Constructor;

public class SingletonConfigManagerClient {

    public static void main(String[] args) throws Exception {
        SingletonConfigManager configManager = SingletonConfigManager.getInstance();
        configManager.setConfigValue("build", "B36");
        System.out.println(configManager.getConfigValue("appName"));
        System.out.println(configManager.getConfigValue("version"));
        System.out.println(configManager.getConfigValue("defaultLanguage"));
        System.out.println(configManager.getConfigValue("build"));
        SingletonConfigManager configManagerClone = SingletonConfigManager.getInstance();
        System.out.println(configManager==configManagerClone);
        System.out.println(configManager.getConfigSize());
    }
}
