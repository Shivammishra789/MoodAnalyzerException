package com.moodanalyzer;

import org.junit.Test;

import org.junit.Assert;

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_Whensad_ShouldReturnSad() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("SAD", mood);	
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals("HAPPY", mood);	
	}

	// Testing for catching exception and displaying our defined message
	@Test
	public void givenNullMood_Should_Throw_Exception() throws MoodAnalysisException {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
			moodAnalyzer.analyzeMood();
		}
		catch(MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
		}	
	}
	
	@Test
	public void givenEmptyMood_Should_Throw_Exception() throws MoodAnalysisException {
		try {
			MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
			moodAnalyzer.analyzeMood();
		}
		catch(MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
		}	
	}
}
