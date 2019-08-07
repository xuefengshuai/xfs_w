package com.xuefengshuai.domain;

public class Vege {
	private Integer id;
	private String name;
	private String descc;
	private Integer tid;
	private String tname;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescc() {
		return descc;
	}
	public void setDescc(String descc) {
		this.descc = descc;
	}
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
		return "Vege [id=" + id + ", name=" + name + ", descc=" + descc + ", tid=" + tid + ", tname=" + tname + "]";
	}
	
	
}
