package com.example.async.task;

import org.springframework.web.context.request.async.WebAsyncTask;

import java.util.concurrent.Callable;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-08-06 21:05
 **/
public class MyTask extends WebAsyncTask<String> {
    public MyTask(Callable<String> callable) {
        super(callable);
    }
}
