package com.moodanalyzer;

public class MoodAnalyzer {

	String message;

	public MoodAnalyzer() {}

	public MoodAnalyzer(String message) {
		super();
		this.message = message;
	}

	public String analyzeMood() throws MoodAnalysisException {
		try {
			if(message.contains("sad")) {
				return "SAD";}
			else
				return "HAPPY";	
		}
		catch(NullPointerException e){
			throw new MoodAnalysisException("Please enter proper message");
		}
	}

}
