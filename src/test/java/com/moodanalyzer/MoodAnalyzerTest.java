package com.moodanalyzer;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_Whensad_ShouldReturnSad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD", mood);	
	}
	
	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);	
	}
}
