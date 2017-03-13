package com.netposa.cloud.gateway.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:18:59
 *
 */

public class ErrorFilter extends ZuulFilter {

	 private static Logger log = LoggerFactory.getLogger(ErrorFilter.class);

	    @Override
	    public String filterType() {
	        return "error";
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
	        RequestContext ctx = RequestContext.getCurrentContext();
	        Throwable e = ctx.getThrowable();
	        
	        log.error("", e);
	        return null;
	    }
}
