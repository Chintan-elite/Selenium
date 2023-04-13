package com;

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
	
}
