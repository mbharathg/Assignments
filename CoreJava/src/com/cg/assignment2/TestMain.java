package com.cg.assignment2;
import com.cg.assignment2.Mainfinder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
class TestMain
{
	Objectarray objminmax;
	int[] arr1 = {59*2,34,11*2,72,52,9,34-2,18,55};
	int[] arr2 = {5622,3737-18,1897+1,9929,2456,1720,2898/2,2001};
	int[] arr3 = {11000,89123,29890,12100,12567,55110};

	Object expectedval1[] = {9,118};
	Object expectedval2[] = {1449,9929};
	Object expectedval3[] = {11000,89123};
	
	@BeforeAll
	void init() 
	{
		objminmax = new Objectarray();
	}

	@Test
	void  objtestcase1()
	{
		    fun(arr1,expectedval1);
			fun(arr2,expectedval2);
			fun(arr3,expectedval3);	
	}
	private void fun(int[] arr, Object[] expval)
	{
		
		Object actualval[] = ((Mainfinder)objminmax).findMinMax(arr);
		assertNotNull(actualval);
		assertNotSame(expval,actualval);//varies in object reference 
		assertEquals(Arrays.toString(expval),Arrays.toString(actualval));
		assertIterableEquals(Arrays.asList(expval),Arrays.asList(actualval));
	}	

}
