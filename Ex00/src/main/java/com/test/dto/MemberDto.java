package com.test.dto;

public class MemberDto {

	private String id;
	private String name;
	private String pw;
	private String phone;
	private String nickName;
	private String joindate;
	private String addr1;
	private String addr2;
	private String addr3;
	
	public MemberDto() {}
	
	public MemberDto(String id, String name, String pw, String phone, String nickName, String joindate, String addr1,
			String addr2, String addr3) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.nickName = nickName;
		this.joindate = joindate;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.addr3 = addr3;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getAddr3() {
		return addr3;
	}

	public void setAddr3(String addr3) {
		this.addr3 = addr3;
	}

	@Override
	public String toString() {
		return "MemberDto [id=" + id + ", name=" + name + ", pw=" + pw + ", phone=" + phone + ", nickName=" + nickName
				+ ", joindate=" + joindate + ", addr1=" + addr1 + ", addr2=" + addr2 + ", addr3=" + addr3 + "]";
	}
	
	
}
