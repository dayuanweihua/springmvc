package com.dayuan.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.dayuan.bean.Card;
import com.dayuan.bean.User;
import com.dayuan.service.BalanceService;

@Controller
@RequestMapping("/forward")
public class HomepageController {	
	//private static Logger logger=LoggerFactory.getLogger(HomepageController.class);
	
	@Resource
	private BalanceService balanceService;
	
	@RequestMapping(value = "/check_balance.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView checkBalance(HttpSession session) {		
		//logger.info("用户请求验证用户名和密码{}",JSON.toJSONString(card));
		String cardNo=String.valueOf(session.getAttribute("cardNo"));
		int money=balanceService.checkBalance(cardNo);
		return new ModelAndView("check_balance","money",money);
	}
	
	@RequestMapping(value="/take_money_action.do",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView takeMoney(HttpSession session){
		String cardNo=String.valueOf(session.getAttribute("cardNo"));
		int money=balanceService.checkBalance(cardNo);
		return new ModelAndView("take_money_action","money",money);
	}
	
	@RequestMapping(value="/save_money_action.do")
	public ModelAndView saveMoney(Card card){
		return new ModelAndView("save_money_action","card",card);
	}
	@RequestMapping(value="/transfer_action.do")
	public ModelAndView transfer(Card card){
		return new ModelAndView("transfer_action","card",card);
	}
	@RequestMapping(value="/reLogin.do")
	public ModelAndView reLogin(){
		return new ModelAndView("login","statu","请输入您的账户和密码");
	}
	
	
}
