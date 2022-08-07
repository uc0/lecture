package com.example.demo.chapter02;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lec2/request")
public class RequestMappingController {

    @RequestMapping("/v0")
    public String testV0(){
        return "commento";
    }

//    @RequestMapping(value = "/v1",method = RequestMethod.GET)
    @GetMapping("/v1")
    public String testV1(){
        return "commento - Get";
    }

//    @RequestMapping(value = "/v2",method = RequestMethod.POST)
    @PostMapping("/v2")
    public String testV2(){
        return "commento - POST";
    }
}
