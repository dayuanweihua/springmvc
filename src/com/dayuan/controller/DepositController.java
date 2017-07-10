package com.dayuan.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dayuan.bean.User;
import com.dayuan.service.DepositService;
import com.dayuan.util.Constant;

@Controller
@RequestMapping("/deposit")
public class DepositController {
	
	@Resource
	private DepositService depositService;
	
	@RequestMapping(value="/deposit_detail.do")
	public ModelAndView saveMoney(HttpServletRequest request){
		int depositNumber=Integer.valueOf(request.getParameter("deposit_number"));
		HttpSession session=request.getSession();
		String cardNo=String.valueOf(session.getAttribute("cardNo"));
		int saveCode=depositService.isSuccessForDeposit(cardNo,depositNumber);
		if(saveCode==Constant.DEPOSIT_SUCCESS){
		return new ModelAndView("deposit_detail","depositNumber",depositNumber);
		}
		return new ModelAndView("deposit_action","statu","存款操作失败，请重新操作！");
	}	
	
}
