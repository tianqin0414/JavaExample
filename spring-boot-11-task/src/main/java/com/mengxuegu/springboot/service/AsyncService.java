package com.mengxuegu.springboot.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * 异步处理批量操作
 * @Auther: 梦学谷
 */
@Service
public class AsyncService {

    @Async
    public void batchAdd() {
        try {
            //模拟新增数据
            Thread.sleep(3*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("批量新增数据完成");
    }

}
