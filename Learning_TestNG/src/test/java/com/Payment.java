package com;

import org.testng.annotations.Test;

public class Payment {
	
	@Test(groups = {"smoke","sanity"})
	public void creditcard()
	{
		System.out.println("Runnin g creditcard payment");
	}
	
	@Test(groups = "sanity")
	public void debitcard()
	{
		System.out.println("running debitcard payment");
	}
	
	@Test
	public void cod()
	{
		System.out.println("Running cod payment");
	}
	
}
