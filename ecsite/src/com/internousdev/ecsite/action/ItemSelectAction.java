package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemSelectDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemSelectAction extends ActionSupport implements SessionAware{

	private List<BuyItemDTO> buyItemDTOList=new ArrayList<BuyItemDTO>();
	private Map<String, Object>session;
	public String execute() throws SQLException{
		ItemSelectDAO itemSelectDAO=new ItemSelectDAO();
		buyItemDTOList=itemSelectDAO.getItemList();
		String result=SUCCESS;
		return result;
	}
	public List<BuyItemDTO>getBuyItemDTOList(){
		return buyItemDTOList;
	}
	public void setBuyItemDTOList(List<BuyItemDTO>buyItemDTOList){
		this.buyItemDTOList=buyItemDTOList;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public Map<String ,Object>getSession(){
		return session;
	}
}