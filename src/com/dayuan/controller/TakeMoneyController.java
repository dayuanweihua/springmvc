package com.dayuan.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dayuan.bean.User;
import com.dayuan.service.TakeMoneyService;
import com.dayuan.util.Constant;

@Controller
@RequestMapping("/take")
//@Transactional
public class TakeMoneyController {
	
	@Resource
	private TakeMoneyService takeMoneyService;
	
	//@Transactional(propagation=Propagation.REQUIRED,rollbackFor =Exception.class)
	@RequestMapping(value="/take_money_detail.do")
	public ModelAndView takeMoneyAction(HttpServletRequest request){
		int takeMoneyNumber=Integer.valueOf(request.getParameter("take_money"));
		HttpSession session=request.getSession();
		String cardNo=String.valueOf(session.getAttribute("cardNo"));
		int code=0;
		try {
			code = takeMoneyService.isSuccessForTake(cardNo,takeMoneyNumber);
			if(code==Constant.TAKE_MONEY_SUCCESS){
				return new ModelAndView("take_money_detail","takeMoneyNumber",takeMoneyNumber);
				}													
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("take_money_action","statu","取款失败请重新操作");	
		
		
	}
			
}
