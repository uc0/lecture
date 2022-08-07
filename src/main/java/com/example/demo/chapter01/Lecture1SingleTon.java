package com.example.demo.chapter01;

import com.example.demo.chapter01.domain.Member;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class Lecture1SingleTon {

    private final Map<String, String> memberMap = new ConcurrentHashMap<>();

    private static Lecture1SingleTon SINGLETON = new Lecture1SingleTon();

    private Lecture1SingleTon() {
    }

    public void save(String name, String value){
        memberMap.put(name, value);
    }

    public String findByName(String name){
        return memberMap.getOrDefault(name,"COMMENTO");
    }

    public static Lecture1SingleTon getInstance() {
        return SINGLETON;
    }
}
