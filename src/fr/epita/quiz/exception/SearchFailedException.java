/*
 * 
 */
package fr.epita.quiz.exception;
// TODO: Auto-generated Javadoc

/**
 * The Class SearchFailedException.
 *
 * @author mahesh
 */
public class SearchFailedException extends DataAccessException {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -3941189717606529626L;

	/**
	 * Instantiates a new search failed exception.
	 *
	 * @param badInput the bad input
	 */
	public SearchFailedException(Object badInput) {
		super(badInput);
	}

	/**
	 * Instantiates a new search failed exception.
	 *
	 * @param badInput the bad input
	 * @param initialCause the initial cause
	 */
	public SearchFailedException(Object badInput, Exception initialCause) {
		super(badInput,initialCause);
	}

}
