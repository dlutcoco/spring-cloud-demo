package com.netposa.cloud.pvd.service;

import org.springframework.stereotype.Component;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:53:38
 *
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

	public Integer add(Integer a, Integer b) {
		return -99;
	}
}
