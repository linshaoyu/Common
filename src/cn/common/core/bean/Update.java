package cn.common.core.bean;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
/**
 * 应用程序更新实体类
 * @author 
 * @version 
 * @created 
 */
public class Update implements Serializable{
	
	@SerializedName( "versionCode" )
	private int versionCode;
	
	@SerializedName( "versionName" )
	private String versionName;
	
	@SerializedName( "downloadUrl" )
	private String downloadUrl;
	
	@SerializedName( "updateLog" )
	private String updateLog;
	
	public int getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(int versionCode) {
		this.versionCode = versionCode;
	}
	public String getVersionName() {
		return versionName;
	}
	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}
	public String getDownloadUrl() {
		return downloadUrl;
	}
	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getUpdateLog() {
		return updateLog;
	}
	public void setUpdateLog(String updateLog) {
		this.updateLog = updateLog;
	}
}
