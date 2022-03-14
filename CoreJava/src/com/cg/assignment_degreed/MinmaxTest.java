package com.cg.assignment_degreed;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
class MinmaxTest 
{
	MinmaxTest minmax;
	int[] arr1 = {56,34,7,3,58,3,34,1,53};
	int[] arr2 = {56,37,7,99,31,34,8,10};
	int[] arr3 = {11,89,29,121,12,55};

	int[] expectedval1 = {1,58};
	int[] expectedval2 = {7,99};
	int[] expectedval3 = {11,121};

	@BeforeAll
	void init() {
		minmax = new MinmaxTest();
	}

	@Test
	void arr1testcase() {
		fun(arr1,expectedval1);
		fun(arr2,expectedval2);
		fun(arr3,expectedval3);
	}

	private void fun(int[] arr, int[] expectedval) 
	{
		 
		int[] actualval = minmax.findMinmaxTest(arr);
		assertNotNull(Arrays.toString(actualval),"No data Found");
		assertEquals(Arrays.toString(expectedval),Arrays.toString(actualval));
		assertArrayEquals(expectedval ,actualval,"mismatch");
		assertTrue(actualval.length==2);
		assertTrue(actualval[0]<actualval[1]);
	}

	private int[] findMinmaxTest(int[] arr) 
	{
	 
		return null;
	}
}
