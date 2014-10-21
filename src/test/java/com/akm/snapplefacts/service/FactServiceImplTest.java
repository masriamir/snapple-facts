package com.akm.snapplefacts.service;

import com.akm.snapplefacts.dao.FactDAO;
import com.akm.snapplefacts.model.Fact;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

/**
 * Test class for FactService.
 * @author Amir Masri
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration("file:src/main/webapp/WEB-INF/mvc-dispatcher-servlet.xml")
//@Service
//public class FactServiceImplTest {
//
//    @Autowired
//    private FactDAO factDao;
//
//    @Test
//    public void getFactTest() throws IOException {
//        Fact fact = factDao.getFact();
//        Assert.assertNotNull(fact);
//        Assert.assertTrue(fact.getDetail() != null && !fact.getDetail().isEmpty());
//    }
//
//}
