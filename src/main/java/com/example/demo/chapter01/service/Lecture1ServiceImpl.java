package com.example.demo.chapter01.service;

import com.example.demo.chapter01.repository.Lecture1RepositoryImpl;
import com.example.demo.chapter01.repository.Lecture1RepositoryNoSpring;

public class Lecture1ServiceImpl implements Lecture1ServiceNoSpring{

    private final Lecture1RepositoryNoSpring lecture1Repository;

    public Lecture1ServiceImpl(Lecture1RepositoryImpl lecture1Repository) {
        this.lecture1Repository = lecture1Repository;
    }

    @Override
    public void saveValue(String key, String value) {
        lecture1Repository.saveValue(key, value);
    }

    @Override
    public void homework(String key) {
        lecture1Repository.homework(key);
    }
}
