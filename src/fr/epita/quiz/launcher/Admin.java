/*
 * 
 */
	package fr.epita.quiz.launcher;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.datamodel.Quiz;
import fr.epita.quiz.exception.CreateFailedException;
import fr.epita.quiz.services.data.QuizJDBCDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class Admin.
 *
 * @author mahesh
 */
public class Admin {

	/** The lgn. */
	private static  String LGN = "ADM";
	
	/** The pass. */
	private static String PASS = "ADM";
	
	/** The dao data. */
	private static QuizJDBCDAO daoData = QuizJDBCDAO.getInstance();
	
	/** The topic. */
	private static String topic;
	
	/** The quiz id. */
	private static int quizId;

/**
 * Constructor for Admin.
 *
 * @throws CreateFailedException the create failed exception
 */
	public  void myAdmin() throws CreateFailedException {

		Scanner scn = new Scanner(System.in);
		boolean authenticated = authenticate(scn);
		if (!authenticated) {
			scn.close();
			return;
		}
		
		System.out.println("You're authenticated");
		String answer = "";
		
		while (!answer.equals("q")) {			
			answer = menuDsply(scn);
			switch (answer) {
			case "1":
				quizCreation(scn);
				break;
			case "2":
				createQstn(scn);
				break;
			case "3":
				updtQstn(scn);
				break;
			case "4":
				delQstn(scn);
				break;
			case "5":
				searchQstn(scn);
				break;
			case "q":
				System.out.println("Good bye!");
				break;
			default:
				System.out.println("Option not recognized, please enter an other option");
				break;
			}
		}

		scn.close();

	}

/**
 * searchQuestion.
 *
 * @param sc the sc
 */
	private static void searchQstn(Scanner sc) {
		
		System.out.println("Welcome to Search a Question");
		System.out.println("Enter Topic to Search");
		String tpc = sc.nextLine();
		List<Question> quesList = daoData.searchQ(tpc);
		System.out.println("Questions retreveid basede on Topics are given below::");

		for (Question q : quesList) {
			System.out.println(			q.getContent());
		}

	}

/**
 * Delete Question.
 *
 * @param sc the sc
 */
	private static void delQstn(Scanner sc) {
		boolean isExec = false;
		System.out.println("Welcome to Delete a Question");
		System.out.println("Enter Topic to Delete");
		String tpc = sc.nextLine();
		System.out.println("Enter Question to delete: ");
		String question = sc.nextLine();
		
		HashMap<String, String> delMap = new HashMap<String, String>();
		delMap.put("tpc", tpc);
		delMap.put("question", question);
		

		isExec = daoData.delQuestion(delMap);
		if(isExec) {
			System.out.println("Question deleted Successfully.");
		}
		
	}

/**
 * update question.
 *
 * @param sc the sc
 */
	private static void updtQstn(Scanner sc) {
		boolean isExec = false;
		System.out.println("Welcome to Update a Question");
		System.out.println("Enter Topic");
		String topic = sc.nextLine();
		System.out.println("Enter Difficulty");
		String diff = sc.nextLine();
		System.out.println("Enter Old Question");
		String oldQ = sc.nextLine();
		System.out.println("Enter New Question");
		String newQ = sc.nextLine();
		
		HashMap<String, String> updtMap = new HashMap<String, String>();
		updtMap.put("topic", topic);
		updtMap.put("diff", diff);
		updtMap.put("oldQ", oldQ);
		updtMap.put("newQ", newQ);

		isExec = daoData.updtQuestion(updtMap);
		if(isExec) {
			System.out.println("Question updated Successfully.");
		}

	}

/**
 * Create Question.
 *
 * @param sc the sc
 */
	private static void createQstn(Scanner sc) {
		boolean isExec = false;
		
		List<Quiz> quizList = daoData.getQuiz();
		
		for (Quiz quiz : quizList) { 		      
	           System.out.println(quiz.getId() + " " + quiz.getTitle()); 		
	      }
		System.out.println("Select Quiz Title ? :");
		String id = sc.nextLine();
		System.out.println("\nSelect the type of question 1.Open Question\n2.Multiple Answer");
		quizId = Integer.parseInt(sc.nextLine());
		if(quizId==2) {
		
		System.out.println("Welcome to create a Multiple Question");
		System.out.println("Enter Question: ");
		String question = sc.nextLine();
		System.out.println("Enter Topic: ");
		String topic = sc.nextLine();
		System.out.println("Enter Difficulty: ");
		String diff = sc.nextLine();
		System.out.println("Enter Option A: ");
		String optA = sc.nextLine();
		System.out.println("Enter Option B: ");
		String optB = sc.nextLine();
		System.out.println("Enter Option C: ");
		String optC = sc.nextLine();
		System.out.println("Enter Option D: ");
		String optD = sc.nextLine();
		System.out.println("Enter Actual right Answer: ");
		String cAns = sc.nextLine();
		
		HashMap<String, String> qMap = new HashMap<String, String>();
		qMap.put("id", id);
		qMap.put("question", question);
		qMap.put("topic", topic);
		qMap.put("diff", diff);
		qMap.put("optA", optA);
		qMap.put("optB", optB);
		qMap.put("optC", optC);
		qMap.put("optD", optD);
		qMap.put("cAns", cAns);
		
		isExec = daoData.createQuestion(qMap);
		if(isExec) {
			System.out.println("Question and Answers are created Successfully.");
		}
		}
		else if(quizId==1) {
			System.out.println("Welcome to create a Open Question");
			System.out.println("Enter Question: ");
			String question = sc.nextLine();
			System.out.println("Enter Topic: ");
			String topic = sc.nextLine();
			System.out.println("Enter Difficulty: ");
			String diff = sc.nextLine();
			System.out.println("Enter Hint: ");
			String hint = sc.nextLine();
			System.out.println("Enter Actual right Answer: ");
			String cAns = sc.nextLine();
			
			HashMap<String, String> quesMap = new HashMap<String, String>();
			quesMap.put("id", id);
			quesMap.put("question", question);
			quesMap.put("topic", topic);
			quesMap.put("diff", diff);
			quesMap.put("optD", hint);
			quesMap.put("cAns", cAns);
			
			isExec = daoData.createOpenQues(quesMap);
			if(isExec) {
				System.out.println("Question and Answers are created Successfully.");
			}
			
		}
			


	}

/**
 * quiz Creation.
 *
 * @param sc the sc
 * @throws CreateFailedException the create failed exception
 */
	
	@SuppressWarnings("resource")
	private static void quizCreation(Scanner sc) throws CreateFailedException {
		boolean isExec=false;
		System.out.println("Please Enter Your Topic \n");
		sc = new Scanner(System.in);
		topic = sc.nextLine();
		isExec = daoData.createTopic(topic);
		if(isExec) {
			System.out.println("Question and Answers are created Successfully. \n");
		}
	}

/**
 * Displays Menu.
 *
 * @param scanner the scanner
 * @return the string
 */
	
	private static String menuDsply(Scanner scanner) {
		String answer;
		System.out.println(" Welcome to Admininstrator Console");
		System.out.println("1. Create Quiz");
		System.out.println("2. Create Question");
		System.out.println("3. Update Question");
		System.out.println("4. Delete Question");
		System.out.println("5. Search Question");
		System.out.println("q. Quit");
		System.out.println("What is your choice ? (1|2|q) : \n");
		answer = scanner.nextLine();
		return answer;
	}

	/**
	 * Authenticates the user.
	 *
	 * @param scanner the scanner
	 * @return true, if successful
	 */
	private static boolean authenticate(Scanner scanner) {
		boolean b=false;
		System.out.println("Please enter your login : \n");
		LGN = scanner.next();
		LGN=LGN.toUpperCase();
		System.out.println("Please enter your password : \n");
		PASS = scanner.next();
		String isExec = daoData.selectUser(LGN);
		if(isExec.equals(PASS)) {
			System.out.println("Login Sucessfull \n");
			b=true;
		}
		else {
			System.out.println("Invalid Credentilas \n");	
			b=false;
			}
		return b;
	}

}
