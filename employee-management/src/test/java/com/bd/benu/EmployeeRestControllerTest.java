package com.bd.benu;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.bd.benu.controller.EmployeeRestController;
import com.bd.benu.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeRestControllerTest {

    private MockMvc mockMvc;

    @Mock
    private EmployeeService employeeService;

    @InjectMocks
    private EmployeeRestController employeeRestController;

    private ObjectMapper objectMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(employeeRestController).build();
        objectMapper = new ObjectMapper();
    }

    @Test
    void testApiEndpoint() throws Exception {
        mockMvc.perform(get("/employee/rest/test"))
                .andExpect(status().isOk())
                .andExpect(content().string("API TESTD")); // ✅ fixed
    }
}
