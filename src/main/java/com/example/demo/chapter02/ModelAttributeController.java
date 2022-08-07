package com.example.demo.chapter02;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lec2/model")
public class ModelAttributeController {

    @GetMapping("/v0")
    public String hello(@ModelAttribute Fruit fruit){

        Fruit banana = Fruit.builder()
                            .name("banana")
                            .price("1000")
                            .build();

        Fruit banana1 = new Fruit("banana", "1000");

        return fruit.getName() + " _ " + fruit.getPrice();

    }


}
