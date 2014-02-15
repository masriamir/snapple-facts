package com.akm.snapplefacts.service;

import com.akm.snapplefacts.model.Fact;

import java.io.IOException;

/**
 * FactService interface that defines all service-level methods.
 * @author Amir Masri
 */
public interface FactService {

    /**
     * Parses a fact from the Snapple website.
     * @return the fact object
     * @throws IOException
     */
    public Fact getFact() throws IOException;

}
