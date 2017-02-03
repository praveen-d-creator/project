package com.inautix.bean;

public class ProjectBean {
	//customer details
	private int customer_ID;
	private String customer_Name;
	private String billing_Address;
	private String customer_email_ID;
	private int customer_credit_Rating;
	
	//seller details
	private int seller_ID;
	private String seller_Name;
	private String seller_Address;
	private String seller_email_ID;
	private int seller_credit_Rating;
	
	//product details
	private int product_ID;
	private String product_Name;
	private String product_Description;
	private String other_details;
	
	
	//customer
	public int getCustomer_ID() {
		return customer_ID;
	}
	public void setCustomer_ID(int customer_ID) {
		this.customer_ID = customer_ID;
	}
	public String getCustomer_Name() {
		return customer_Name;
	}
	public void setCustomer_Name(String customer_Name) {
		this.customer_Name = customer_Name;
	}
	public String getBilling_Address() {
		return billing_Address;
	}
	public void setBilling_Address(String billing_Address) {
		this.billing_Address = billing_Address;
	}

	public String getCustomer_email_ID() {
		return customer_email_ID;
	}
	public void setCustomer_email_ID(String customer_email_ID) {
		this.customer_email_ID = customer_email_ID;
	}
	public int getCustomer_credit_Rating() {
		return customer_credit_Rating;
	}
	public void setCustomer_credit_Rating(int customer_credit_Rating) {
		this.customer_credit_Rating = customer_credit_Rating;
	}
	public int getSeller_ID() {
		return seller_ID;
	}
	public void setSeller_ID(int seller_ID) {
		this.seller_ID = seller_ID;
	}
	public String getSeller_Name() {
		return seller_Name;
	}
	public void setSeller_Name(String seller_Name) {
		this.seller_Name = seller_Name;
	}
	public String getSeller_Address() {
		return seller_Address;
	}
	public void setSeller_Address(String seller_Address) {
		this.seller_Address = seller_Address;
	}
	public String getSeller_email_ID() {
		return seller_email_ID;
	}
	public void setSeller_email_ID(String seller_email_ID) {
		this.seller_email_ID = seller_email_ID;
	}
	public int getSeller_credit_Rating() {
		return seller_credit_Rating;
	}
	public void setSeller_credit_Rating(int seller_credit_Rating) {
		this.seller_credit_Rating = seller_credit_Rating;
	}
	public int getProduct_ID() {
		return product_ID;
	}
	public void setProduct_ID(int product_ID) {
		this.product_ID = product_ID;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getProduct_Description() {
		return product_Description;
	}
	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}
	public String getOther_details() {
		return other_details;
	}
	public void setOther_details(String other_details) {
		this.other_details = other_details;
	}
	
	

}
