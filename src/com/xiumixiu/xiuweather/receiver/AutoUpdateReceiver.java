package com.xiumixiu.xiuweather.receiver;

import com.xiumixiu.xiuweather.service.AutoUpdateService;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class AutoUpdateReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Intent i = new Intent(context,AutoUpdateService.class);
		context.startService(i);
	}

}
