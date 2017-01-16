package com.netposa.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author dlut_coco@126.com
 * @version 2016年12月25日 下午5:39:14
 *
 */

@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class ConfigServiceApplication {

	public static void main(String[] args) {
        SpringApplication.run(ConfigServiceApplication.class, args);
    }
}
