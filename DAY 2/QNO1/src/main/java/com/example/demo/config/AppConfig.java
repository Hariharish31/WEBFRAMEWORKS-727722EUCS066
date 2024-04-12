package com.example.demo.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Value("${app.name}")
    private static String appName;

    @Value("${app.version}")
    private static String appVersion;

    public AppConfig(@Value("${app.name}") String appName, @Value("${app.version}") String appVersion) {
        AppConfig.appName = appName;
        AppConfig.appVersion = appVersion;
    }

    public static String getAppName() {
        return appName;
    }

    public static String getAppVersion() {
        return appVersion;
    }

    public void setAppName(String appName) {
        AppConfig.appName = appName;
    }

    public void setAppVersion(String appVersion) {
        AppConfig.appVersion = appVersion;
    }
}
