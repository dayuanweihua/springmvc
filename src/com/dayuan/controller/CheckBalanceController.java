package com.dayuan.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dayuan.bean.User;

@Controller("/check_balance")
public class CheckBalanceController {

	@Transactional(readOnly=true,rollbackForClassName="Exception")
	@RequestMapping(value="/backHomepage.do")
	public ModelAndView backHomepage(HttpSession session){
		return new ModelAndView("homepage","cardNo",session.getAttribute("cardNo"));
	}
	
}
