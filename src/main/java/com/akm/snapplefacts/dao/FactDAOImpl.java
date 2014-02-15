package com.akm.snapplefacts.dao;

import com.akm.snapplefacts.model.Fact;
import com.akm.snapplefacts.util.Util;
import org.jsoup.Jsoup;
import org.springframework.stereotype.Repository;

import java.io.IOException;

/**
 * FactDAO implementation class.
 * @author Amir Masri
 */
@Repository
public class FactDAOImpl implements FactDAO {

    /**
     * Parses a fact from the Snapple website.
     * @return the fact object
     * @throws IOException
     */
    @Override
    public Fact getFact() throws IOException {
        int id = Util.getRandomId();
        String detail = Jsoup.connect(Util.BASE_URL + id).get().select(Util.SELECTOR).first().text();

        return new Fact(id, detail);
    }

}
