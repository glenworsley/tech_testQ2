package com.glenworsley.techtestQ2;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Simple REST style controller.
 * Only endpoint = "/info", and only allowed method = GET.
 */
@Component
@RequiredArgsConstructor
@RestController
public class MyAppController {

    private final AppInfoBuilder appInfoBuilder;

    @GetMapping("/info")
    public AppInfo getInfo() {
        return appInfoBuilder.getAppInfo();
    }

    public AppInfoBuilder getAppInfoBuilder() {
        return appInfoBuilder;
    }
}
