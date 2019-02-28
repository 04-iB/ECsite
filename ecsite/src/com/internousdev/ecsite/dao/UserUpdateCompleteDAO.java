package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserUpdateCompleteDAO {

	List<UserInfoDTO> updatedList=new ArrayList<UserInfoDTO>();
	DateUtil dateUtil=new DateUtil();

	public List<UserInfoDTO>select()throws SQLException{

		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select*from login_user_transaction";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				UserInfoDTO dto=new UserInfoDTO();
				dto.setPassword(rs.getString("login_id"));
				dto.setLogin_id(rs.getString("login_pass"));
				dto.setUpdated_date(rs.getString("updated_date"));
				updatedList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return updatedList;
	}

	public int update(String login_id ,String oldlogin_pass,String newlogin_pass){
		int ret=0;
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		String sql="UPDATE login_user_transaction SET login_user_transaction.login_pass=? , login_user_transaction.updated_date=? WHERE login_user_transaction.login_id=? && login_user_transaction.login_pass=? ";

		try{
			PreparedStatement ps=con.prepareCall(sql);
			ps.setString(1, newlogin_pass);
			ps.setString(2, dateUtil.getDate());
			ps.setString(3, login_id);
			ps.setString(4, oldlogin_pass);
			int i=ps.executeUpdate();
			if(i>0){
				System.out.println(i+"件更新されました。");
				ret=i;
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return ret;
	}

}