package com.hbss.schedule.config.loader.xls;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;

import com.hbss.schedule.config.loader.xls.reader.JobLInkInfoConfigReader;
import com.hbss.schedule.config.pojo.AppInfo;
import com.hbss.schedule.config.pojo.JobLinkInfo;

public class XLSJobLInkInfoLoader {
	
	public static ConcurrentHashMap<String,JobLinkInfo> loadJobLinInfo(AppInfo appInfo,HSSFSheet jlSheet){
		ConcurrentHashMap<String,JobLinkInfo> jls = new ConcurrentHashMap<String,JobLinkInfo>();
		Iterator<Row> jlRows  = jlSheet.rowIterator();
		Row jlRow=null;
		jlRows.next();
		while(jlRows.hasNext()){
			jlRow=jlRows.next();
			jls.put(JobLInkInfoConfigReader.getJlId(jlRow),new JobLinkInfo(appInfo,JobLInkInfoConfigReader.getJlId(jlRow),
					JobLInkInfoConfigReader.getJlName(jlRow),
					JobLInkInfoConfigReader.getJlType(jlRow),
					JobLInkInfoConfigReader.getJlExecTimeRange(jlRow),
					JobLInkInfoConfigReader.getJlExecDateRange(jlRow),
					JobLInkInfoConfigReader.getJlOffset(jlRow)));
		}
		return jls;
	}
}
