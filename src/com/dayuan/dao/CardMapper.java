package com.dayuan.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import com.dayuan.bean.Card;

@MapperScan
public interface CardMapper {
	
	public Card selectCardByCardNo(String cardNo);
	
	public Map<String, Object> selectCardById(int param);

	public Card selectCardById2(int param);

	public List<Card> selectCardById3(Map<String, Object> map);

	public List<Card> selectCardById5(Map<String, Object> map);

	public List<Card> selectCardById6(List<Integer> list);

	public int insertCard(Card card);

	public int updateCardById(Card card);
	
	public int updateMoneyByCardNo(@Param("money")int money,@Param("cardNo")String cardNo);

	public int deleteCardById(int id);

	public Card selectCardById7(@Param("id") Integer id,
			@Param("cardNo") String cardNo);
}
