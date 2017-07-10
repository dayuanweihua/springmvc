package com.dayuan.controller;



import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dayuan.bean.Card;
import com.dayuan.bean.User;
import com.dayuan.dao.CardMapper;
import com.dayuan.service.LoginService;
import com.dayuan.util.Constant;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Resource
	private LoginService loginService;
		
	@RequestMapping(value="/toStart.do",method=RequestMethod.GET)
	public String printHello(ModelMap model){				
		model.addAttribute("message","欢迎，请登录!");
		return "login";
	}
	
	@RequestMapping(value="/check.do",method={RequestMethod.GET,RequestMethod.POST})
	public ModelAndView check(User user,HttpServletRequest request){
		int code=loginService.check(user.getUsername(),user.getPassword());
		
		if(code==Constant.LOGIN_FAIL){		
			//System.out.println(card.getCardNo()+"in");
			return new ModelAndView("login","statu","您输入的账号或密码有误，请重新输入！");
		}	
		HttpSession session=request.getSession();
		session.setAttribute("cardNo",user.getUsername());
		return new ModelAndView("homepage","user",user);
	}
	
	
}
