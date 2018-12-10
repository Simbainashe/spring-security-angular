package com.fsm.resourceapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fact S Musingarimi
 * 12/10/18
 * 6:39 PM
 */

@RestController
public class MyName {

    @GetMapping("/myname")
    public String getMyName(){
        return "Fact S Musigarimi";
    }
}
