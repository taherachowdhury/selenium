package learnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
		@BeforeSuite
		public void beforeSuite() {
			System.out.println("BeforSuit");
			}
		
		@BeforeTest
		public void beforeTest( ) {
			System.out.println("beforeTest");
		}
		
		@BeforeClass
		public void beforeClass() {
			System.out.println(" beforeClass");
			}
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("beforeMethod");
			}
		@Test
		public void test1 () {
			System.out.println("Excute test1");
			}
		@Test 
		public void test2 () {
			System.out.println("Excute test2");
			}
		
		@AfterMethod
		public void afterMethod () {
			System.out.println("afterMethod ");
		}
		@AfterClass
		public void afterClass () {
			System.out.println("afterClass");
		}
	@AfterTest
	public void aftertest() {
		System.out.println("aftertest");
	}
	
	@AfterSuite
	public void afterSuite() {
	System.out.println("afterSuite");
		
	}
	
	
	
	 
	
	}



