package com.jacknoble;

import java.io.*;
import java.util.*;

public class CsvReader {
	//This class reads the CSV file which is part of the project.
	//In an actual program, this would be represented with a file picker.
	
	private List<FileData> dataList = new ArrayList<FileData>();
	private String path;
	boolean hasHeader = false;
	
	public CsvReader(String path) {
		this.path = path;
	}
		
	public void setHasHeader(boolean hasHeader) {
		this.hasHeader = hasHeader;
	}

	public List<FileData> getDataList() {
		return dataList;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public void readFile() throws IOException, FileNotFoundException {
		
		BufferedReader in = new BufferedReader (new FileReader(path));
		
		String line = null;
		int count = 0;
		while((line = in.readLine()) != null) {
			if(hasHeader == true && count>0){
				
			
			String[] splits = line.split(",");
				
			FileData d = new FileData();
			int year = Integer.parseInt(splits[0]);
			String teamId = splits[1];
			String leagueId = splits[2];
			String playerId = splits[3];
			double salary = Double.parseDouble(splits[4]);
				
			d.setYear(year);
			d.setTeamId(teamId);
			d.setLeagueId(leagueId);
			d.setPlayerId(playerId);
			d.setSalary(salary);
				
			dataList.add(d);
			}
			count++;
		}
	}
}
