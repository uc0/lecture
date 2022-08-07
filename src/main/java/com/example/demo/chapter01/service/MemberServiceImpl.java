package com.example.demo.chapter01.service;

import com.example.demo.chapter01.domain.Member;
import com.example.demo.chapter01.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityManager;
import java.util.Optional;

@RequiredArgsConstructor
@Slf4j
public class MemberServiceImpl implements MemberService {

    private final EntityManager entityManager;
    private final MemberRepository memberRepository;

    @Override
    public void save(String name, Member member) {
        memberRepository.saveMember(name, member);

        log.info("\n memberService save 호출");
    }

    @Override
    public Optional<Member> findByName(String name) {
        log.info("\n memberService findByName 호출");
        return memberRepository.findByName(name);
    }

//    @Transactional
//    public void findUser(){
//
//        Long userId = 25L;
//
//        User user1 = entityManager.find(User.class, userId);
//
//        User user2 = entityManager.find(User.class, userId);
//
//        log.info("user1 == user 2 {}", user1== user2); //TRUE
//    }
}



