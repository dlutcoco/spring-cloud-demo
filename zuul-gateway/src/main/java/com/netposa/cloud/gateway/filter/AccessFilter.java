package com.netposa.cloud.gateway.filter;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

/**
 * @author dlut_coco@126.com
 * @version 2017年1月1日 下午9:18:59
 *
 */

public class AccessFilter extends ZuulFilter {

	 private static Logger log = LoggerFactory.getLogger(AccessFilter.class);

	    @Override
	    public String filterType() {
	        return "pre";
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
	        HttpServletRequest request = ctx.getRequest();

	        log.info(String.format("%s request to %s", request.getMethod(), request.getRequestURL().toString()));

	        Object accessToken = request.getParameter("accessToken");
	        if(accessToken == null) {
	            log.warn("access token is empty");
	            ctx.setSendZuulResponse(false);
	            ctx.setResponseStatusCode(401);
	            return null;
	        }
	        log.info("access token ok");
	        return null;
	    }
}