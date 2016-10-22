
package com.test.library;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class GenericLib {
	static public String sDirPath = System.getProperty("user.dir");
	public static String sConfigFile = sDirPath+"\\Config.properties";
	   
	public static String getCongigValue(String sFile, String sKey) {
		Properties prop = new Properties();
		String sValue = null;
		try {
			InputStream input = new FileInputStream(sFile);
			prop.load(input);
			sValue = prop.getProperty(sKey);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sValue;
	}	
}