package com.example.demo.chapter01.repository;

import com.example.demo.chapter01.MemberSingleTon;
import com.example.demo.chapter01.domain.Member;

import java.util.Optional;

public class MemberRepositoryImpl implements MemberRepository{


    @Override
    public Optional<Member> findByName(String name) {
        return MemberSingleTon.getInstance().findByName(name);
    }

    @Override
    public void saveMember(String name, Member member) {
        MemberSingleTon.getInstance().save(name, member);
    }

    @Override
    public Member findById(Long id) {
        return null;
    }
}
