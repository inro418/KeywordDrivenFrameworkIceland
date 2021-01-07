package com.qa.iceland.test;

import org.testng.annotations.Test;

import com.qa.iceland.keyword.engine.KeyWordEngine;

public class SigninTest {

	public KeyWordEngine keyWordEngine;
	
	@Test
	public void login_test(){
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("Sheet1");   
	}
}
