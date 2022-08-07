package com.example.demo.chapter02;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/lec2/query")
@Slf4j
public class QueryParamController {

    @GetMapping("/v0")
    public String testV0(@RequestParam(value = "name" , required = false , defaultValue = "saechim") String name ,
                         @RequestParam("message") String message){
        return name + "_" + message;
    }

    @GetMapping("/v1")
    public String testV1(@RequestParam Map<String, String> map){

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, String> stringStringEntry : map.entrySet()) {
            sb.append("_").append(stringStringEntry.getValue());
        }

        return sb.toString();
    }

    @GetMapping("/v2")
    public String testV2(@RequestParam MultiValueMap<String, String> map){
        StringBuilder sb = new StringBuilder();


        for (Map.Entry<String, List<String>> stringListEntry : map.entrySet()) {
            sb.append("_").append(stringListEntry.getValue());
        }
        return sb.toString();
    }
}
