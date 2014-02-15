package com.akm.snapplefacts.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for Util.
 * @author Amir Masri
 */
public class UtilTest {

    @Test
    public void getRandomIdTest() {
        Integer id = Util.getRandomId();
        Assert.assertTrue(id.compareTo(0) > 0);
        Assert.assertTrue(id.compareTo(989) <= 0);
        Assert.assertTrue(id.compareTo(497) <= 0 || id.compareTo(651) >= 0);
    }

}
