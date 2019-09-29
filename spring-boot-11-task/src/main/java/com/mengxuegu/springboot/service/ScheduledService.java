package com.mengxuegu.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 创建定时任务
 * @Auther: 梦学谷
 */
@Service
public class ScheduledService {
    private static int count = 1;

    /**
     * second(秒)  minute(分), hour(时), day(天) ,month(月) week(星期几)
     * 	"0 * * * * MON-FRI"
     *
     */
    @Scheduled(cron = "1-30 * * * * MON-FRI")
    public void dataCount() {
        System.out.println("数据统计第" + count++ + "次");
    }

}
