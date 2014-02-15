package com.akm.snapplefacts.dao;

import com.akm.snapplefacts.model.Fact;

import java.io.IOException;

/**
 * FactDAO interface that defines all data-access-level methods.
 * @author Amir Masri
 */
public interface FactDAO {

    /**
     * Parses a fact from the Snapple website.
     * @return the fact object
     * @throws IOException
     */
    public Fact getFact() throws IOException;

}
