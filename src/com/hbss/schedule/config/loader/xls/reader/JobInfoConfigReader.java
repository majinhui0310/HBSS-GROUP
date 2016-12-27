package com.hbss.schedule.config.loader.xls.reader;

import org.apache.poi.ss.usermodel.Row;

public class JobInfoConfigReader {
	public static final int J_ID_COL = 0;  //jobId
	public static final int J_LG_COL = 1;  //jobLoadGroupId
	public static final int J_DE_COL = 2;  //Set jobDestEvnInfoId 
	public static final int J_PG_COL = 3;  //job program
	public static final int J_PM_COL = 4;  //job program params
	public static final int J_EM_COL = 5;  //jobExecMode RRR MER QER YER 
	public static final int J_ER_COL = 6;  //jobExecRange
	public static final int J_AF_COL = 7;  //jobAckFalg
	public static final int J_US_COL = 8;  //jobUniqueScope
	public static final int J_UF_COL = 9;  //jobUniqueFlag
	public static final int J_PL_COL = 10;  //jobPriLvel
	public static final int J_EF_COL = 11;  //jobExecFlag
	public static final int J_LF_COL = 12;  //jobLogFile
	public static final int J_OR_COL = 13;  //jobOkRet
	public static final int J_FR_COL = 14;  //jobFatelRet
	public static final int J_RR_COL = 15;  //jobRedoRet
	public static final int J_RN_COL = 16;  //jobRedoMaxNumber
	public static final int J_RS_COL = 17;  //jobRedoTImeStep
	public static final int J_RL_COL = 18;  //jobRedoMaxTIme
	
	public static String getJobId(Row row){
		return row.getCell(J_ID_COL).getStringCellValue();
	}
	
	public static String getLdGrpInfo(Row row){
		return row.getCell(J_LG_COL).getStringCellValue();
	}
	
	public static String getDstEnvInfo(Row row){
		return row.getCell(J_DE_COL).getStringCellValue();
	}
	
	public static String getJobPrgName(Row row){
		return row.getCell(J_PG_COL).getStringCellValue();
	}
	
	public static String getJobParams(Row row){
		return row.getCell(J_PM_COL).getStringCellValue();
	}
	
	public static String getJobExecMode(Row row){
		return row.getCell(J_EM_COL).getStringCellValue();
	}
	
	public static String getJobExecRange(Row row){
		return row.getCell(J_ER_COL).getStringCellValue();
	}
	
	public static int getJobAckFlag(Row row){
		return new Integer(row.getCell(J_AF_COL).getStringCellValue()).intValue();
	}

	
	public static String getJobExecUnqScope(Row row){
		return row.getCell(J_US_COL).getStringCellValue();
	}

	
	public static String getJobExecUnqFlag(Row row){
		return row.getCell(J_UF_COL).getStringCellValue();
	}

	
	public static int getJobPriLevel(Row row){
		return new Integer(row.getCell(J_PL_COL).getStringCellValue()).intValue();
	}

	
	public static String getJobExecFlag(Row row){
		return row.getCell(J_EF_COL).getStringCellValue();
	}

	
	public static String getJobLogFile(Row row){
		return row.getCell(J_LF_COL).getStringCellValue();
	}

	
	public static String getJobOkRet(Row row){
		return row.getCell(J_OR_COL).getStringCellValue();
	}

	
	public static String getJobErrRet(Row row){
		return row.getCell(J_FR_COL).getStringCellValue();
	}

	
	public static String getJobRedoRet(Row row){
		return row.getCell(J_RR_COL).getStringCellValue();
	}
	
	
	public static int getJobRedoLmt(Row row){
		return new Integer(row.getCell(J_RN_COL).getStringCellValue()).intValue();
	}
	
	
	public static int getJobRedoItv(Row row){
		return new Integer(row.getCell(J_RS_COL).getStringCellValue()).intValue();
	}
	
	
	public static int getJobRedoMaxItv(Row row){
		return new Integer(row.getCell(J_RL_COL).getStringCellValue()).intValue();
	}
}
