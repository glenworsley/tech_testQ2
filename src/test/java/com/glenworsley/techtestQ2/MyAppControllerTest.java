package com.glenworsley.techtestQ2;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class MyAppControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AppInfoBuilder appInfoBuilder;

    @Test
    void getInfo() throws Exception {

        final String version = "3.1";
        final String description = "this is a test";
        final String lastcommitsha = "abcde12345";

        AppInfo info = new AppInfo();
        info.setVersion(version);
        info.setDescription(description);
        info.setLastcommitsha(lastcommitsha);
        when(appInfoBuilder.getAppInfo()).thenReturn(info);

        this.mockMvc.perform(get("/info"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.myapplication.version").value(version))
                .andExpect(jsonPath("$.myapplication.description").value(description))
                .andExpect(jsonPath("$.myapplication.lastcommitsha").value(lastcommitsha));
    }
}