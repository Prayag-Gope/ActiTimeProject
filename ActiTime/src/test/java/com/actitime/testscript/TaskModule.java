package com.actitime.testscript;

import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;

public class TaskModule extends BaseClass{
	
	@Test
	public void testTaskModule() {
		FileLib fl= new FileLib();
		HomePage h= new HomePage(driver);
		h.setTask();
		
	}

}
