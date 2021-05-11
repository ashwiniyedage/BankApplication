package com.bank.model;

public class TransferMoney
{
	private String s_name;
	private int s_ano;
	private int amount;
	private String r_name;
	private int r_ano;
	
		public TransferMoney() {
		super();
	}

	public TransferMoney(String s_name, int s_ano, int amount, String r_name, int r_ano) {
		super();
		this.s_name = s_name;
		this.s_ano = s_ano;
		this.amount = amount;
		this.r_name = r_name;
		this.r_ano = r_ano;
	}

	public String getS_name() {
		return s_name;
	}

	public void setS_name(String s_name) {
		this.s_name = s_name;
	}

	public int getS_ano() {
		return s_ano;
	}

	public void setS_ano(int s_ano) {
		this.s_ano = s_ano;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getR_name() {
		return r_name;
	}

	public void setR_name(String r_name) {
		this.r_name = r_name;
	}

	public int getR_ano() {
		return r_ano;
	}

	public void setR_ano(int r_ano) {
		this.r_ano = r_ano;
	}
	
	
}
