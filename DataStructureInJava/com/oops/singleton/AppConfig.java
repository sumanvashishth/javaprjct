package com.oops.singleton;

public class AppConfig {
	
	private AppConfig() {
		
	}
	private static AppConfig AC = null;
	
	public static AppConfig getInstance() {
		if(AC == null) {
			AC = new AppConfig();
		}
		return AC;
	}
	
}
