/*
 * 
 */
package fr.epita.quiz.services;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class ConfigurationService.
 *
 * @author mahesh
 */
public class ConfigurationService {

	/** The instance. */
	private static ConfigurationService instance;
	
	/** The props. */
	Properties props = new Properties();
	
	/** The init. */
	boolean init = false;
	
	/**
	 * Configuration of the data base.
	 */
	private ConfigurationService() {
		// properties loading
		try {
			File confFile = new File("conf.properties");
			FileInputStream ips = new FileInputStream(confFile);
			props.load(ips);
			init =true;
		} catch (Exception e) {
			init=false;
		}

	}

/**
 * Gets the single instance of ConfigurationService.
 *
 * @return single instance of ConfigurationService
 * @returns ConfigurationService instance
 */
	public static ConfigurationService getInstance() {
		if (instance == null) {
			instance = new ConfigurationService();
		}
		return instance;
	}
	
	/**
	 * Checks if is inits the.
	 *
	 * @return true, if is inits the
	 */
	public boolean isInit() {
		return init;
	}

/**
 * gets ConfigurationValue.
 *
 * @param key the key
 * @param defaultValue the default value
 * @return property value
 */

	public String getConfigurationValue(String key, String defaultValue) {
		return props.getProperty(key, defaultValue);
	}

/**
 * Gets the configuration value.
 *
 * @param key the key
 * @param defaultValue the default value
 * @return Property
 */
	public String getConfigurationValue(ConfigEntry key, String defaultValue) {
		return props.getProperty(key.getKey(), defaultValue);
	}

}
