package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.InquiryDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class InquiryCompleteDAO {

	List<InquiryDTO> inquiryDTOList=new ArrayList<InquiryDTO>();
	DateUtil dateUtil=new DateUtil();

	public List<InquiryDTO> select(){
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();


		String sql="select*from inquiry";
		try{
			PreparedStatement ps= con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				InquiryDTO dto=new InquiryDTO();
				dto.setName(rs.getString("name"));
				dto.setAddress(rs.getString("address"));
				dto.setQtype(rs.getString("qtype"));
				dto.setBody(rs.getString("body"));
				dto.setInsert_date(rs.getString("insert_date"));
				inquiryDTOList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return inquiryDTOList;
	}
	public int insert(String name,String address,String qtype,String body){
		int ret=0;
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="insert into inquiry values(?,?,?,?,?)";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, address);
			ps.setString(3, qtype);
			ps.setString(4, body);
			ps.setString(5, dateUtil.getDate());
			int i=ps.executeUpdate();

			if(i>0){
				System.out.println(i+"件登録されました");
				ret=i;

			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return ret;
	}
}