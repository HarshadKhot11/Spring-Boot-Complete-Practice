package com.example.practice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String Hello()
    {
        return "This is hello funciton run using spring boot get mapping and rest controller";
    }
    
}
