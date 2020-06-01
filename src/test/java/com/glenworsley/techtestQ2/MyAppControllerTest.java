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

        AppInfo info = new AppInfo();
        info.setVersion("3.1");
        when(appInfoBuilder.getAppInfo()).thenReturn(info);
        this.mockMvc.perform(get("/info"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.myapplication.version").value("3.1"));
                //.andExpect(jsonPath("$[0].id").value(1))
                //.andExpect(jsonPath("$[1].id").value(2));;
    }
}