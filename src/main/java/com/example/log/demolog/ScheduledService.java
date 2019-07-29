package com.example.log.demolog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author zhigangding
 * @date 2019/6/11
 */
@Slf4j
@Component
public class ScheduledService {

//    @Scheduled(cron = "0/5 * * * * *")
//    public void scheduled(){
//        log.info("=====>>>>>使用cron  {}",System.currentTimeMillis());
//    }
    @Scheduled(fixedRate = 10000)
    public void scheduled1() {
        int i = new Random().nextInt(100);
        log.info("a={} b={} c={} d=啊啊是", i, i, i+1);
    }
//    @Scheduled(fixedDelay = 5000)
//    public void scheduled2() {
//        log.info("=====>>>>>fixedDelay{}",System.currentTimeMillis());
//    }
}