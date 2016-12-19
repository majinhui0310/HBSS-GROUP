package com.hbss.schedule.config.pojo;

public class LdGrpInfo {
	private AppInfo appInfo;
	private String ldGrpId;
	private String ldGrpName;
	private int ldGrpCncNum;
	private int ldGrpMaxCncNum;
	private int ldGrpMinCncNum;
	private String ldGrpStatus;
	public LdGrpInfo() {
		super();
	}
	public AppInfo getAppInfo() {
		return appInfo;
	}
	public void setAppInfo(AppInfo appInfo) {
		this.appInfo = appInfo;
	}
	public String getLdGrpId() {
		return ldGrpId;
	}
	public void setLdGrpId(String ldGrpId) {
		this.ldGrpId = ldGrpId;
	}
	public String getLdGrpName() {
		return ldGrpName;
	}
	public void setLdGrpName(String ldGrpName) {
		this.ldGrpName = ldGrpName;
	}
	public int getLdGrpCncNum() {
		return ldGrpCncNum;
	}
	public void setLdGrpCncNum(int ldGrpCncNum) {
		this.ldGrpCncNum = ldGrpCncNum;
	}
	public int getLdGrpMaxCncNum() {
		return ldGrpMaxCncNum;
	}
	public void setLdGrpMaxCncNum(int ldGrpMaxCncNum) {
		this.ldGrpMaxCncNum = ldGrpMaxCncNum;
	}
	public int getLdGrpMinCncNum() {
		return ldGrpMinCncNum;
	}
	public void setLdGrpMinCncNum(int ldGrpMinCncNum) {
		this.ldGrpMinCncNum = ldGrpMinCncNum;
	}
	public String getLdGrpStatus() {
		return ldGrpStatus;
	}
	public void setLdGrpStatus(String ldGrpStatus) {
		this.ldGrpStatus = ldGrpStatus;
	}
}
