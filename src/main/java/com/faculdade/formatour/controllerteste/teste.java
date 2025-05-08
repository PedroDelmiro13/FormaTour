package com.faculdade.formatour.controllerteste;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class teste {
    @GetMapping("/")
    public String hello(){
        return "hello world";
    }
}
