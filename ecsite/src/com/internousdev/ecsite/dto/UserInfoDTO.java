package com.internousdev.ecsite.dto;

public class UserInfoDTO {

	private String id;
	private String login_id;
	private String userName;
	private String password;
	private String insert_date;
	private String updated_date;

	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id=id;
	}

	public String getLogin_id(){
		return this.login_id;
	}
	public void setLogin_id(String login_id){
		this.login_id=login_id;
	}
	public String getUserName(){
		return this.userName;
	}
	public void setUserName(String userName){
		this.userName=userName;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}
	public String getInsert_date(){
		return this.insert_date;
	}
	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}
	public String getUpdated_date(){
		return this.updated_date;
	}
	public void setUpdated_date(String updated_date){
		this.updated_date=updated_date;
	}

}