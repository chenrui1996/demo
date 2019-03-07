package com.suray.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefultController {

    @RequestMapping("/springboot")
    public String defultIndex() {
        return "index";
    }
}
