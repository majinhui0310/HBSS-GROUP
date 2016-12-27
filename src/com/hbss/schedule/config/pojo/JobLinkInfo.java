package com.hbss.schedule.config.pojo;

import java.util.List;
import java.util.Map;

public class JobLinkInfo {
	private AppInfo appInfo;
	private String jobLinkId;
	private String jobLinkName;
	private String jobLinkType;  //NR �ճ�����  MT �������
	private String jobLinkExecTimeRange; //ִ��ʱ������  mmss-mmss
	private String jobLinkExecDateRange; //ִ���������� [yyyymmdd]-yyyymmdd
	private String jobLinkExecOffset; //������������Ȼ����ƫ����
	private Map<String,JobInfo> jobList;
	
	public JobLinkInfo(AppInfo appInfo,String jobLinkId, String jobLinkName, String jobLinkType, String jobLinkExecTimeRange,
			String jobLinkExecDateRange, String jobLinkExecOffset) {
		super();
		this.appInfo=appInfo;
		this.jobLinkId = jobLinkId;
		this.jobLinkName = jobLinkName;
		this.jobLinkType = jobLinkType;
		this.jobLinkExecTimeRange = jobLinkExecTimeRange;
		this.jobLinkExecDateRange = jobLinkExecDateRange;
		this.jobLinkExecOffset = jobLinkExecOffset;
	}
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
	public Map<String,JobInfo> getJobList() {
		return jobList;
	}
	public void setJobList(Map<String,JobInfo> jobList) {
		this.jobList = jobList;
	}
}
