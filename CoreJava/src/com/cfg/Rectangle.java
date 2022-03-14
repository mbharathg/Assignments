package com.cfg;

public class Rectangle 
{
	private float length;
	private float width;
	public Rectangle(float l,float w)
	{
		length=l;
		width=w;
	}
	public float getLength()
	{
		return length;
	}
	public void setLength(float l)
	{
		length=l;
	}
	public float getWidth()
	{
		return width;
	}
	public void setWidth(float w)
	{
		width=w;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*(length+width);
	}
	public String toString()
	{
		return "Rectangle[length=" + length + "width=" + width + "]";
	}
	public static void main(String[] args)
	{
		Rectangle r=new Rectangle(2.5f,3.5f);
		System.out.println(r.toString());
		System.out.println("Area is:"+r.getArea());
		System.out.println("Perimeter is:"+r.getPerimeter());
		
	}
			
}
