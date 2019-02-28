package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.InquiryListDAO;
import com.internousdev.ecsite.dto.InquiryInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class InquiryListAction extends ActionSupport implements SessionAware {
	private List<InquiryInfoDTO> inquiryInfoDTOList = new ArrayList<InquiryInfoDTO>();
	private Map<String, Object> session;
	public String execute() throws SQLException {
		InquiryListDAO inquiryListDAO=new InquiryListDAO();
		inquiryInfoDTOList=inquiryListDAO.getInquiryList();
		String result=SUCCESS;
		return result;
	}

	public List<InquiryInfoDTO>getInquiryInfoDTOList() {
		return inquiryInfoDTOList;
	}
	public void setInquiryInfoDTOList(List<InquiryInfoDTO>inquiryInfoDTOList) {
		this.inquiryInfoDTOList=inquiryInfoDTOList;
	}
	@Override
	public void setSession(Map<String, Object>session) {
		this.session=session;
	}
	public Map<String, Object>getSession() {
		return session;
	}
}