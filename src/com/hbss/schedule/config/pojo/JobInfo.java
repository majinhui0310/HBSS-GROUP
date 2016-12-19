package com.hbss.schedule.config.pojo;

import java.util.Set;

public class JobInfo {
	private AppInfo appInfo;
	private JobLinkInfo jobLinkInfo;
	private String jobId;
	private LdGrpInfo ldGrpInfo;
	private Set<DstEnvInfo> dstEnvInfoSet;
	private String jobName;
	private String jobPrgName; // path+name
	private String jobExecFlag;
	private String jobParams;
	private String jobExecMode; // YER QER MER RRR WER nnR
	private int jobExecTimeout; // running over time threshold /min
	private String jobExecUnqFlag;
	private int jobPriLevel;
	private String jobLogFile;
	private String jobOkRet;
	private String jobErrRet;
	private String jobRedoRet;
	private int jobRedoLmt;
	private int jobRedoItv;   // min
	private int jobRedoMaxItv;  //min
	public JobInfo(){
		
	}
	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public JobLinkInfo getJobLinkInfo() {
		return jobLinkInfo;
	}
	public void setJobLinkInfo(JobLinkInfo jobLinkInfo) {
		this.jobLinkInfo = jobLinkInfo;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public LdGrpInfo getLdGrpInfo() {
		return ldGrpInfo;
	}
	public void setLdGrpInfo(LdGrpInfo ldGrpInfo) {
		this.ldGrpInfo = ldGrpInfo;
	}
	public Set<DstEnvInfo> getDstEnvInfoSet() {
		return dstEnvInfoSet;
	}
	public void setDstEnvInfoSet(Set<DstEnvInfo> dstEnvInfoSet) {
		this.dstEnvInfoSet = dstEnvInfoSet;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobPrgName() {
		return jobPrgName;
	}
	public void setJobPrgName(String jobPrgName) {
		this.jobPrgName = jobPrgName;
	}
	public String getJobExecFlag() {
		return jobExecFlag;
	}
	public void setJobExecFlag(String jobExecFlag) {
		this.jobExecFlag = jobExecFlag;
	}
	public String getJobParams() {
		return jobParams;
	}
	public void setJobParams(String jobParams) {
		this.jobParams = jobParams;
	}
	public String getJobExecMode() {
		return jobExecMode;
	}
	public void setJobExecMode(String jobExecMode) {
		this.jobExecMode = jobExecMode;
	}
	public int getJobExecTimeout() {
		return jobExecTimeout;
	}
	public void setJobExecTimeout(int jobExecTimeout) {
		this.jobExecTimeout = jobExecTimeout;
	}
	public String getJobExecUnqFlag() {
		return jobExecUnqFlag;
	}
	public void setJobExecUnqFlag(String jobExecUnqFlag) {
		this.jobExecUnqFlag = jobExecUnqFlag;
	}
	public int getJobPriLevel() {
		return jobPriLevel;
	}
	public void setJobPriLevel(int jobPriLevel) {
		this.jobPriLevel = jobPriLevel;
	}
	public String getJobLogFile() {
		return jobLogFile;
	}
	public void setJobLogFile(String jobLogFile) {
		this.jobLogFile = jobLogFile;
	}
	public String getJobOkRet() {
		return jobOkRet;
	}
	public void setJobOkRet(String jobOkRet) {
		this.jobOkRet = jobOkRet;
	}
	public String getJobErrRet() {
		return jobErrRet;
	}
	public void setJobErrRet(String jobErrRet) {
		this.jobErrRet = jobErrRet;
	}
	public String getJobRedoRet() {
		return jobRedoRet;
	}
	public void setJobRedoRet(String jobRedoRet) {
		this.jobRedoRet = jobRedoRet;
	}
	public int getJobRedoLmt() {
		return jobRedoLmt;
	}
	public void setJobRedoLmt(int jobRedoLmt) {
		this.jobRedoLmt = jobRedoLmt;
	}
	public int getJobRedoItv() {
		return jobRedoItv;
	}
	public void setJobRedoItv(int jobRedoItv) {
		this.jobRedoItv = jobRedoItv;
	}
	public int getJobRedoMaxItv() {
		return jobRedoMaxItv;
	}
	public void setJobRedoMaxItv(int jobRedoMaxItv) {
		this.jobRedoMaxItv = jobRedoMaxItv;
	}
	
}
