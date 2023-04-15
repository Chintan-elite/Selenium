package com;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankAccount {
	
	@Test
	public void savingAccount()
	{
		System.out.println("Running saving account");
	}
	
	@Test(groups = "smoke")
	public void currentAccount()
	{
		System.out.println("Running current account");
	}
	
	@Test(groups = "sanity")
	public void loanAccount()
	{
		System.out.println("Running loan account");
	}
	
	@BeforeMethod
	public void beforeAccountMethod()
	{
		System.out.println("IT will run before every account class methods...");
	}
	
	@AfterMethod
	public void afterAccountMethod()
	{
		System.out.println("IT will run after every account class method");
	}
	
	@BeforeClass
	public void beforeAccountClass()
	{
		System.out.println("Running before account class");
	}
	
	@AfterClass
	public void afterAccountClass()
	{
		System.out.println("Running after account class");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	
	//for multipal test
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after Suite");
	}
	
}
