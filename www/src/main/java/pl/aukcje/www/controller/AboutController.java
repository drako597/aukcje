/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.aukcje.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author karol
 */
@Controller
public class AboutController {


    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about(Model model) {

        return "about";
    }

}
