/*
 * 
 */
package fr.epita.quiz.datamodel;

// TODO: Auto-generated Javadoc
/**
 * The Class Answer.
 *
 * @author mahesh
 */
public class Answer {
	
	/** The text. */
	private String text;
	
	/** The quiz. */
	private Quiz quiz;
	
	/** The question. */
	private Question question;
	
	/** The opt A. */
	private String optA;
	
	/** The opt B. */
	private String optB;
	
	/** The opt C. */
	private String optC;
	
	/** The opt D. */
	private String optD;

/**
 * 	
 * @return quiz values, pojo to return quiz 
 */
	public Quiz getQuiz() {
		return quiz;
	}

/**
 * Sets the quiz.
 *
 * @param quiz values, pojo to set quiz
 */

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}

/**
 * Gets the question.
 *
 * @return question value, pojo to return question
 */
	public Question getQuestion() {
		return question;
	}

/**
 * Sets the question.
 *
 * @param question values, pojo to set question
 */

	public void setQuestion(Question question) {
		this.question = question;
	}

/**
 * POJO constructor to create Answer .
 *
 * @param text the text
 * @param optA the opt A
 * @param optB the opt B
 * @param optC the opt C
 * @param optD the opt D
 */

	public Answer(String text, String optA, String optB, String optC, String optD) {
		this.text = text;
		this.optA = optA;
		this.optB = optB;
		this.optC =  optC;
		this.optD = optD;
	}

/**
 * Gets the text.
 *
 * @return text values, pojo to return text
 */
	
	public String getText() {
		return text;
	}

/**
 * Sets the text.
 *
 * @param text values, pojo to set text
 */
	public void setText(String text) {
		this.text = text;
	}

/**
 * Gets the opt A.
 *
 * @return optA values, pojo to return optA
 */
	public String getOptA() {
		return optA;
	}

/**
 * Sets the opt A.
 *
 * @param optA values, pojo to set optA
 */
	public void setOptA(String optA) {
		this.optA = optA;
	}

/**
 * Gets the opt B.
 *
 * @return optB values, pojo to return optB
 */
	public String getOptB() {
		return optB;
	}

/**
 * Sets the opt B.
 *
 * @param optB values, pojo to set optB
 */
	public void setOptB(String optB) {
		this.optB = optB;
	}

/**
 * Gets the opt C.
 *
 * @return optC values, pojo to return optC
 */
	public String getOptC() {
		return optC;
	}

/**
 * Sets the opt C.
 *
 * @param optC values, pojo to set  optC
 */
	public void setOptC(String optC) {
		this.optC = optC;
	}

/**
 * Gets the opt D.
 *
 * @return optD values, pojo to return optD
 */
	public String getOptD() {
		return optD;
	}

/**
 * Sets the opt D.
 *
 * @param optD values, pojo to set optD
 */
	public void setOptD(String optD) {
		this.optD = optD;
	}

/**
 * To string.
 *
 * @return the string
 */
	@Override
	public String toString() {
		return "Answer \t[text=" + text + ", \n quiz=" + quiz + ", \n question=" + question + "\n]";
	}
	
	


	
	
	
	
	

}
