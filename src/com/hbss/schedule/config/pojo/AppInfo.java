package com.hbss.schedule.config.pojo;

import java.util.Map;
import java.util.Set;

public class AppInfo implements Cloneable{
	private String appId;
	private String appName;
	private boolean appSwitchFlag;
	private String appGlobalSwitchFlag;
	private Map<String,LdGrpInfo> ldGrps1;
	private Map<String,JobLinkInfo> jobLinks;
	public Map<String,JobLinkInfo> getJobLinks() {
		return jobLinks;
	}
	public void setJobLinks(Map<String,JobLinkInfo> jobLinks) {
		this.jobLinks = jobLinks;
	}
	public Map<String,LdGrpInfo> getLdGrps() {
		return ldGrps1;
	}
	public void setLdGrps(Map<String,LdGrpInfo> ldGrps) {
		this.ldGrps1 = ldGrps;
	}
	private Set<LdGrpInfo> ldGrps;
	public AppInfo(){
		
	}
	@Override
	public String toString() {
		return "AppInfo [appId=" + appId + ", appName=" + appName + ", appSwitchFlag=" + appSwitchFlag
				+ ", appGlobalSwitchFlag=" + appGlobalSwitchFlag + "]";
	}
	
	public AppInfo cloneAppInfo() throws CloneNotSupportedException{
		return (AppInfo)this.clone();
	}
	public AppInfo(String appId, String appName, boolean appSwitchFlag, String appGlobalSwitchFlag) {
		super();
		this.appId = appId;
		this.appName = appName;
		this.appSwitchFlag = appSwitchFlag;
		this.appGlobalSwitchFlag = appGlobalSwitchFlag;
	}
	

	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public boolean isAppSwitchFlag() {
		return appSwitchFlag;
	}
	public void setAppSwitchFlag(boolean appSwitchFlag) {
		this.appSwitchFlag = appSwitchFlag;
	}
	public String getAppGlobalSwitchFlag() {
		return appGlobalSwitchFlag;
	}
	public void setAppGlobalSwitchFlag(String appGlobalSwitchFlag) {
		this.appGlobalSwitchFlag = appGlobalSwitchFlag;
	}
}
