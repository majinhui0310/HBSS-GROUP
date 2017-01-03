package com.hbss.schedule.config.pojo;

import java.util.Set;

public class JobRelationInfo {
	private JobInfo jobInfo;
	private Set<FatherJobInfo> fJobInfo;
	private Set<JobInfo> cJobInfo;
	class FatherJobInfo{
		public FatherJobInfo(String appId, String jobLinkId, String jobId) {
			super();
			this.appId = appId;
			this.jobLinkId = jobLinkId;
			this.jobId = jobId;
		}
		String appId;
		String jobLinkId;
		String jobId;
		int offset;
	}
	public JobRelationInfo(JobInfo jobInfo) {
		super();
		this.jobInfo = jobInfo;
		this.fJobInfo = new java.util.HashSet<FatherJobInfo>();
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
	public Set<FatherJobInfo> getFJobInfo() {
		return fJobInfo;
	}
	public void setFJobInfo(Set<FatherJobInfo> upJobInfo) {
		this.fJobInfo = upJobInfo;
	}
	public void setFJobInfo(String appId,String jobLinkId,String jobId){
		this.fJobInfo.add(new FatherJobInfo(appId,jobLinkId,jobId));
	}
	public Set<JobInfo> getcJobInfo() {
		return cJobInfo;
	}
	public void setcJobInfo(JobInfo cJobInfo) {
		this.cJobInfo.add(cJobInfo);
	}
	
	
}
