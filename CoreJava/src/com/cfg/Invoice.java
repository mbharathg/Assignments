package com.cfg;

public class Invoice
{
	private String id;
	private String desc;
	private int qty;
	private double unitPrice;
	private double u;
	public Invoice(String i,String d,int q,double u)
	{
		id=i;
		desc=d;
		qty=q;
		unitPrice=u;
	}
	public String getId()
	{
		return id;
	}
	public String getDesc()
	{
		return desc;
	}
	public int getQty()
	{
		return qty;
	}
	public void setQty(double unitprice)
	{
		u=unitPrice;
	}
	public double getTotal()
	{
		return unitPrice*qty;
	}
	public String toString()
	{
		return "Invoice[id="+id+",desc="+desc+",qty="+qty+",unitPrice="+unitPrice+"]";
	}
	public static void main(String[] args)
	{
		Invoice i=new Invoice("soap","Utilities",2,20.6);
		i.setQty(20.6);
		System.out.println(i.toString());
		System.out.println("Total is:"+i.getTotal());
	}
}
