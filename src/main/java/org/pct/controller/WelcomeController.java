/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pct.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author VADIVEL P M
 */
@Controller
public class WelcomeController {

    @Value("${welcome.messge}")
    private String welcomeMessage;

    @GetMapping("/")
    public String welcome(Model model) { 
        model.addAttribute("message", welcomeMessage); //Defalut scope is request
        return "index";
    }
    
    
}
