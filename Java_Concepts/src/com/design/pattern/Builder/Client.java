package com.design.pattern.Builder;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HPDesktopBuilder hpDesktopBuilder = new HPDesktopBuilder();
		DellDesktopBuilder dellDesktopBuilder = new DellDesktopBuilder();
		
		DesktopDirector dir1 = new DesktopDirector(hpDesktopBuilder);
		DesktopDirector dir2 = new DesktopDirector(dellDesktopBuilder);
		
		Desktop desk1 = dir1.buildDesktop();
		Desktop desk2 = dir2.buildDesktop();
		
		System.out.println(desk1.showSpecs());
		System.out.println(desk2.showSpecs());
	}

}
