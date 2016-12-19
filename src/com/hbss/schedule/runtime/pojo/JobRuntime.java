package com.hbss.schedule.runtime.pojo;

import java.util.Date;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.hbss.schedule.config.pojo.JobInfo;
import com.hbss.schedule.config.pojo.JobRelationInfo;

public class JobRuntime extends JobRelationInfo {
	private ReentrantReadWriteLock lock;
	private String jobStatus;
	private String jobRedoTimes;
	private Date jobStLstChgTime;
	
}
