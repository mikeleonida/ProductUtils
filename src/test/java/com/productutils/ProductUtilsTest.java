package com.productutils;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductUtilsTest {
	private static WorkingWithProduct wwp = null;
	
	@BeforeClass
	public static void setup() {
		Product p1 = new Product(100, "TV", 400);
		Product p2 = new Product(300, "Microwave", 50);
		Product p3 = new Product(200, "Toaster", 20);
		Product p4 = new Product(50, "Table", 100);
		ArrayList<Product> ap = new ArrayList<>();
		ap.add(p1);
		ap.add(p2);
		ap.add(p3);
		ap.add(p4);
		wwp = new WorkingWithProduct(ap);
		
		System.out.println("BeforeClass executes ....");
	}
	
	@AfterClass
	public static void windUp() {
		System.out.println("AfterClass executes ....");
	}
	
	@Before
	public void before() {
		System.out.println("Before .....");
		System.out.println("********************");
	}
	
	@After
	public void after() {
		System.out.println("After .....");
	}

	@Test
	public void test1() {
		System.out.println(wwp.getMaxPrice());
	}

	@Test
	public void test2() {
		System.out.println(wwp.getLeastPrice());
	}
	
	@Test
	public void test3() {
		System.out.println(wwp.arrangeByPrice());
	}
	
	@Test
	public void test4() {
		System.out.println(wwp.arrangeByProductNo());
	}
	
	@Test
	public void test5() {
		System.out.println(wwp.arrangeByProductName());
	}
}
