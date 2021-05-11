package com.bank.model;

public class CreateUser 
{
	private String u_name;
	private String u_email;
	private int u_acno;
	private int u_bal;
	
	public CreateUser() {
		super();
	}

	public CreateUser(String u_name, String u_email, int u_acno, int u_bal) {
		super();
		this.u_name = u_name;
		this.u_email = u_email;
		this.u_acno = u_acno;
		this.u_bal = u_bal;
	}

	public String getU_name() {
		return u_name;
	}

	public void setU_name(String u_name) {
		this.u_name = u_name;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public int getU_acno() {
		return u_acno;
	}

	public void setU_acno(int u_acno) {
		this.u_acno = u_acno;
	}

	public int getU_bal() {
		return u_bal;
	}

	public void setU_bal(int u_bal) {
		this.u_bal = u_bal;
	}
	
	
}
