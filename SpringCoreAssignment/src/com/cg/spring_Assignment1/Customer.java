package com.cg.spring_Assignment1;

public class Customer
{
	private Integer customerId;
	private String customerName;
	private Long customerContact;
	private Address customerAddress;

	public Customer(Integer customerId, String customerName, Long customerContact, Address customerAddress)
	{
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public Integer getCustomerId() 
	{
		return customerId;
	}

	public void setCustomerId(Integer customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerName() 
	{
		return customerName;
	}

	public void setCustomerName(String customerName) 
	{
		this.customerName = customerName;
	}

	public Long getCustomerContact() 
	{
		return customerContact;
	}

	public void setCustomerContact(Long customerContact)
	{
		this.customerContact = customerContact;
	}

	public Address getCustomerAddress() 
	{
		return customerAddress;
	}

	public void setCustomerAddress(Address customerAddress) 
	{
		this.customerAddress = customerAddress;
	}


	@Override
	public String toString() 
	{
		return "Customer{" +"customerId=" + customerId +", customerName='" + customerName + '\'' +", customerContact=" + customerContact +", customerAddress=" + customerAddress +'}';
	}
}