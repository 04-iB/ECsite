package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserDeleteCompleteDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserDeleteCompleteAction extends ActionSupport implements SessionAware{

	private String login_id;
	private String login_pass;

	List<UserInfoDTO>deleteList=new ArrayList<UserInfoDTO>();
	private Map<String,Object>session;

	public String execute() throws SQLException {
		String ret=ERROR;
		UserDeleteCompleteDAO userDeleteCompleteDAO=new UserDeleteCompleteDAO();
		int count=userDeleteCompleteDAO.deleteUser(login_id, login_pass);
		if(count>0){
			deleteList=userDeleteCompleteDAO.select();
			session.put("deleteList", deleteList);
		}

		ret=SUCCESS;
		return ret;
	}

	public String getLogin_id(){
		return login_id;
	}
	public void setLogin_id(String login_id){
		this.login_id=login_id;
	}
	public String getLogin_pass(){
		return login_pass;
	}
	public void setLogin_pass(String login_pass){
		this.login_pass=login_pass;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session=session;

	}


}