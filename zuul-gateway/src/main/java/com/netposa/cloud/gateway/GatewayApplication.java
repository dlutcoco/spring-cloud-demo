package com.netposa.cloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.netposa.cloud.gateway.fallback.MyFallbackProvider;
import com.netposa.cloud.gateway.filter.AccessFilter;
import com.netposa.cloud.gateway.filter.ErrorFilter;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:09:05
 *
 */

@SpringCloudApplication
@EnableZuulProxy
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}
	
	@Bean
	public ErrorFilter errorFilter() {
	    return new ErrorFilter();
	}
	
	@Bean
	public MyFallbackProvider myFallbackProvider() {
	    return new MyFallbackProvider();
	}
}
