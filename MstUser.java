package jp.co.internous.ocean.model.domain;

import java.sql.Timestamp;

public class MstUser {
	private int id;
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private byte gender;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	//getter
	public int getId() {
		return id;
	}
	public String getUserName() {
		return userName;
	}
	public String getPassword() {
		return password;
	}
	public String getFamilyName() {
		return familyName;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public String getFirstNameKana() {
		return firstNameKana;
	}
	public byte getGender() {
		return gender;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	
	//setter
	public void setId(int id) {
		this.id = id;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}
	public void setGender(byte gender) {
		this.gender = gender;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}