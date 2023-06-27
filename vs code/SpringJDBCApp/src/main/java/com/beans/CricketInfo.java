package com.beans;

/**

create table cricket (
cno int auto_increment primary key,
crkName varchar(20) not null,
typeofgame varchar(10),
runs int 	
);
**/

public class CricketInfo {
	
	private int ckrno;
	private String crkName;
	private String game;
	private int runs;
	public int getCkrno() {
		return ckrno;
	}
	public void setCkrno(int ckrno) {
		this.ckrno = ckrno;
	}
	public String getCrkName() {
		return crkName;
	}
	public void setCrkName(String crkName) {
		this.crkName = crkName;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	
	

}
