package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ItemSearchCompleteDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ItemSearchCompleteAction extends ActionSupport implements SessionAware{

	private String search;
	private List<BuyItemDTO> searchItemDTOList=new ArrayList<BuyItemDTO>();
	private Map<String,Object>session;
	public String execute() throws SQLException{
		ItemSearchCompleteDAO itemSearchDAO=new ItemSearchCompleteDAO();
		searchItemDTOList=itemSearchDAO.getItemList(search);
		String result=SUCCESS;
		return result;
	}
	public String getSearch(){
		return search;
	}
	public void setSearch(String search){
		this.search=search;
	}
	public List<BuyItemDTO>getSearchItemDTOList(){
		return searchItemDTOList;
	}
	public void setSearchItemDTOList(List<BuyItemDTO>searchItemDTOList){
		this.searchItemDTOList=searchItemDTOList;
	}
	@Override
	public void setSession(Map<String,Object>session){
		this.session=session;
	}
	public Map<String,Object>getSession(){
		return session;
	}
}