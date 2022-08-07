package com.example.demo.chapter01.repository;

import com.example.demo.chapter01.Lecture1SingleTon;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Lecture1RepositoryImpl implements Lecture1RepositoryNoSpring{
    @Override
    public void saveValue(String key, String value) {
        Lecture1SingleTon.getInstance().save(key,value);
    }

    @Override
    public void homework(String key) {
        String byName = Lecture1SingleTon.getInstance().findByName(key);

        log.info("\n Lecture1 과제 입니다. {}",byName);
    }
}
