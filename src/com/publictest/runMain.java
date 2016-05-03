package com.publictest;

public class runMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String jarName = "test";
		String testClass = "com.gq.gqtest";
		String testName = "test";
		String androidId = "10";
		
		String cmd = "cmd /c adb shell am start -n "+"com.condenast.gq24/.splash.WelcomeActivity";
		Runtime runtime=Runtime.getRuntime();
		try{
		runtime.exec(cmd);
		}catch(Exception e){
		System.out.println("Error!");
		e.printStackTrace();
		}
		
		new UiAutomatorHelper(jarName, testClass, testName, androidId);
	}

}
