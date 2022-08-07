package com.example.demo.chapter02;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
class Fruit{
        private String name;
        private String price;
    }