package com.glenworsley.techtestQ2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.stereotype.Component;

@Component
public class AppInfoBuilder {

    private BuildProperties buildProperties;

    @Value("${git.commit.id}")
    private String commitId;

    public AppInfoBuilder(BuildProperties buildProperties) {
        this.buildProperties = buildProperties;
    }

    public AppInfo getAppInfo() {
        AppInfo appInfo = new AppInfo();
        appInfo.setVersion(buildProperties.getVersion());
        appInfo.setLastcommitsha(commitId);
        appInfo.setDescription("pre-interview technical test");
        return appInfo;
    }
}
