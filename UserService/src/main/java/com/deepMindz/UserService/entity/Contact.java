package com.deepMindz.UserService.entity;

public class Contact {
	
	private Long cid;
	private String email;
	private String contackName;
	private Long userid;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(Long cid, String email, String contackName, Long userid) {
		super();
		this.cid = cid;
		this.email = email;
		this.contackName = contackName;
		this.userid = userid;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContackName() {
		return contackName;
	}
	public void setContackName(String contackName) {
		this.contackName = contackName;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Contact [cid=" + cid + ", email=" + email + ", contackName=" + contackName + ", userid=" + userid + "]";
	}
	

}
