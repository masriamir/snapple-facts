package com.akm.snapplefacts.model;

import java.io.Serializable;

/**
 * Fact POJO to store a fact's number and detail
 * @author Amir Masri
 */
public class Fact implements Serializable {

    /**
     * Fact constructor.
     * @param id the fact number
     * @param detail the fact detail text
     */
    public Fact(Integer id, String detail) {
        this.id = id;
        this.detail = detail;
    }

    private Integer id;
    private String detail;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

}
