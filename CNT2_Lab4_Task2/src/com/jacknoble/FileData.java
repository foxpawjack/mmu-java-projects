package com.jacknoble;

public class FileData {
	
	//This file acts as a getter for the data, in this program the getters read the
	//file instead of console input. The setters then take this data from the file.
	
	private int year;
	private String teamId;
	private String leagueId;
	private String playerId;
	private double salary;
	
	public FileData(){ };
	
	public FileData(int year, String teamId, String leagueId, String playerId, double salary) {
		this.year = year;
		this.teamId = teamId;
		this.leagueId = leagueId;
		this.playerId = playerId;
		this.salary = salary;
	}

	public double getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Data [Year=" + year + ", Team=" + teamId + ", League=" + leagueId + ", Name=" + playerId
				+ ", Salary=" + salary + "]";
	}
	
	

}
