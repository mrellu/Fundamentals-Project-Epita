package test;

import java.io.IOException;
import java.util.List;

import fr.epita.quiz.datamodel.Quiz;
import fr.epita.quiz.exception.CreateFailedException;
import fr.epita.quiz.exception.SearchFailedException;
import fr.epita.quizmgr.services.dao.QuizMgrDAO;

public class TestQuizFileDAO {
	
	public static void main(String[] args) throws IOException, CreateFailedException, SearchFailedException {
		//given
		QuizMgrDAO dao = new QuizMgrDAO();
		Quiz quiz = new Quiz("Intermediate Quiz for Java and OOP");

		dao.createAnswerForMCQ(null);
		
		List<Quiz> searchResults = dao.searchByQuestion(null);
		System.out.println(searchResults);
		if (searchResults.size() < 1) {
			System.out.println("error, got no result");
		}else {
			System.out.println("success!");
		}
		
		
	}

}
