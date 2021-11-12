package com.moodanalyzer;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_Whensad_ShouldReturnSad() {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = "I am in sad mood";
		String expectedValue = "SAD";
		String mood = moodAnalyzer.analyzeMood(message);
		
		Assert.assertEquals(expectedValue, mood);
		
	}
	@Test
	public void givenMessage_AnyMsg_ShouldReturnHappy() {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = "I am in any mood";
		String expectedValue = "HAPPY";
		String mood = moodAnalyzer.analyzeMood(message);
		
		Assert.assertEquals(expectedValue, mood);
		
	}
	
	@Test
	public void givenMessage_Whenhappy_ShouldReturnHappy() {
		
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String message = "This is happy message";
		String expectedValue = "HAPPY";
		String mood = moodAnalyzer.analyzeMood(message);
		
		Assert.assertEquals(expectedValue, mood);
		
	}
	
}
