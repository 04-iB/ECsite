package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserBuyInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserBuyListDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	public List<UserBuyInfoDTO> getUserBuyList() throws SQLException {
		List<UserBuyInfoDTO> userBuyInfoDTOList = new ArrayList<UserBuyInfoDTO>();
		String sql ="SELECT * FROM user_buy_item_transaction ORDER BY id";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				UserBuyInfoDTO dto = new UserBuyInfoDTO();
				dto.setId(resultSet.getString("item_transaction_id"));
				dto.setTotalPrice(resultSet.getString("total_price"));
				dto.setTotalCount(resultSet.getString("total_count"));
				dto.setUserName(resultSet.getString("user_master_id"));
				dto.setPay(resultSet.getString("pay"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				dto.setDelete_date(resultSet.getString("delete_date"));
				userBuyInfoDTOList.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return userBuyInfoDTOList;
	}

}
