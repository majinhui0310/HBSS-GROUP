package com.hbss.schedule.config.loader.xls;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.inject.Inject;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.Row;

import com.hbss.schedule.config.loader.xls.reader.JobInfoConfigReader;
import com.hbss.schedule.config.loader.xls.reader.JobLInkInfoConfigReader;
import com.hbss.schedule.config.pojo.AppInfo;
import com.hbss.schedule.config.pojo.DstEnvInfo;
import com.hbss.schedule.config.pojo.JobInfo;
import com.hbss.schedule.config.pojo.JobLinkInfo;
import com.hbss.schedule.config.pojo.LdGrpInfo;
import com.hbss.schedule.service.DstEnvInfoService;
import com.hbss.schedule.service.JobLinkService;
import com.hbss.schedule.service.LdGrpService;

public class XLSJobInfoLoader {
	@Inject
	private DstEnvInfoService ediService;
	@Inject
	private JobLinkService jlService;
	@Inject
	private LdGrpService lgService;
	
	
	public List<JobInfo> loadJobLinInfo(AppInfo appInfo,HSSFSheet jlSheet) throws Exception{
		List<JobInfo> jobList = new java.util.ArrayList<JobInfo>();
		Iterator<Row> jlRows  = jlSheet.rowIterator();
		JobLinkInfo jl = jlService.getJobLinkInfo(appInfo,jlSheet.getSheetName());
		Row jlRow=null;
		jlRows.next();
		while(jlRows.hasNext()){
			jobList.add(new JobInfo(appInfo,jl,JobInfoConfigReader.getJobId(jlRow),
					lgService.getLdGrpInfo(appInfo, JobInfoConfigReader.getLdGrpInfo(jlRow)),
					genDstEnvSet(JobInfoConfigReader.getDstEnvInfo(jlRow)),
					JobInfoConfigReader.getJobPrgName(jlRow),
					JobInfoConfigReader.getJobExecFlag(jlRow),
					JobInfoConfigReader.getJobParams(jlRow),
					JobInfoConfigReader.getJobExecMode(jlRow),
					JobInfoConfigReader.getJobExecRange(jlRow),
					JobInfoConfigReader.getJobAckFlag(jlRow),
					JobInfoConfigReader.getJobExecUnqScope(jlRow),
					JobInfoConfigReader.getJobExecUnqFlag(jlRow),
					JobInfoConfigReader.getJobPriLevel(jlRow),
					JobInfoConfigReader.getJobLogFile(jlRow),
					JobInfoConfigReader.getJobOkRet(jlRow),
					JobInfoConfigReader.getJobErrRet(jlRow),
					JobInfoConfigReader.getJobRedoRet(jlRow),
					JobInfoConfigReader.getJobRedoLmt(jlRow),
					JobInfoConfigReader.getJobRedoItv(jlRow),
					JobInfoConfigReader.getJobRedoMaxItv(jlRow)));
		}

				
				
		return jobList;
	}
	
	public Set<DstEnvInfo> genDstEnvSet(String envId) throws Exception{
		Set<DstEnvInfo> envs = new java.util.TreeSet<DstEnvInfo>();
		DstEnvInfo edi = null;
		String[] envIds = envId.split(" ");
		for(int i = 0; i < envIds.length; i++){
			edi=ediService.getDstEvnInfo(envIds[i]);
			if(edi == null){
				throw new Exception("can not find DstEnvInfo");
			}
			envs.add(edi);
		}
		return envs;
	}
}
