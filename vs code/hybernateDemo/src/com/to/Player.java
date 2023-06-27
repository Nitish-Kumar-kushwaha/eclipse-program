package com.to;



public class Player {
	private int player;
	private String playerName;
	private String teamName;
	private int age;
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Player [player=" + player + ", playerName=" + playerName + ", teamName=" + teamName + ", age=" + age
				+ "]";
	}
	public Player(int player, String playerName, String teamName, int age) {
		super();
		this.player = player;
		this.playerName = playerName;
		this.teamName = teamName;
		this.age = age;
	}
	
	
}
