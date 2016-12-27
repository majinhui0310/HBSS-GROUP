package com.hbss.schedule.service.internel;

import com.hbss.schedule.config.pojo.AppInfo;
import com.hbss.schedule.config.pojo.LdGrpInfo;
import com.hbss.schedule.service.LdGrpService;

public class LdGrpServiceImpl implements LdGrpService {

	@Override
	public LdGrpInfo getLdGrpInfo(AppInfo appInfo, String ldGrpId) {
		// TODO Auto-generated method stub
		return appInfo.getLdGrps().get(ldGrpId);
	}

}
