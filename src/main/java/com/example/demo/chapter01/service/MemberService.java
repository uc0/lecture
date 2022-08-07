package com.example.demo.chapter01.service;

import com.example.demo.chapter01.domain.Member;

import java.util.Optional;

public interface MemberService {

    void save(String name, Member member);

    Optional<Member> findByName(String name);

}
