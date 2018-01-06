/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prakas.web.controller;

import com.prakas.core.dao.CustomerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Prakas
 */
@Controller
@RequestMapping(value = "/")
public class DefaultController {

    @Autowired
    private CustomerDAO customerDAO;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap map) {
        map.addAttribute("customers", customerDAO.getAll());
        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public ModelAndView about() {
        ModelAndView mv = new ModelAndView("about");
        mv.addObject("title", "This is about Page");
        return mv;
    }

}
