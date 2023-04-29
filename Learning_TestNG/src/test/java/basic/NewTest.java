package basic;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NewTest {
	
	private static final Logger log = LogManager.getLogger(NewTest.class);
	
	
	@Test(priority = 2)
	public void alpha()
	{
	log.info("Running alpha test");
	}
	
	
	@Test(priority = 4)
	public void login()
	{
		log.info("Running login test");
	}
	
	@Test(priority = 3, enabled = false)
	public void home()
	{
		log.info("Running home test");
	}

	@Test(priority = 5)
	public void beta()
	{
		log.info("Running beta test");
	}
	
}