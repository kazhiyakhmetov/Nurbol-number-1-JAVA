package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
class HomeController {

    @RequestMapping("/")
    @ResponseBody
    public float greet() {
        return 1.6;
    }


}
