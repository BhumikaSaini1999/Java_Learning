package com.design.pattern.Adapter;

public class Adapter extends DataAnalyticsTool{
	
	private XMLData xmlData;

	Adapter(XMLData xmlData) {
		this.xmlData = xmlData;
	}
	
	@Override
	void analyseData() {
		System.out.println("Converting XML data ->"+xmlData.getXMLData()+" to json Data");
		System.out.println("Analysing the converted JSON data");
	}

}
