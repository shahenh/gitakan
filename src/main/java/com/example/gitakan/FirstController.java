package com.example.gitakan;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {


    @GetMapping("/hello")
    public String getAnswer() {
        return "hello";
    }

    @GetMapping("/show")
    public String getShow() {
        return "show";
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }
}
