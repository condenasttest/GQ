package com.gq;

import com.android.uiautomator.core.UiDevice;
import com.publictest.publicBase;

public class gqtest extends publicBase{

	public void openfindapp(){
	}
	public void test(){
		sleep(1000);
		UiDevice.getInstance().pressBack();
	}
}
