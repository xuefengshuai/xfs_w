package com.xuefengshuai.domain;

public class Type {
	/**
	 * 成员变量
	 */
	private Integer tid;
	private String tname;
	/**
	 * 
	 * @Title: getset方法 
	 * @Description: TODO
	 * @return
	 * @return: Integer
	 */
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
