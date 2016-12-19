package com.hbss.schedule.runtime.pojo;

import java.util.Date;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.hbss.schedule.config.pojo.LdGrpInfo;

public class ldGrpRuntime extends LdGrpInfo {
	private ReentrantReadWriteLock lock;
	private int ldGrpCncNum;
	private String ldGrpStatus;
	private Date ldGrpInstantiatedTime;
}
