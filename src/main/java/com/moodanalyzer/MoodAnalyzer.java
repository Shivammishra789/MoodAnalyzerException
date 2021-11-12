package com.moodanalyzer;

public class MoodAnalyzer {
	
	String message;
	
	public MoodAnalyzer() {}
	
	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}
	
	public String analyzeMood() {
		try {
		if(message.contains("sad")) {
			return "SAD";}
		else
			return "HAPPY";	
		}
		catch(NullPointerException e){
			return "HAPPY";
		}
	}

}
