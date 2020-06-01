package com.glenworsley.techtestQ2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.info.BuildProperties;
import org.springframework.test.context.TestPropertySource;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AppInfoBuilderTest {

    @Mock
    private BuildProperties buildProperties;

    @InjectMocks
    private AppInfoBuilder appInfoBuilder;

    @Test
    void getAppInfo() {

        String version = "4.1";
        when(buildProperties.getVersion()).thenReturn(version);
        AppInfo result = appInfoBuilder.getAppInfo();
        assertThat(result.getVersion(), is(equalTo(version)));
        assertThat(result.getDescription(), is(equalTo("pre-interview technical test")));

    }
}