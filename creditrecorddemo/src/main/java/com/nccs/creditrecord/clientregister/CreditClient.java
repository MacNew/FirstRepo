package com.nccs.creditrecord.clientregister;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class CreditClient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private Long c_id;
  public CreditClient(Long c_id, Long vender_id, String fname, String lastname, String phonenumber,
			String emailaddress, String address, String updateStatus) {
		super();
		this.c_id = c_id;
		this.vender_id = vender_id;
		this.fname = fname;
		this.lastname = lastname;
		this.phonenumber = phonenumber;
		this.emailaddress = emailaddress;
		this.address = address;
		this.updateStatus = updateStatus;
	}
private Long vender_id;
   private String fname;
   public Long getVender_id() {
	return vender_id;
}
public void setVender_id(Long vender_id) {
	this.vender_id = vender_id;
}
private String lastname;
   private String phonenumber;
   private String emailaddress;
   private String address;
   private String updateStatus;
 
public Long getC_id() {
	return c_id;
}
public void setC_id(Long c_id) {
	this.c_id = c_id;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public String getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(String phonenumber) {
	this.phonenumber = phonenumber;
}
public String getEmailaddress() {
	return emailaddress;
}
public void setEmailaddress(String emailaddress) {
	this.emailaddress = emailaddress;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getUpdateStatus() {
	return updateStatus;
}
public void setUpdateStatus(String updateStatus) {
	this.updateStatus = updateStatus;
}   
}