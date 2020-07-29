package jp.co.internous.ocean.model.form;

import java.io.Serializable;

public class UserForm implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String userName;
	private String password;
	private String familyName;
	private String firstName;
	private String familyNameKana;
	private String firstNameKana;
	private byte gender;
	
	private String newPassword;
	private String newPasswordConfirm;
	
	
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
	public String getNewPassword() {
		return newPassword;
	}
	public String getNewPasswordConfirm() {
		return newPasswordConfirm;
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
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public void setNewPasswordConfirm(String newPasswordConfirm) {
		this.newPasswordConfirm = newPasswordConfirm;
	}

}
