package com.br.mybatis.member.dto;

import java.sql.Date;
import java.util.Arrays;

public class MemberDto {
	
	private int userNo;
	private String userId;
	private String usePwd;
	private String useName;
	private String phone;
	private String email;
	private String address;
	private String[] interest;
	private Date enrollDate;
	private Date modifyDate;
	private String status;

	public MemberDto() {}

	public MemberDto(int userNo, String userId, String usePwd, String useName, String phone, String email,
			String address, String[] interest, Date enrollDate, Date modifyDate, String status) {
		super();
		this.userNo = userNo;
		this.userId = userId;
		this.usePwd = usePwd;
		this.useName = useName;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.interest = interest;
		this.enrollDate = enrollDate;
		this.modifyDate = modifyDate;
		this.status = status;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUsePwd() {
		return usePwd;
	}

	public void setUsePwd(String usePwd) {
		this.usePwd = usePwd;
	}

	public String getUseName() {
		return useName;
	}

	public void setUseName(String useName) {
		this.useName = useName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getInterest() {
		return interest;
	}

	public void setInterest(String[] interest) {
		this.interest = interest;
	}

	public Date getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "MemberDto [userNo=" + userNo + ", userId=" + userId + ", usePwd=" + usePwd + ", useName=" + useName
				+ ", phone=" + phone + ", email=" + email + ", address=" + address + ", interest="
				+ Arrays.toString(interest) + ", enrollDate=" + enrollDate + ", modifyDate=" + modifyDate + ", status="
				+ status + "]";
	}
	
	
}
