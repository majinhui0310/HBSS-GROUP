package com.hbss.schedule.config.pojo;

public class JobLinkInfo {
	private AppInfo appInfo;
	private String jobLinkId;
	private String jobLinkName;
	private String jobLinkType;  //NR 日常批量  MT 监控批量
	private String jobLinkExecTimeRange; //执行时间区间  mmss-mmss
	private String jobLinkExecDateRange; //执行日期区间 [yyyymmdd]-yyyymmdd
	private String jobLinkExecOffset; //批量日期与自然日期偏移量
	public JobLinkInfo() {
		super();
	}
	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public String getJobLinkId() {
		return jobLinkId;
	}
	public void setJobLinkId(String jobLinkId) {
		this.jobLinkId = jobLinkId;
	}
	public String getJobLinkName() {
		return jobLinkName;
	}
	public void setJobLinkName(String jobLinkName) {
		this.jobLinkName = jobLinkName;
	}
	public String getJobLinkType() {
		return jobLinkType;
	}
	public void setJobLinkType(String jobLinkType) {
		this.jobLinkType = jobLinkType;
	}
	public String getJobLinkExecTimeRange() {
		return jobLinkExecTimeRange;
	}
	public void setJobLinkExecTimeRange(String jobLinkExecTimeRange) {
		this.jobLinkExecTimeRange = jobLinkExecTimeRange;
	}
	public String getJobLinkExecDateRange() {
		return jobLinkExecDateRange;
	}
	public void setJobLinkExecDateRange(String jobLinkExecDateRange) {
		this.jobLinkExecDateRange = jobLinkExecDateRange;
	}
	public String getJobLinkExecOffset() {
		return jobLinkExecOffset;
	}
	public void setJobLinkExecOffset(String jobLinkExecOffset) {
		this.jobLinkExecOffset = jobLinkExecOffset;
	}
}
