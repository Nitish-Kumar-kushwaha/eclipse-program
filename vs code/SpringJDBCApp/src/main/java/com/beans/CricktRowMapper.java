package com.beans;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CricktRowMapper implements RowMapper<CricketInfo> {

	public CricketInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		CricketInfo crkInfo = new CricketInfo();
		crkInfo.setCkrno(rs.getInt("cno"));
		crkInfo.setCrkName(rs.getString("crkName"));
		crkInfo.setGame(rs.getString("typeofgame"));
		crkInfo.setRuns(rs.getInt("runs"));
		return crkInfo;
	}
	
	

}
