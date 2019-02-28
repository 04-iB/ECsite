package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyItemDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ItemSearchCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	public List<BuyItemDTO>getItemList(String search)throws SQLException{
		List<BuyItemDTO> itemSearchDTOList=new ArrayList<BuyItemDTO>();
		String sql="SELECT*FROM item_info_transaction WHERE item_name like ?";

		try{
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setString(1, "%"+search+"%");
			ResultSet resultSet=preparedStatement.executeQuery();

			while(resultSet.next()){
				BuyItemDTO dto=new BuyItemDTO();
				dto.setItemName(resultSet.getString("item_name"));
				dto.setItemPrice(resultSet.getString("item_price"));
				itemSearchDTOList.add(dto);
			}
		}
		catch (Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return itemSearchDTOList;
	}
}