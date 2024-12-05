package com.design.pattern.Adapter;

public class Main {
	public static void main(String[] args) {
		XMLData xmlData = new XMLData("Sample XML data");
		//DataAnalyticsTool tool = new DataAnalyticsTool();//it will expect json data
		
		DataAnalyticsTool tool = new Adapter(xmlData);
		
		Client client = new Client();
		client.processData(tool);
		
	}
}
