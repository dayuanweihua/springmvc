package com.dayuan.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.dayuan.bean.Card;
import com.dayuan.dao.CardMapper;

@Service
public class BalanceService {
	
	@Resource
	private CardMapper cardMapper;
	
	public int checkBalance(String cardNo){
		Card card=cardMapper.selectCardByCardNo(cardNo);
		int money=card.getMoney();
		return money;
	}
}
