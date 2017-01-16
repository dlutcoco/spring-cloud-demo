package com.netposa.cloud.pva.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netposa.cloud.pva.service.ComputeService;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:36:46
 *
 */
@RestController
public class PvaController {

	@Autowired
	private ComputeService computeService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return "pva-service(add): " + computeService.addService();
	}
}
