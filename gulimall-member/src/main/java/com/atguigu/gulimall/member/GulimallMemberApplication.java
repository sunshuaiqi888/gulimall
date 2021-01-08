package com.atguigu.gulimall.member;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 想要远程调用别的服务:
 *
 * 1.引入openfeign
 * 2.编写一个接口,告诉springcloud这个接口需要调用远程服务
 *   1) 声明接口的每一个方法都是调用那个远程服务的那个接口
 * 3.开启远程调用功能
 *
 * 规范开发,创建feign包(以后所有的远程调用都在feign包里面写)
 */
@EnableFeignClients(basePackages = "com.atguigu.gulimall.member.feign") //开启远程调用注解
@SpringBootApplication
@EnableDiscoveryClient
public class GulimallMemberApplication {

	public static void main(String[] args) {
		SpringApplication.run(GulimallMemberApplication.class, args);
	}

}
