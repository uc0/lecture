package com.example.demo;

import com.example.demo.chapter01.config.AppConfig;
import com.example.demo.chapter01.domain.Member;
import com.example.demo.chapter01.service.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest(classes = {AppConfig.class})
@Import(TestConfig.class)
public class MemberServiceTest {

//    @Autowired @Qualifier("memberServiceDefault")
//    MemberService memberService;
//
//    @Test
//    void 테스트(){
//        memberService.findByName("새침");
//
//        memberService.save("새침",new Member("saechim","123","판교"));
//
//        Member saechim = memberService.findByName("새침").orElse(new Member("abcd","123","add"));
//
//        System.out.println(saechim.getName() +" "+saechim.getAddress());
//    }
}
