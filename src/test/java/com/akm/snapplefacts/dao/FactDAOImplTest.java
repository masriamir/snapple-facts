package com.akm.snapplefacts.dao;

import com.akm.snapplefacts.util.Util;
import org.jsoup.Jsoup;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Test class for FactDAO.
 * @author Amir Masri
 */
public class FactDAOImplTest {

    @Test
    public void getFactTest() throws IOException {
        String detail = Jsoup.connect(Util.BASE_URL + "300").get().select(Util.SELECTOR).first().text();
        Assert.assertTrue(detail != null && !detail.isEmpty());
    }

}
