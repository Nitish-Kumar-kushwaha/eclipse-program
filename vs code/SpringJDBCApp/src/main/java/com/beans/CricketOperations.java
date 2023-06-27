package com.beans;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class CricketOperations {
	
	private DataSource dSource;
	private JdbcTemplate jt;
	
	
	public DataSource getdSource() {
		return dSource;
	}
	public void setdSource(DataSource dSource) {
		this.dSource = dSource;
		jt = new JdbcTemplate(dSource);
	}
	
	public int AddCricketrsDetails (Cricket crk) {
		
		String inscmd = "Insert into cricket(crkName , typeofgame, runs) values(?,?,?)";
		
		int result = jt.update(inscmd , new Object[] {crk.getCrkName(), crk.getTypeofgame(), crk.getRuns()});
		
		return result;
	}
	
	public List<Cricket> showAll(){
		
		List<Cricket> crkAll = jt.query("Select * from cricket", new BeanPropertyRowMapper(Cricket.class));
		return crkAll;
		
		
	}
	
	public Cricket SearchCricketInfo(int cno) {
		Cricket cinfo = null;
		
		try {
		
		/**
		List<Cricket> crkAll = jt.query("Select * from cricket", new BeanPropertyRowMapper(Cricket.class));
		
		for(Cricket c : crkAll) {
			if(c.getCno() == cno) {
				cinfo = c;
				return cinfo;
			}
		} **/
		
		
		String sql = "Select * from cricket where cno=?";
		
		cinfo = jt.queryForObject(sql, new Object [] {cno} , new BeanPropertyRowMapper(Cricket.class));
		
		} catch (Exception e) {
			cinfo = null;
		}
		
		return cinfo;
		
	}
	
	public int updateCricketDetails(Cricket crk) {
		
		String stmt = "Update cricket set crkName=? where cno=?";
		int result = jt.update(stmt, new Object[] {crk.getCrkName() , crk.getCno()});
		return result;
	}
	
	public List<CricketInfo> findAll(){
		
		List<CricketInfo> crkAll = jt.query("Select * from cricket", new CricktRowMapper());
		return crkAll;
		
		
	}
	
	
	

}
