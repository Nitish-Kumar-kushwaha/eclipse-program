package com.beans;

/**

create table cricket (
cno int auto_increment primary key,
crkName varchar(20) not null,
typeofgame varchar(10),
runs int 	
);
**/

public class Cricket {
	
	private int cno;
	private String crkName;
	private String typeofgame;
	private int runs;
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getCrkName() {
		return crkName;
	}
	public void setCrkName(String crkName) {
		this.crkName = crkName;
	}
	public String getTypeofgame() {
		return typeofgame;
	}
	public void setTypeofgame(String typeofgame) {
		this.typeofgame = typeofgame;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	

}
