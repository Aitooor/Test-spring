package com.github.aitooor.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")
    public String handleError(HttpServletRequest httpServletRequest) {
        Object status = httpServletRequest.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if(status != null && Integer.valueOf(status.toString()) == HttpStatus.NOT_FOUND.value()) {
            return "404";
        }

        return "error";
    }
}