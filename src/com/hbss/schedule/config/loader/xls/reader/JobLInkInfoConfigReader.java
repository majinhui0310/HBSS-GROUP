package com.hbss.schedule.config.loader.xls.reader;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;

public class JobLInkInfoConfigReader {
	public static final int JL_ID_COL = 0;
	public static final int JL_NAME_COL = 1;
	public static final int JL_TYPE_COL = 2;
	public static final int JL_EXEC_D_RG_COL = 3;
	public static final int JL_EXEC_T_RG_COL = 4;
	public static final int JL_EXEC_OFFSET_COL = 5;
	
	public static String getJlId(HSSFRow row){
		return row.getCell(JobLInkInfoConfigReader.JL_ID_COL).getStringCellValue();
	}
	
	public static String getJlName(HSSFRow row){
		return row.getCell(JobLInkInfoConfigReader.JL_NAME_COL).getStringCellValue();
	}
	
	public static String getJlType(HSSFRow row){
		return row.getCell(JobLInkInfoConfigReader.JL_TYPE_COL).getStringCellValue();
	}

	public static String getJlExecDateRange(HSSFRow row){
		return row.getCell(JobLInkInfoConfigReader.JL_EXEC_D_RG_COL).getStringCellValue();
	}

	public static String getJlExecTimeRange(HSSFRow row){
		return row.getCell(JobLInkInfoConfigReader.JL_EXEC_T_RG_COL).getStringCellValue();
	}
	
	public static String getJlOffset(HSSFRow row){
		return row.getCell(JobLInkInfoConfigReader.JL_EXEC_OFFSET_COL).getStringCellValue();
	}
}
