package com.example.demo;

import com.example.demo.chapter01.Lecture1SingleTon;
import com.example.demo.chapter01.repository.Lecture1RepositoryImpl;
import com.example.demo.chapter01.service.Lecture1ServiceImpl;
import com.example.demo.chapter01.service.Lecture1ServiceNoSpring;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Lecture1Test {

    @Test
    void lecture1Test(){
        Lecture1ServiceNoSpring lecture1Service = new Lecture1ServiceImpl(new Lecture1RepositoryImpl());

        lecture1Service.saveValue("saechim","LeadMento");

        System.out.println(Lecture1SingleTon.getInstance().findByName("saechim"));

        System.out.println(Lecture1SingleTon.getInstance().findByName("abcd"));
    }
}
