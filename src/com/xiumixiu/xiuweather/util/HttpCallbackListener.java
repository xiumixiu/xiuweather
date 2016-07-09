package com.xiumixiu.xiuweather.util;

public interface HttpCallbackListener {
	void onFinish(String response);
	
	void onError(Exception e);
}
