package com.nccs.creditrecord.vender.register;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vender {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long u_id;
	private String fname;
	private String lname;
	private String password;
	private String address;
	private String phonenumber;
	public Vender() {
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;

	public Vender(Long u_id,String fname, String lname, String password, String address, String phonenumber,String username) {
		 this.u_id =u_id;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.address = address;
		this.phonenumber = phonenumber;
		this.username = username;
	}
	
	public Vender(Vender vender){
		 this(vender.getU_id(), vender.getFname(), vender.getLname(), vender.getPassword(), vender.getAddress(), vender.getPhonenumber(),vender.getUsername());
		
		
	}
	

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
}
