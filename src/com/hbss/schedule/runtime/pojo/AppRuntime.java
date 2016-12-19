package com.hbss.schedule.runtime.pojo;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.BiFunction;

import com.hbss.schedule.config.HBSSConfigHolder;
import com.hbss.schedule.config.pojo.AppInfo;

public class AppRuntime{
	public final static String APP_STATUS_STOP="N";
	private ReentrantLock lock;
	private AppInfo appInfo;
	private String appStatus;
	private Date appInstantiatedDate;
	private ConcurrentLinkedQueue<JobLinkRuntime> jlQue;
	private ConcurrentHashMap<String, Integer> jlDates;
	
	public AppRuntime(AppInfo appInfo) throws CloneNotSupportedException{
		this.appInfo = appInfo.cloneAppInfo();
		this.lock=new ReentrantLock();
		this.appStatus = this.APP_STATUS_STOP;
		this.appInstantiatedDate = new Date();	
		jlDates = new ConcurrentHashMap<String, Integer>();
	}
	
	public void addJL(JobLinkRuntime jlr) throws Exception{
		this.jlQue.add(jlr);
		String dt=jlr.getJlExecDate();
		this.jlDates.compute(dt, new BiFunction<String,Integer,Integer>(){
			@Override
			public Integer apply(String arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if(arg1 == null)arg1=new Integer(0);
				return ++arg1;
			}
		});
	}
	
	public void jlFinished(JobLinkRuntime jlr){
		this.jlDates.compute(jlr.getJlExecDate(), new BiFunction<String,Integer,Integer>(){
			@Override
			public Integer apply(String arg0, Integer arg1) {
				// TODO Auto-generated method stub
				if(arg1 == null) return new Integer(0);
				else return --arg1;
			}
		});	
		
		if(!this.isAppSwitchFlag() && this.getAppGlobalSwitchFlag() ==null){
			//通过jlr进行翻牌
		}else{
			//统一翻牌
			if(this.isAppSwitchFlag() && this.getAppGlobalSwitchFlag() == null){
				//应用内统一翻牌
				
			}else{
				//全局统一翻牌
			}
		}
		
	}
	
	public boolean checkJlDate(String appId,String execDate){
		AppInfo app=HBSSConfigHolder.getAppInfo(appId);
		int jlSize = app.getJobLinks().size();
		JobLinkRuntime jlstart=jlQue.poll();
		if(jlstart == null || !jlstart.getJlExecStatus().equals("C") || !jlstart.getJlExecDate().equals(execDate)){
			return false;
		}
		JobLinkRuntime jl = jlstart;
		while(jlSize > 0){
			 jlQue.add(jl);
			 if(jl.getJlExecStatus().equals("C") && jl.getJlExecDate().equals(execDate)){
				 jl=jlQue.poll();
			 }else{
				 break;
			 }
			 if(jl == jlstart){
				 jlQue.add(jl);
				 break;
			 }
			 --jlSize;
		}
		if(jlSize ==0 ) return true;
		else return false;
	}
	
	
}
