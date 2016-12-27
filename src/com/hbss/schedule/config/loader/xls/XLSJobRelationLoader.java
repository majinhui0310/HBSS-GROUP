package com.hbss.schedule.config.loader.xls;

import java.util.Iterator;
import java.util.List;

import javax.inject.Inject;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;

import com.hbss.schedule.config.loader.xls.reader.JobInfoConfigReader;
import com.hbss.schedule.config.loader.xls.reader.JobRelationConfigReader;
import com.hbss.schedule.config.pojo.AppInfo;
import com.hbss.schedule.config.pojo.JobInfo;
import com.hbss.schedule.config.pojo.JobLinkInfo;
import com.hbss.schedule.service.JobInfoService;
import com.hbss.schedule.service.JobLinkService;

public class XLSJobRelationLoader {
	@Inject
	private JobLinkService jlService;
	@Inject
	private JobInfoService jiService;
	
	public List<JobInfo> loadJobLinInfo(AppInfo appInfo,HSSFSheet jlSheet) throws Exception{
		List<JobInfo> jobList = new java.util.ArrayList<JobInfo>();
		Iterator<Row> jlRows  = jlSheet.rowIterator();
		JobLinkInfo jl = jlService.getJobLinkInfo(appInfo,jlSheet.getSheetName());
		Row jlRow=null;
		JobInfo ji = null;
		String jobId = null;
		jlRows.next();
		while(jlRows.hasNext()){
			jlRow=jlRows.next();
			if(jobId == null || !jobId.equals(JobRelationConfigReader.getJobId(jlRow))){
				ji = jiService.getJobInfo(jl, jobId);
			}
			if(ji == null){
				throw new Exception("jobInfo is not found!");
			}
			ji.setJobRL(JobRelationConfigReader.getUpAppId(jlRow),
					JobRelationConfigReader.getUpJobLinkId(jlRow),
					JobRelationConfigReader.getUpJobId(jlRow));
		}								
		return jobList;
	}
}
