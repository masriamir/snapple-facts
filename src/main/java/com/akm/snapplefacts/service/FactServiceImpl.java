package com.akm.snapplefacts.service;

import com.akm.snapplefacts.dao.FactDAO;
import com.akm.snapplefacts.model.Fact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * FactService implementation class.
 * @author Amir Masri
 */
@Service
public class FactServiceImpl implements FactService {

    @Autowired
    private FactDAO factDao;

    /**
     * Parses a fact from the Snapple website.
     * @return the fact object
     * @throws IOException
     */
    @Override
    public Fact getFact() throws IOException {
        return factDao.getFact();
    }

}
