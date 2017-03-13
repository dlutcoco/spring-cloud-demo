package com.netposa.cloud.gateway.filter;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.Debug;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:18:59
 *
 */

public class LogPostFilter extends ZuulFilter {

	 private static Logger log = LoggerFactory.getLogger(LogPostFilter.class);

	    @Override
	    public String filterType() {
	        return "post";
	    }

	    @Override
	    public int filterOrder() {
	        return 0;
	    }

	    @Override
	    public boolean shouldFilter() {
	        return true;
	    }

	    @Override
	    public Object run() {
	        List<String> debugStrings = Debug.getRequestDebug();
	        System.out.println("requestDebug............");
	        for (String deString : debugStrings) {
                System.out.println(deString);
            }
	        List<String> routingStrings = Debug.getRoutingDebug();
	        System.out.println("routingDebug............");
	        for (String routingString : routingStrings) {
	            System.out.println(routingString);
	        }
	        return null;
	    }
}
