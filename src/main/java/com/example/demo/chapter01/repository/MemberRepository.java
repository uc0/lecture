package com.example.demo.chapter01.repository;

import com.example.demo.chapter01.domain.Member;

import java.util.Optional;

public interface MemberRepository {

    Optional<Member> findByName(String name);

    void saveMember(String name, Member member);

    Member findById(Long id);
}
