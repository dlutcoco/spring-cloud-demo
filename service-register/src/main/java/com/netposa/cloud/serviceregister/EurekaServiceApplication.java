package com.netposa.cloud.serviceregister;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author dlut_coco@126.com
 * @version 2016年12月25日 下午10:28:14
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);
	}
}
