package com.design.pattern.Adapter;

public class DataAnalyticsTool {
	String jsonData;
	
	DataAnalyticsTool(){
		
	}
	
	DataAnalyticsTool(String jsonData){
		this.jsonData = jsonData;
	}
	
	void analyseData() {
		System.out.println("Analysing data->"+jsonData);
	}
}
