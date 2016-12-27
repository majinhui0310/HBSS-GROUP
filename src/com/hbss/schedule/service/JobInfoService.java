package com.hbss.schedule.service;

import com.hbss.schedule.config.pojo.JobInfo;
import com.hbss.schedule.config.pojo.JobLinkInfo;

public interface JobInfoService {
	public JobInfo getJobInfo(JobLinkInfo jl,String jobId);
}
