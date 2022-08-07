package com.example.demo.chapter01;

import com.example.demo.chapter01.domain.Member;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

public class MemberSingleTon {

    private final Map<String, Member> memberMap = new ConcurrentHashMap<>();

    private static MemberSingleTon SINGLETON = new MemberSingleTon();

    private MemberSingleTon() {
    }

    public void save(String name, Member member){
        memberMap.put(name, member);
    }

    public Optional<Member> findByName(String name){
        return Optional.ofNullable(memberMap.get(name));
    }

    public static MemberSingleTon getInstance() {
        return SINGLETON;
    }
}
