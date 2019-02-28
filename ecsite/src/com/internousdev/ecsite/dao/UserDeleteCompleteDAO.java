package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.UserInfoDTO;
import com.internousdev.ecsite.util.DBConnector;

public class UserDeleteCompleteDAO {

	List<UserInfoDTO> deleteList=new ArrayList<UserInfoDTO>();


	public List<UserInfoDTO>select() throws SQLException{
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();

		String sql="select*from login_user_transaction";
		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();

			while(rs.next()){
				UserInfoDTO dto=new UserInfoDTO();
				dto.setLogin_id(rs.getString("login_id"));
				dto.setPassword(rs.getString("login_pass"));
				deleteList.add(dto);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		try{
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return deleteList;
	}
	public int deleteUser(String login_id,String login_pass){
		int ret=0;
		DBConnector db=new DBConnector();
		Connection con=db.getConnection();
		String sql="DELETE FROM login_user_transaction WHERE login_user_transaction.login_id=? && login_user_transaction.login_pass=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,login_id);
			ps.setString(2, login_pass);
			int i=ps.executeUpdate();

			if(i>0){
				System.out.println(i+"件削除されました。");
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