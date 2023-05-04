package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import util.DriverConnection;

public class DBTest {
	
	public static void main(String[] args) {
		
		try {
			
			WebDriver driver = DriverConnection.connect("https://www.facebook.com/");
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			
			String url ="jdbc:mysql://localhost:3306/test";
			String uname="root";
			String pass="root";
			Connection cn = DriverManager.getConnection(url,uname,pass);
			System.out.println("connection established...");
			
			Statement st = cn.createStatement();
			ResultSet rs =  st.executeQuery("select * from login");
			
			while(rs.next())
			{
				String username = rs.getString(2);
				String password = rs.getString(3);
				
				WebElement email = driver.findElement(By.id("email"));
				WebElement upass = driver.findElement(By.id("pass"));
				WebElement login = driver.findElement(By.name("login"));
				email.clear();
				email.sendKeys(username);
				upass.clear();
				upass.sendKeys(password);
				login.click();
				
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				driver.navigate().back();
				
				
			}
			
			
			
			
		} catch (ClassNotFoundException e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
