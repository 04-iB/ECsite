package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserBuyListDAO;
import com.internousdev.ecsite.dto.UserBuyInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserBuyListAction extends ActionSupport implements SessionAware {
	private List<UserBuyInfoDTO> userBuyInfoDTOList = new ArrayList<UserBuyInfoDTO>();
	private Map<String, Object> session;

	public String execute() throws SQLException {
		UserBuyListDAO userBuyListDAO = new UserBuyListDAO();
		userBuyInfoDTOList = userBuyListDAO.getUserBuyList();
		String result = SUCCESS;
		return result;
	}

	public List<UserBuyInfoDTO> getUserBuyInfoDTOList() {
		return userBuyInfoDTOList;
	}
	public void setUserBuyInfoDTOList(List<UserBuyInfoDTO> userBuyInfoDTOList) {
		this.userBuyInfoDTOList = userBuyInfoDTOList;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public Map<String, Object> getSession() {
		return session;
	}
}