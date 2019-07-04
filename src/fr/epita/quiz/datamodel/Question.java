/*
 * 
 */
package fr.epita.quiz.datamodel;

import java.util.Arrays;
// TODO: Auto-generated Javadoc

/**
 * The Class Question.
 *
 * @author mahesh
 */
public class Question {
	
	/** The content. */
	private String content;
	
	/** The topics. */
	private String[] topics;
	
	/** The difficulty. */
	private Integer difficulty;
	
	
	/**
	 * Instantiates a new question.
	 *
	 * @param content the content
	 * @param topics the topics
	 * @param difficulty the difficulty
	 */
	public Question(String content, String[] topics, Integer difficulty) {
		this.content = content;
		this.topics = topics;
		this.difficulty = difficulty;
	}
	
	/**
	 * Instantiates a new question.
	 *
	 * @param content the content
	 */
	public Question(String content) {
		this.content = content;
	}
	
	
	/**
	 * Gets the content.
	 *
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	
	/**
	 * Sets the content.
	 *
	 * @param content the new content
	 */
	public void setContent(String content) {
		this.content = content;
	}
	
	/**
	 * Gets the topics.
	 *
	 * @return the topics
	 */
	public String[] getTopics() {
		return topics;
	}
	
	/**
	 * Sets the topics.
	 *
	 * @param topics the new topics
	 */
	public void setTopics(String[] topics) {
		this.topics = topics;
	}
	
	/**
	 * Gets the difficulty.
	 *
	 * @return the difficulty
	 */
	public Integer getDifficulty() {
		return difficulty;
	}
	
	/**
	 * Sets the difficulty.
	 *
	 * @param difficulty the new difficulty
	 */
	public void setDifficulty(Integer difficulty) {
		this.difficulty = difficulty;
	}


	/**
	 * To string.
	 *
	 * @return the string
	 */
	@Override
	public String toString() {
		return "Question [content=" + content + ", topics=" + Arrays.toString(topics) + ", difficulty=" + difficulty
				+ "]";
	}
	
	
	
	
	
	

}
