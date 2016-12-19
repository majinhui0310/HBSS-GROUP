package com.hbss.schedule.config.loader;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;



public interface AppLoader {
	public void loadApp(HSSFSheet fis);
	
	public void loadApp();
}
