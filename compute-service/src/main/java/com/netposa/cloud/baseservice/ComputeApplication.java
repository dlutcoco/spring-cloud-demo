package com.netposa.cloud.baseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:24:30
 *
 */

@SpringBootApplication
@EnableDiscoveryClient
public class ComputeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComputeApplication.class, args);
	}
}
