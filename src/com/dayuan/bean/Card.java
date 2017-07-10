package com.dayuan.bean;

import org.springframework.stereotype.Component;

@Component
public class Card {
	private Integer id;
	private String cardNo;
	private String password;
	private Integer money;
	private Integer persionId;
	private Integer version;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Integer getPersionId() {
		return persionId;
	}
	public void setPersionId(Integer persionId) {
		this.persionId = persionId;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}
