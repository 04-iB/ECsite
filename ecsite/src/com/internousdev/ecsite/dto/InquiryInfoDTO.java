package com.internousdev.ecsite.dto;

public class InquiryInfoDTO {
	private String name;
	private String address;
	private String qtype;
	private String body;
	private String insert_date;

	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getAddress(){
		return this.address;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public String getQtype(){
		return this.qtype;
	}
	public void setQtype(String qtype){
		this.qtype=qtype;
	}
	public String getBody(){
		return this.body;
	}
	public void setBody(String body){
		this.body=body;
	}
	public String getInsert_date(){
		return this.insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date=insert_date;
	}

}