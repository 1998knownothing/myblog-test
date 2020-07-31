package com.example.mybatisplus.utils;

import com.baomidou.mybatisplus.core.toolkit.AES;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-06-03 13:15
 **/
public class EncryptUtils {
    public static void get(String data){
    // 生成 16 位随机 AES 密钥
            String randomKey = AES.generateRandomKey();
        System.out.println(randomKey);
    // 随机密钥加密
            String result = AES.encrypt(data, randomKey);
        System.out.println(result);
    }

    public static void main(String[] args) {
        get("1158982120fire");
    }
}
