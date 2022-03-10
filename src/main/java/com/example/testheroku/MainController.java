package com.example.testheroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/test/{param}")
    public String test(@PathVariable(value = "param") String a){
        return "Application return: " + a;
    }
}
