package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.InquiryInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
public class InquiryListDAO {
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	public List<InquiryInfoDTO> getInquiryList () throws SQLException {
		List<InquiryInfoDTO> inquiryInfoDTOList=new ArrayList<InquiryInfoDTO>();
		String sql ="SELECT * FROM inquiry";
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) {
				InquiryInfoDTO dto = new InquiryInfoDTO();
				dto.setName(resultSet.getString("name"));
				dto.setAddress(resultSet.getString("address"));
				dto.setQtype(resultSet.getString("qtype"));
				dto.setBody(resultSet.getString("body"));
				dto.setInsert_date(resultSet.getString("insert_date"));
				inquiryInfoDTOList.add(dto);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
		}
		return inquiryInfoDTOList;
	}
}
