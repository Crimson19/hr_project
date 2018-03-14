package com.iotek.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExecptionController {

    @ExceptionHandler
    public String error500(NullPointerException e) {
        return "redirect:/staticPages/500.html";

    }

}
