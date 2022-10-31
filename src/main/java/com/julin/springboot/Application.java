package com.julin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //标注这是一个主程序类，说明是一个Spring boot 应用  启动类下的所有资源被导入
public class Application {

    public static void main(String[] args) {
        //将spring boot应哟ing启动
        //springApplication类
        //run方法
        SpringApplication.run(Application.class, args);
    }

}
