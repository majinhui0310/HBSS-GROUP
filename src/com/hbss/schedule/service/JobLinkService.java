package com.hbss.schedule.service;

import com.hbss.schedule.config.pojo.AppInfo;
import com.hbss.schedule.config.pojo.JobLinkInfo;

public interface JobLinkService {
	public JobLinkInfo getJobLinkInfo(AppInfo appInfo,String jobLinkId);
}
