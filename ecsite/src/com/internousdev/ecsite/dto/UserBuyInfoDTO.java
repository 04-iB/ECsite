package com.internousdev.ecsite.dto;

public class UserBuyInfoDTO {

	private String id;
	private String totalPrice;
	private String totalCount;
	private String userName;
	private String pay;
	private String insert_date;
	private String delete_date;

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getTotalPrice(){
		return this.totalPrice;
	}
	public void setTotalPrice(String totalPrice){
		this.totalPrice=totalPrice;
	}
	public String getTotalCount(){
		return this.totalCount;
	}
	public void setTotalCount(String totalCount){
		this.totalCount=totalCount;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getPay(){
		return this.pay;
	}
	public void setPay(String pay){
		this.pay=pay;
	}
	public String getInsert_date(){
		return this.insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
	public String getDelete_date(){
		return this.delete_date;
	}
	public void setDelete_date(String delete_date){
		this.delete_date=delete_date;
	}
}