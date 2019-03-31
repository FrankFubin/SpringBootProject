package com.fb.demo.tasks;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

    //@Scheduled(cron = "")
    //@Scheduled(fixedRate = 1000)
    public void test(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH24:mm:ss");
        System.out.println(sdf.format(date));
    }
}
