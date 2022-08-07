package com.example.demo.chapter02;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoggingController {

    private Logger log1 = LoggerFactory.getLogger(getClass());

    private Logger log2 = LoggerFactory.getLogger(LoggingController.class);

    public void test(){
        log.info("\n 로깅 by 롬복 ");

        log1.info("\n 로깅 by 두번째 방법");

        log2.info(("\n 로깅 by 세번째 방법"));
    }

    @EventListener(ApplicationReadyEvent.class)
    public void testApp(){
        test();

        System.out.println("bbbb");
    }
}
