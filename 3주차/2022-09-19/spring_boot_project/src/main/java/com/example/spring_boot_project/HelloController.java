package com.example.spring_boot_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/jejunu")

    public String index() {
        return "Hello, World!!";
    }

}
