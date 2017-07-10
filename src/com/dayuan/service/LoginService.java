package com.dayuan.service;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.dayuan.bean.Card;
import com.dayuan.dao.CardMapper;
import com.dayuan.util.Constant;

@Service
public class LoginService {

	@Resource
	private CardMapper cardMapper;

	/**
	 * 连接数据库，验证用户输入的账户和密码是否正确
	 * @param username
	 * @param password
	 * @return
	 */
	public int check(String cardNo, String password) {
		Card card = cardMapper.selectCardByCardNo(cardNo);
		
		if (card!=null&&cardNo.equals(card.getCardNo()) && password.equals(card.getPassword())) {
			return Constant.LOGIN_SUCCESS;
		}
		return Constant.LOGIN_FAIL;
	}

}
