/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.SpringEurekaClient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ASUS
 */

@RestController
public class HelloController {
    
    @Value("${zone.num}")
    private String num;
    
    @GetMapping("/")
    public String index() {
        return "Greetings from Zone " + num;
    }
    
}
