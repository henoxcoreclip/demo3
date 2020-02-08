package com.example.demo3;

public class Player {
	private int id;
	private String ename;
	private String team;
	private int points;

	public Player(int id, String ename, String team, int points) {
		this.id = id;
		this.ename = ename;
		this.team = team;
		this.points = points;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

}
