package com.hbss.schedule.config.loader.xls.reader;

import org.apache.poi.hssf.usermodel.HSSFSheet;

public class AppConfigReader {
	public static final int APPID_ROW_NO = 0;
	public static final int APPNAME_ROW_NO = 1;
	public static final int APPSWITCHFLAG_ROW_NO = 2;
	public static final int GLOBALSWITCHFLAG_ROW_NO = 3;
	public static final int COL_NO = 1;
	private final HSSFSheet appSheet;
	
	public AppConfigReader(HSSFSheet appSheet){
		this.appSheet=appSheet;
	}
	public String readAppId(){
		return appSheet.getRow(APPID_ROW_NO).getCell(COL_NO).getStringCellValue();
	}
	public String readAppName(){
		return appSheet.getRow(APPNAME_ROW_NO).getCell(COL_NO).getStringCellValue();
	}
	public boolean readSwithFlag(){
		return appSheet.getRow(APPSWITCHFLAG_ROW_NO).getCell(COL_NO).getBooleanCellValue();
	}
	public String readGlobalSwitchFlag(){
		return appSheet.getRow(GLOBALSWITCHFLAG_ROW_NO).getCell(COL_NO).getStringCellValue();
	}
}
