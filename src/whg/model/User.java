package whg.model;

import java.util.*;

/**
 * User entity. @author MyEclipse Persistence Tools
 */
public class User  {
private String userId;
private String  userName;
private String  passWord;
private String  gender;
private Integer age;
private String  fimsNo;
private String startDate;
private String endDate;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}

public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getAge() {
	return age;
}
public void setAge(Integer age) {
	this.age = age;
}
public String getFimsNo() {
	return fimsNo;
}
public void setFimsNo(String fimsNo) {
	this.fimsNo = fimsNo;
}
public String getStartDate() {
	return startDate;
}
public void setStartDate(String startDate) {
	this.startDate = startDate;
}
public String getEndDate() {
	return endDate;
}
public void setEndDate(String endDate) {
	this.endDate = endDate;
}


}
