package com.akm.snapplefacts.controller;

import com.akm.snapplefacts.service.FactService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.IOException;

/**
 * FactController handles all server requests.
 * @author Amir Masri
 */
@Controller
@RequestMapping("/")
public class FactController {

    static Logger log = Logger.getLogger(FactController.class);

    @Autowired
    FactService factService;

    /**
     * Displays the home page.
     * @return the home view
     */
    @RequestMapping(method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    /**
     * Displays a fact parsed from the Snapple website.
     * @param model the model object
     * @return the fact view
     */
    @RequestMapping(value = "fact", method = RequestMethod.GET)
    public String getFact(ModelMap model) throws IOException {
        model.addAttribute("fact", factService.getFact());
        return "fact";
    }

    /**
     * Handles any parsing exceptions that may have occurred.
     * @param ex the exception object
     * @return the error view
     */
    @ExceptionHandler
    private String error(IOException ex) {
        log.error(ex.getMessage());
        return "error";
    }

}
