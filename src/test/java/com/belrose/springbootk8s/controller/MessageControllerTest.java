package com.belrose.springbootk8s.controller;


import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // fix to execute  file as cycle
public class MessageControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Test
    void displayMessage_ReturnString() throws Exception {
        this.mockMvc
                .perform(get("/api/v1/message"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Congratulation you successfully deployed your application to kubernetes")));

    }
}
