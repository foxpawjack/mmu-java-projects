package com.jack;

import java.io.*;
import java.util.*;

public class FileReading {
	
	private List<FileData> listData = new ArrayList<FileData>();
	private String path;
	
	public FileReading(String path) {
		this.path = path;
	}
	
	public List<FileData> getDataList() {
		return listData;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setPath (String path) {
		this.path = path;
	}
	
	public void readFile() throws IOException, FileNotFoundException {
		
		@SuppressWarnings("resource")
		BufferedReader in = new BufferedReader(new FileReader(path));
		
		String line = null;
		
		while((line = in.readLine())!=null) {
			String[] splits = line.split(",");
			
			FileData d = new FileData();
			int year = Integer.parseInt(splits[0]);
			int month = Integer.parseInt(splits[1]);
			double tempmax = Double.parseDouble(splits[2]);
			double tempmin = Double.parseDouble(splits[3]);
			double af = Double.parseDouble(splits[4]);
			double rainmm = Double.parseDouble(splits[5]);
			double sunhour = Double.parseDouble(splits[6]);
			
			d.setYear(year);
			d.setMonth(month);
			d.setTempmax(tempmax);
			d.setTempmin(tempmin);
			d.setAf(af);
			d.setRainmm(rainmm);
			d.setSunhour(sunhour);
			
			listData.add(d);
		}
	}

}
