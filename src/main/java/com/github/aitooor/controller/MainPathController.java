package com.github.aitooor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainPathController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/error")
    public String error() {
        return "error/error";
    }

    @GetMapping("/404")
    public String noExist() {
        return "error/404";
    }

    @GetMapping("/my-projects")
    public String myProjects() {
        return "page/my-projects";
    }

    @GetMapping("/about-me")
    public String aboutMe() {
        return "page/about-me";
    }
}
