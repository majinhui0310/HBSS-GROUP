package com.hbss.schedule.runtime.pojo;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.hbss.schedule.config.pojo.JobLinkInfo;

public class JobLinkRuntime extends JobLinkInfo {

	private ReentrantReadWriteLock lock;
	private AppRuntime appRuntime;
	private String jlExecDate;
	private String jlExecStatus;
	private String jlExecBatNo;
	private Date jlInstanticatedDate;
	public ReentrantReadWriteLock getLock() {
		return lock;
	}
	public void setLock(ReentrantReadWriteLock lock) {
		this.lock = lock;
	}
	public AppRuntime getAppRuntime() {
		return appRuntime;
	}
	public void setAppRuntime(AppRuntime appRuntime) {
		this.appRuntime = appRuntime;
	}
	public String getJlExecDate() {
		return jlExecDate;
	}
	public void setJlExecDate(String jlExecDate) {
		this.jlExecDate = jlExecDate;
	}
	public String getJlExecStatus() {
		return jlExecStatus;
	}
	public void setJlExecStatus(String jlExecStatus) {
		this.jlExecStatus = jlExecStatus;
	}
	public String getJlExecBatNo() {
		return jlExecBatNo;
	}
	public void setJlExecBatNo(String jlExecBatNo) {
		this.jlExecBatNo = jlExecBatNo;
	}
	public Date getJlInstanticatedDate() {
		return jlInstanticatedDate;
	}
	public void setJlInstanticatedDate(Date jlInstanticatedDate) {
		this.jlInstanticatedDate = jlInstanticatedDate;
	}
	public Set<JobRuntime> getJobSet() {
		return jobSet;
	}
	public void setJobSet(Set<JobRuntime> jobSet) {
		this.jobSet = jobSet;
	}
	private Set<JobRuntime> jobSet;
}
