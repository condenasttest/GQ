package com.publictest;

import java.io.IOException;

import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class publicBase extends UiAutomatorTestCase {
	
	/*
	 * 焦点对应的activity
	 * adb shell dumpsys activity | find "mF"
	 * 包的所有activity等
	 * adb shell dumpsys package com.condenast.gq24
	 * 启动activity
	 * adb shell am start -n com.condenast.gq24/.splash.WelcomeActivity
	 * splash.WelcomeActivity
	 * com.condenast.gq24
	 * 
	 */
}
