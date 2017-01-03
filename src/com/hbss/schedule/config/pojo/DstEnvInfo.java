package com.hbss.schedule.config.pojo;

public class DstEnvInfo {
	private String dstEnvId;
	private String dstEnvIp;
	private int dstEnvPort;
	private int dstEnvCpuThreshold;
	private int dstEnvMemThreshold;
	private int dstEnvIOThresHold;
	private int dstEnvStgThresHold;
	private float dstEnvCpuWgt;
	private float dstEnvMemWgt;
	private float dstEnvIOWgt;
	private float dstEnvStgWgt;
	public DstEnvInfo(){
		
	}
	public String getDstEnvId() {
		return dstEnvId;
	}
	public void setDstEnvId(String dstEnvId) {
		this.dstEnvId = dstEnvId;
	}
	public String getDstEnvIp() {
		return dstEnvIp;
	}
	public void setDstEnvIp(String dstEnvIp) {
		this.dstEnvIp = dstEnvIp;
	}
	public int getDstEnvPort() {
		return dstEnvPort;
	}
	public void setDstEnvPort(int dstEnvPort) {
		this.dstEnvPort = dstEnvPort;
	}
	public int getDstEnvCpuThreshold() {
		return dstEnvCpuThreshold;
	}
	public void setDstEnvCpuThreshold(int dstEnvCpuThreshold) {
		this.dstEnvCpuThreshold = dstEnvCpuThreshold;
	}
	public int getDstEnvMemThreshold() {
		return dstEnvMemThreshold;
	}
	public void setDstEnvMemThreshold(int dstEnvMemThreshold) {
		this.dstEnvMemThreshold = dstEnvMemThreshold;
	}
	public int getDstEnvIOThresHold() {
		return dstEnvIOThresHold;
	}
	public void setDstEnvIOThresHold(int dstEnvIOThresHold) {
		this.dstEnvIOThresHold = dstEnvIOThresHold;
	}
	public int getDstEnvStgThresHold() {
		return dstEnvStgThresHold;
	}
	public void setDstEnvStgThresHold(int dstEnvStgThresHold) {
		this.dstEnvStgThresHold = dstEnvStgThresHold;
	}
	public float getDstEnvCpuWgt() {
		return dstEnvCpuWgt;
	}
	public void setDstEnvCpuWgt(float dstEnvCpuWgt) {
		this.dstEnvCpuWgt = dstEnvCpuWgt;
	}
	public float getDstEnvMemWgt() {
		return dstEnvMemWgt;
	}
	public void setDstEnvMemWgt(float dstEnvMemWgt) {
		this.dstEnvMemWgt = dstEnvMemWgt;
	}
	public float getDstEnvIOWgt() {
		return dstEnvIOWgt;
	}
	public void setDstEnvIOWgt(float dstEnvIOWgt) {
		this.dstEnvIOWgt = dstEnvIOWgt;
	}
	public float getDstEnvStgWgt() {
		return dstEnvStgWgt;
	}
	public void setDstEnvStgWgt(float dstEnvStgWgt) {
		this.dstEnvStgWgt = dstEnvStgWgt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dstEnvId == null) ? 0 : dstEnvId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DstEnvInfo other = (DstEnvInfo) obj;
		if (dstEnvId == null) {
			if (other.dstEnvId != null)
				return false;
		} else if (!dstEnvId.equals(other.dstEnvId))
			return false;
		return true;
	}
	
}
