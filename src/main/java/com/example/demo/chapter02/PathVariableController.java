package com.example.demo.chapter02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lec2/path")
@Slf4j
public class PathVariableController {


    @GetMapping("/v0/{name}")
    public String testV0(@PathVariable("name") String name){
        return name;
    }
}
