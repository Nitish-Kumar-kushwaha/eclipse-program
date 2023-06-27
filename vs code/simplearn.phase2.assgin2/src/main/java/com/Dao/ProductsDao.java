package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connections.DBConnection;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

public class ProductsDao {
	
	Connection conObj = null;

	public ProductsDao() {
		
		conObj = DBConnection.GetConnection();
	}
	
	public Products search(int id) {
		Products p = null;
		
		try {
			
			PreparedStatement ps = conObj.prepareStatement("select * from itemInfo where id =?");
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				p = new Products();
				p.setId(rs.getInt("id"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getFloat("price"));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			p=null;
			
			System.out.println(e);
		}
		
		
		return p;
	}
	
	

}
