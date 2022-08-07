package com.example.demo.chapter01;

import com.example.demo.chapter01.config.AppConfig;
import com.example.demo.chapter01.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class TestMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberServiceDefault1 = applicationContext.getBean("memberServiceDefault", MemberService.class);
        MemberService memberServiceDefault2 = applicationContext.getBean("memberServiceDefault", MemberService.class);

        log.info("\n 싱글톤 {} ",memberServiceDefault1 == memberServiceDefault2);
    }
}
