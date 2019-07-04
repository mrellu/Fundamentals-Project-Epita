/*
 * 
 */
package fr.epita.quiz.services;
// TODO: Auto-generated Javadoc

/**
 * The Enum ConfigEntry.
 *
 * @author mahesh
 */
public enum ConfigEntry {
	
	/** The db queries quiz searchquery. */
	DB_QUERIES_QUIZ_SEARCHQUERY("db.queries.quiz.searchQuery"),
	
	/** The db url. */
	DB_URL("db.url"),
	
	/** The db username. */
	DB_USERNAME("db.username"),
	
	/** The db password. */
	DB_PASSWORD("db.password"),
;
	
	/** The key. */
	private String key;
	
	/**
	 * Gets the key.
	 *
	 * @return the key
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Instantiates a new config entry.
	 *
	 * @param key the key
	 */
	private ConfigEntry(String key) {
		this.key = key;
	}

}
