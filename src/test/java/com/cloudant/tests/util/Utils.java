package com.cloudant.tests.util;

import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.logging.Log;

import com.cloudant.client.api.CloudantClient;

public class Utils {
	public static Properties getProperties(String configFile,Log log) {
		Properties properties = new Properties();
		try {
			InputStream instream = CloudantClient.class.getClassLoader().getResourceAsStream(configFile);
			properties.load(instream);
		} catch (Exception e) {
			String msg = "Could not read configuration file from the classpath: " + configFile;
			log.error(msg);
			throw new IllegalStateException(msg, e);
		}
		return properties;
	
	}
}
