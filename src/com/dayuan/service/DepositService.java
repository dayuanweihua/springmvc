package com.dayuan.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dayuan.bean.Card;
import com.dayuan.dao.CardMapper;
import com.dayuan.util.Constant;

@Service
public class DepositService {
	
	@Resource
	private CardMapper cardMapper;
	
	public int isSuccessForDeposit(String cardNo,int depositNumber){
		Card card=cardMapper.selectCardByCardNo(cardNo);
		int hasMoney=card.getMoney();
		int sumMoney=hasMoney+depositNumber;		
		int actionCode=cardMapper.updateMoneyByCardNo(sumMoney, cardNo);
		if(actionCode==1){
		return Constant.DEPOSIT_SUCCESS;
		}
		return Constant.DEPOSIT_FAIL;
	}
}
