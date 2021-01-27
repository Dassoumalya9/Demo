package Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Using_ArrayTest {
    Using_Array us = null;
	@BeforeEach
	void BeforeClass() {
		 us = new Using_Array();
	}

	@Test
	void Positive_test() throws Exception {
		int arr[]= {12,36,22,19,63};
		assertEquals(1,us.func(arr,31)); 
	}
	@Test
	void Negetive_test() throws Exception {
		int arr[]= {12,36,22,19,63};
		assertEquals(-1,us.func(arr,90)); 
	}
	@Test
	void Length_Zero_Test() {
		int arr[]={};
		IllegalArgumentException ex =assertThrows(IllegalArgumentException.class,()->us.func(arr,10));
		assertEquals("Array length must be greater then 0",ex.getMessage());
	}
	@Test
	void Zero_Sum() {
		int arr[]= {12,34,56,77};
		IllegalArgumentException ex =assertThrows(IllegalArgumentException.class,()->us.func(arr,0));
		assertEquals("Enter a specified sum more then 0",ex.getMessage());
	}
	@Test
	void Positive_Triplet_Test() throws Exception {
		int arr[]= {1, 4, 45, 6, 10, 8};
		assertEquals(1,us.func(arr,22));
	}
	@Test
	void Negetive_Triplet_Test() throws Exception {
		int arr[]= {12,13,14,15};
		assertEquals(-1,us.func(arr,22));
	}

}
