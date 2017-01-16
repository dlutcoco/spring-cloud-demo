package com.netposa.cloud.pvd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:35:45
 *
 */

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class PvdApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(PvdApplication.class, args);
	}
}
