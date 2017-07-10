package com.dayuan.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.dayuan.bean.Card;
import com.dayuan.dao.CardMapper;
import com.dayuan.util.Constant;

@Transactional
@Service
public class TakeMoneyService {

	@Resource
	private CardMapper cardMapper;
	
	/**
	 * 连接数据库，判断是否能取款，并返回取款状态码
	 * @param cardNo
	 * @param takeMoneyNumber
	 * @return
	 */
	//propagation=Propagation.REQUIRED,
	@Transactional(rollbackFor =Exception.class)
	public int isSuccessForTake(String cardNo, int takeMoneyNumber) throws Exception {
		
			Card card=cardMapper.selectCardByCardNo(cardNo);
			int hasMoney=card.getMoney();
			int afterMoney=hasMoney-takeMoneyNumber;
			
			if(afterMoney>=0){
				cardMapper.updateMoneyByCardNo(afterMoney, cardNo);	
				int i=1/0;
				//System.out.println(i);
				return Constant.TAKE_MONEY_SUCCESS;
			}
			
		
		
		return Constant.TAKE_MONEY_FAIL;
	}

	

}
