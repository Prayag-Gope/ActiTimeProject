package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	public String getpropertyData(String key) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\Selenium_Maven\\ActiTime\\src\\main\\resources\\Data\\commonData.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(getpropertyData(key));
		return data;	
	}

}
