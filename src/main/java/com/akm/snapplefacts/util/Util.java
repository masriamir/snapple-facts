package com.akm.snapplefacts.util;

import java.util.Random;

/**
 * Util is a helper class.
 * @author Amir Masri
 */
public class Util {

    /**
     * Base url for a Snapple Real Fact.
     * Append any number to the end of the url to get that fact number.
     */
    public static final String BASE_URL = "http://www.snapple.com/real-facts/cap-view/";

    /**
     * Div tag selector used to parse the fact detail.
     */
    public static final String SELECTOR = "div.fact_text_wrap";

    /**
     * Generates a random, valid id to use when fetching a fact.
     * @return the generated id
     */
    public static int getRandomId() {
        Random rand = new Random();
        int id = rand.nextInt(989) + 1;

        // Fact numbers 498 through 650 no longer exist on Snapple's website
        // Make sure to get a new random number if it falls within this range
        while (id > 497 && id < 651) {
            id = rand.nextInt(989) + 1;
        }

        return id;
    }

}
