package com.cms.model;

public class StudentModel {
	private String sname;
	private String scollege;
	private String sphone;
	private String semail;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScollege() {
		return scollege;
	}

	public void setScollege(String scollege) {
		this.scollege = scollege;
	}

	public String getSphone() {
		return sphone;
	}

	public void setSphone(String sphone) {
		this.sphone = sphone;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public StudentModel(String sname, String scollege, String sphone, String semail) {
		super();
		this.sname = sname;
		this.scollege = scollege;
		this.sphone = sphone;
		this.semail = semail;
	}

	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

}
