/*
 * 
 */
package fr.epita.quiz.exception;
// TODO: Auto-generated Javadoc

/**
 * The Class CreateFailedException.
 *
 * @author mahesh
 */
public class CreateFailedException extends DataAccessException{

	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -925222541305304182L;

	/**
	 * Instantiates a new creates the failed exception.
	 *
	 * @param beanThatWasNotCreated the bean that was not created
	 */
	public CreateFailedException(Object beanThatWasNotCreated) {
		super(beanThatWasNotCreated);
	}
	
	/**
	 * Instantiates a new creates the failed exception.
	 *
	 * @param beanThatWasNotCreated the bean that was not created
	 * @param initialCause the initial cause
	 */
	public CreateFailedException(Object beanThatWasNotCreated, Exception initialCause) {
		super(beanThatWasNotCreated, initialCause);
	}

}
