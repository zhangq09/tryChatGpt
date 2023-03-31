package com.trychatgpt.study.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @GetMapping("/command")
    public String getCommand(@PathVariable String command){

        return "";
    }
}
