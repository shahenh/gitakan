package com.example.gitakan;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/")
public class FirstController {


    @GetMapping("/hello")
    public String getAnswer() {
        return "hello";
    }

    @GetMapping("/show")
    public String getShow() {
        return "show";
    }
}
