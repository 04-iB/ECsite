package com.internousdev.ecsite.action;

import java.sql.SQLException;

import com.internousdev.ecsite.dao.InquiryListDeleteCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryListDeleteCompleteAction extends ActionSupport {
	private String message;
	public String execute() throws SQLException {
		String result=ERROR;
		InquiryListDeleteCompleteDAO inquiryListDeleteCompleteDAO = new InquiryListDeleteCompleteDAO();
		int res=inquiryListDeleteCompleteDAO.deleteInquiryList();
		if(res>0){
			setMessage("お問い合わせ情報を正しく削除しました。");
		}else{
			setMessage("お問い合わせ情報の削除に失敗しました。");
		}
		result=SUCCESS;
		return result;
	}
	public String getMessage(){
		return message;
	}
	public void setMessage(String message){
		this.message=message;
	}
}