package com.fsm.authserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fact S Musingarimi
 * 12/5/18
 * 5:40 AM
 */
@RestController
public class MyName {
    @GetMapping("/myname")
    public String getMyName(){
        return "Fact S Musigarimi";
    }
}
