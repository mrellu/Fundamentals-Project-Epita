package fr.epita.quiz.launcher;

import java.util.Scanner;

import fr.epita.quiz.exception.CreateFailedException;
// TODO: Auto-generated Javadoc

/**
 * The Class Launcher.
 *
 * @author mahesh
 */
public class Launcher {

	/** The sc. */
	private static Scanner sc;
	
	/** The opt. */
	private static int opt;
		
/**
 * Main method starts from the execution will start.
 *
 * @param args the arguments
 * @throws CreateFailedException the create failed exception
 */
	public static void main(String[] args) throws CreateFailedException {
		System.out.print("Welcome to the epita Quiz\n");
		System.out.print("Please select the option\n");
		System.out.print("1.Admin\n2.Student\n");
		sc = new Scanner(System.in);
		opt = Integer.parseInt(sc.nextLine());
		if(opt==1) {
			System.out.println("You Are Admin");
			Admin adm=new Admin();
			adm.myAdmin();
		}
		else if(opt==2) {
			System.out.println("You Are A Student");
			Student sdnt=new Student();
			sdnt.myStudent();
			
		}
		else 
		{
			System.out.println("Entered Wrong Answer");
		}
		}	



}
