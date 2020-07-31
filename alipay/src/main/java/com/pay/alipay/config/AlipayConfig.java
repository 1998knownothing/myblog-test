package com.pay.alipay.config;

/**
 * @program: myblog-test
 * @description:
 * @author: Mr.liu
 * @create: 2020-07-31 14:47
 **/

/*
* 支付宝扫码支付
* */
public class AlipayConfig {
//沙盒模式下的测试
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2021000116686816";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQDsPAeq0A55hlqCoBBHoY0JrjMmzaznnG43rrGMv9IkZ8GkBBN1Vgg48vK0oXjo7F528AhvtfDkAWnDngMTKtmLIC/YzmwNJhOOYiKfCSMfOc0XMwMBbNJIUoOYJ+xdhiE1O1a7+0yf0d+k5x6T7FHp4ZB0ymj9mpc6bMq56nxUBAIPVEQ5licFq6yCK777Ym68idEVCFMbWgRCPAPbPqSXkm881lW9ktD07kTIvdFAXriZcRaFe5ZimsXu6o4Kd0HmNA/dIinYOfDbkJS+opqGZ2y1oDgVwWit6a3/wBlYVdI/0B3Eg9FAj4kFMGG9CdRLW+0JicLCX8oTLuJuCC6HAgMBAAECggEAMBthbFWGPRUxJVy3M/8gG5KP9Bz6Uwg2Iby/h2wgvS0r79ysob5tWjuPVV10o+pOqmXjMeyZK7Vl9mIdOjAFsSFS3RHcSykv3lT5u+0+a8N3knve5tFkWToEdl3a8oi4BoEY/psEVZ+Fra0rOvBrFffLVR1LGCn9FfbFqeqoeusZ3qBMKv35pg8FQHP1sRha1mIi/owKP4BytA46LBzl80annGc/zV6Us6MO3H9VEbu0OvQ88Wt0w8UhZAv4StVodM51S66IKHpUJh7ox9cpRZ5Elpb/uXT3ZWIwvhDzLcmi7xTgnKrFW3dH9YiQmHtDVPdGTDmeBh0L1Ywo5IAb4QKBgQD32spOlgLnOJ9jmxG+meGJAxB1prwjHzrFsGKLiwdS1/QvsrrDdo4YhQTUnUEkDqSGD3xE8hd1w1ABZrDLiWvkbpeS8AjvLoxckalQoOC817g4uzKrVWCzNUjeL185LRrQLUoqCI7Qx6HPJY1sSNciywd3lTHoM+nP46K4aqPRzwKBgQDz/3qZT7+CK1UwUmGVyWQgQM1O/OnYrZ3qvFalWHtp1mT+Jc8SDfbogKSauTyUUHETwjoHSpHGyiVq7j8fyfDemEeMk2hqIzRWoTylZE8ZZkNIS2II4x80t2Yc9UpBcdeYIwXwVB5lSYmR4hTvOAvzIw51nhWYWJ3C5HhcLhwdyQKBgEw8UcnGPnJcajo68kRMFKEN/jwR4wBylKNF06nUQ5ZpskQRl3yTtLU6BPhYvjaXAmfxz2lthWXFg5BKw8p3JGaI1bpudnELQkUe0JNqSHYNbC6W9cjZY/r7QsSEkaeGhh7OL2eqZjM1lEGg7VUHOpULGergSw9/GEXHYL+UnXrlAoGAZFFY1anNIjawusJULuJzUTNzdhNUDesr7zPqJ+ceLqCgO0HORi0JpAQoKRkZyBzesPH9K7xD/UhlY/Z6a5Z6evp/CFQe7Ox2e1uldJauUtIRvaqIrwC6dtEkoalUE1479ugHbA0Zxika76jVVJlliFyUeFU7qbxdeKC4v6WRl8kCgYEAtzVPVMNDYYDbqa6xysEPN3r14ZpTqydRy/+Ihf7LMZVvdlpk+M3DmqNEP7idz9aLJSe87ndyDXFH6dJ0H2eZnwBGVnAi1zgB6T6DNn44aE62ZO7R0kjhRiQ/QPQAflqAsICMMc7nwqdeXK19UD2HS2hqlTGwdRPKLE/n7bubbdc=";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5VsVKe6RtswTb4hyZxvGCMoQBKHnC1TIgDwSj1GOazfOPMZc3N2AVLzkxsu2ZyevDLVn/MzbOwanPm6G5xL8WJTNrrOk4BwuJeHcOxBznDzwFLiVF8JOEKQKlLrgJO7TDR9r3+Baw4/xFf4sb8w/XNhO+hex+Ip5iNdKl5pTuPeWRcpyvPPtUOmHcjhpJQjB193+mGzAnJdAERp0Pm/EhAlXUUjusU07kz4aYE0vtPo2h5o0JiB44rjVX1G5MjKOVBKDguhZhNVj55dHjdIpKPffASkUDNdRj+igw2EDTWDQ5u/T89FjqlIfwkrLrYrJjzxlfR+vCEBlRgdLd+XumQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "C:\\";

}
