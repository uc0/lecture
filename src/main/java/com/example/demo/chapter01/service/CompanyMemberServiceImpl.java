package com.example.demo.chapter01.service;

import com.example.demo.chapter01.domain.Member;
import com.example.demo.chapter01.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class CompanyMemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    @Override
    public void save(String name, Member member) {
        memberRepository.saveMember(name,member);
        log.info("\n CompanyMemberService save 호출");
    }

    @Override
    public Optional<Member> findByName(String name) {
        log.info("\n CompanyMemberService findByName 호출");
        return memberRepository.findByName(name);

    }
}
