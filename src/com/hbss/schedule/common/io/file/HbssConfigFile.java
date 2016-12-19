package com.hbss.schedule.common.io.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class HbssConfigFile{
	public final static String configPath = "/data/config";
	public final static String seperator = "/";
	public static RandomAccessFile initConfigFile(String fileName,String mode) throws FileNotFoundException{
		String fullPath=System.getenv("wk_dir")+configPath+fileName;
		RandomAccessFile raf = new RandomAccessFile(fullPath,mode);
		return raf;
	}
	
	public static String[] getScheduleConfigFilePath(){
		File file = new File(System.getenv("SCH_DIR")+configPath);
        String [] names = file.list();
        return names;
	}
	
}
