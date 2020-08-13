package com.example.async.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.async.WebAsyncTask;
import org.springframework.web.context.request.async.WebAsyncUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-06 21:00
 **/
@RestController
@RequestMapping("/test")
public class AsyncController {

    /*
    * WebAsyncTask<String>
    *     不返回这个不执行
    * */
    @GetMapping("/x")
    public WebAsyncTask<String> testAsync(HttpServletRequest request){

// 打印处理线程名
        System.err.println("The main Thread name is " + Thread.currentThread().getName());

        // 此处模拟开启一个异步任务,超时时间为10s
        WebAsyncTask<String> task1 = new WebAsyncTask<String>(10 * 1000L, () -> {
            System.err.println("The first Thread name is " + Thread.currentThread().getName());
            // 任务处理时间5s,不超时
            Thread.sleep(5 * 1000L);
            return "任务1顺利执行成功！任何异常都没有抛出！";
        });

        // 任务执行完成时调用该方法
        task1.onCompletion(() -> {
            System.err.println("任务1执行完成啦！");
        });

        System.err.println("task1继续处理其他事情！");
        return task1;
    }
}
