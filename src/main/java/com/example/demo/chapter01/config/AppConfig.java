package com.example.demo.chapter01.config;

import com.example.demo.chapter01.repository.MemberRepository;
import com.example.demo.chapter01.repository.MemberRepositoryImpl;
import com.example.demo.chapter01.service.CompanyMemberServiceImpl;
import com.example.demo.chapter01.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

//    @Bean
//    @Scope(value = "prototype")
//    public MemberService memberServiceDefault(){
//        return new MemberServiceImpl(memberRepository());
//    }

    @Bean
    public MemberService companyMemberService(){
        return new CompanyMemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemberRepositoryImpl();
    }

}
