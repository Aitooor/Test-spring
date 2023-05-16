package com.github.aitooor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/my-projects")
public class MyProjectController {

    @GetMapping("/servers")
    public String server() {
        return "page/server";
    }
}
