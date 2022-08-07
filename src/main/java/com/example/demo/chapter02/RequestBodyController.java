package com.example.demo.chapter02;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lec2/body")
public class RequestBodyController {



    @PostMapping("/v0")
    public String testV0(@RequestBody Fruit fruit){

        return fruit.getName() + " _ " + fruit.getPrice();
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/v1")
    public String testV1(@RequestBody Fruit fruit){

        return fruit.getName() + " _ " + fruit.getPrice();
    }

    @PostMapping("/v2")
    public ResponseEntity testV2(@RequestBody Fruit fruit){

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("name","saechim");
        headers.add("company", "comento");
        return new ResponseEntity<>(fruit.getName()+" _ "+fruit.getPrice(), headers,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @PostMapping("/v3")
    public ResponseEntity testV3(@RequestBody Fruit fruit){

        MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
        headers.add("name","saechim");
        headers.add("company", "comento");

        return ResponseEntity.badRequest()
                .headers(new HttpHeaders(headers))
                             .body(fruit.getName()+ " _ " + fruit.getPrice());

    }
}
