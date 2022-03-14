package com.cg.assignment2;
import java.util.Arrays;
public class Mainfinder
{
	public void main(String[] args) 
	{
		findMinMax(new int[] {56,34,7,3,54,3,34,34,53});
	}

	public Object[] findMinMax(int[] is) 
	 {
		 
		Arrays.sort(is);
		int min = is[0];
		int max = is[is.length-1];
		Object res[]= {min,max};
		System.out.println("(Minimum value,Maximum value) : "+Arrays.toString(res));
		return res;
	}
}
