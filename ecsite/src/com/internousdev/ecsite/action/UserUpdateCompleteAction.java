package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserUpdateCompleteDAO;
import com.internousdev.ecsite.dto.UserInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserUpdateCompleteAction extends ActionSupport implements SessionAware{

	private String login_id;
	private String oldlogin_pass;
	private String newlogin_pass;
	List<UserInfoDTO>updatedList=new ArrayList<UserInfoDTO>();
	private Map<String ,Object>session;

	public String execute() throws SQLException{
		String ret=ERROR;
		UserUpdateCompleteDAO userUpdateCompleteDAO=new UserUpdateCompleteDAO();
		int count=userUpdateCompleteDAO.update(login_id, oldlogin_pass,newlogin_pass);
		if(count>0){
			updatedList=userUpdateCompleteDAO.select();
			session.put("updatedList",updatedList);
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
	public String getOldlogin_pass(){
		return oldlogin_pass;
	}
	public void setOldlogin_pass(String oldlogin_pass){
		this.oldlogin_pass=oldlogin_pass;
	}
	public String getNewlogin_pass(){
		return newlogin_pass;
	}
	public void setNewlogin_pass(String newlogin_pass){
		this.newlogin_pass=newlogin_pass;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}

}
