package com.netposa.cloud.pvd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netposa.cloud.pvd.service.ComputeClient;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:36:46
 *
 */
@RestController
public class PvdController {

	@Autowired
    private ComputeClient computeClient;
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {
        return "pvd-service(add): " + computeClient.add(10, 20);
    }
}
