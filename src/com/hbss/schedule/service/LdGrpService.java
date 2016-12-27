package com.hbss.schedule.service;

import com.hbss.schedule.config.pojo.AppInfo;
import com.hbss.schedule.config.pojo.LdGrpInfo;

public interface LdGrpService {
	public LdGrpInfo getLdGrpInfo(AppInfo appInfo,String ldGrpId);
}
