/*
 * 
 */
package fr.epita.quiz.exception;
// TODO: Auto-generated Javadoc

/**
 * The Class DataAccessException.
 *
 * @author mahesh
 */
public class DataAccessException extends Exception {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8446384785560273367L;


	/**
	 * Gets the fault instance.
	 *
	 * @return the fault instance
	 */
	public Object getFaultInstance() {
		return faultInstance;
	}

/** The fault instance. */
	private final Object faultInstance;
	
	
	/**
	 * Instantiates a new data access exception.
	 *
	 * @param faultInstance the fault instance
	 */
	public DataAccessException(Object faultInstance) {
		this.faultInstance = faultInstance;
	}
	
	/**
	 * Instantiates a new data access exception.
	 *
	 * @param faultInstance the fault instance
	 * @param initialCause the initial cause
	 */
	public DataAccessException(Object faultInstance, Exception initialCause) {
		this.faultInstance = faultInstance;
		this.initCause(initialCause);
	}


}
