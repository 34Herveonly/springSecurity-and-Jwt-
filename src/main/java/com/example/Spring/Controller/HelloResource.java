package com.example.Spring.Controller;

import jakarta.persistence.Entity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloResource {

    @RequestMapping({"/hello"})
    public String Hello(){
        return "Hello World";
    }
}
