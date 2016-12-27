package com.hbss.schedule.config.loader.xls.reader;

import org.apache.poi.ss.usermodel.Row;

public class JobRelationConfigReader {

	public static final int JR_JID_COL = 0;
	public static final int JR_U_AID_COL = 1;
	public static final int JR_U_JLID_COL = 2;
	public static final int JR_U_JID_COL = 3;
	public static final int JR_U_OFFSET_COL = 4;
	
	public static String getJobId(Row row){
		return row.getCell(JobRelationConfigReader.JR_JID_COL).getStringCellValue();
	}
	
	public static String getUpAppId(Row row){
		return row.getCell(JobRelationConfigReader.JR_U_AID_COL).getStringCellValue();
	}
	
	public static String getUpJobLinkId(Row row){
		return row.getCell(JobRelationConfigReader.JR_U_JLID_COL).getStringCellValue();
	}
	
	public static String getUpJobId(Row row){
		return row.getCell(JobRelationConfigReader.JR_U_JID_COL).getStringCellValue();
	}
	
	public static String getUpJobOffset(Row row){
		return row.getCell(JobRelationConfigReader.JR_U_OFFSET_COL).getStringCellValue();
	}
	
}
