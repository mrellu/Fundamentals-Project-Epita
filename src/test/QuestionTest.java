/*
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import fr.epita.quiz.datamodel.Answer;
import fr.epita.quiz.datamodel.Question;
// TODO: Auto-generated Javadoc

/**
 * The Class QuestionTest.
 *
 * @author mahesh
 */
public class QuestionTest {
	
	/**
	 * Pojo test.
	 */
	@Test
	public void pojoTest() {
		int diff = 2;
		Question ques = new Question("Who is Mahes?", null, diff);
		assertEquals("Who is Mahes?", ques.getContent());
		assertNotNull(ques.getDifficulty());
		Answer ans = new Answer("Java", "SQL", "SSD", "Data", "Data");
		assertNotNull(ans.getOptA());
		assertNotNull(ans.getOptB());
		assertNotNull(ans.getOptC());
		assertNotNull(ans.getOptD());
		
		

	}

}
