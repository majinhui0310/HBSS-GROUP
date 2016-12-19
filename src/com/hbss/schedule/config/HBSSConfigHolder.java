package com.hbss.schedule.config;

import java.util.concurrent.ConcurrentHashMap;

import com.hbss.schedule.config.pojo.AppInfo;
import com.hbss.schedule.runtime.pojo.RuntimeInfo;

public class HBSSConfigHolder {
	private static ConcurrentHashMap<String, AppInfo> apps = new ConcurrentHashMap<String, AppInfo>();
	
	public static void loadApp(){
		
	}
	
	public static AppInfo getAppInfo(String appId){
		return apps.get(appId);
	}
	
	
}
