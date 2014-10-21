package com.akm.snapplefacts.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * Test class for FactController.
 * @author Amir Masri
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
//public class FactControllerTest {
//
//    private MockMvc mockMvc;
//
//    @SuppressWarnings("SpringJavaAutowiringInspection")
//    @Autowired
//    protected WebApplicationContext wac;
//
//    @Before
//    public void setUp() {
//        this.mockMvc = webAppContextSetup(this.wac).build();
//    }
//
//    @Test
//    public void homeTest() throws Exception {
//        mockMvc.perform(get("/"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("home"));
//    }
//
//    @Test
//    public void getFactTest() throws Exception {
//        mockMvc.perform(get("/fact"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("fact"));
//    }
//
//}
