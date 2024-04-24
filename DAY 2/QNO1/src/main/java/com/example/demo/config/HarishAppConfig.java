package com.example.demo.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HarishAppConfig {

    @Value("${app.name}")
    private static String appName;

    @Value("${app.version}")
    private static String appVersion;

    public HarishAppConfig(@Value("${app.name}") String appName, @Value("${app.version}") String appVersion) {
        HarishAppConfig.appName = appName;
        HarishAppConfig.appVersion = appVersion;
    }

    public static String getAppName() {
        return appName;
    }

    public static String getAppVersion() {
        return appVersion;
    }

    public void setAppName(String appName) {
        HarishAppConfig.appName = appName;
    }

    public void setAppVersion(String appVersion) {
        HarishAppConfig.appVersion = appVersion;
    }
}
