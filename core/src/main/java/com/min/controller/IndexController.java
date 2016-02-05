/**
 * kany.me Inc.
 * Copyright (c) 2015-2015 All Rights Reserved.
 */
package com.min.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.model.Syonline;
import com.min.service.ISyonlineService;

/**
 * 
 * @author Jason.Wang
 * @version $Id: IndexController.java, v 0.1 2015年8月1日 下午6:15:45 Jason.Wang Exp $
 */
@Controller
@SuppressWarnings("serial")
public class IndexController extends BaseController {
	@Resource
    private ISyonlineService syonlineService;
	
    @RequestMapping("/index")
    public String execute(@RequestParam(value = "page", defaultValue = "1") int page, HttpServletRequest request, HttpServletResponse response) {
    	try {
			List<Syonline> syonlines = syonlineService.querySyonlineList(null);
			request.setAttribute("syonlines", syonlines);
		} catch (Exception e) {
			e.printStackTrace();
		}
        logger.debug("当前执行了...");
        return "front/index";
    }
}
