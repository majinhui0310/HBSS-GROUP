package com.hbss.schedule.config.pojo;

import java.util.Set;

public class JobRelationInfo {
	private JobInfo jobInfo;
	private Set<UpJobInfo> upJobInfo;
	class UpJobInfo{
		JobInfo jobInfo;
		int offset;
	}
	public JobRelationInfo(JobInfo jobInfo, Set<UpJobInfo> upJobInfo) {
		super();
		this.jobInfo = jobInfo;
		this.upJobInfo = upJobInfo;
	}
	public JobRelationInfo() {
		super();
	}
	public JobInfo getJobInfo() {
		return jobInfo;
	}
	public void setJobInfo(JobInfo jobInfo) {
		this.jobInfo = jobInfo;
	}
	public Set<UpJobInfo> getUpJobInfo() {
		return upJobInfo;
	}
	public void setUpJobInfo(Set<UpJobInfo> upJobInfo) {
		this.upJobInfo = upJobInfo;
	}
}
