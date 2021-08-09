package testscript;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import POM.LoginPage;
import pom.Login_Page;
import utility.Excel;



public class Runner {
	
	private WebDriver driver;
	
	@Test
	public void LoginLogoutOne() {
	String username = Excel.readData("regression", 1, 0);
	String password = Excel.readData("regression", 1, 1);
	
	
	Login_Page lp = new Login_Page(driver);
	lp.setUsername(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	}
	
	@Test
	public void LoginLogoutTwo() {
	String username = Excel.readData("regression", 2, 0);
	String password = Excel.readData("regression", 2, 1);
	
	
	LoginPage lp = new LoginPage(driver);
	lp.setUsername(username);
	lp.setPassword(password);
	lp.clickSubmit();
	}
	
	@Test
	public void LoginLogoutThree() {
	String username = Excel.readData("regression", 1, 0);
	String password = Excel.readData("regression", 1, 1);

	LoginPage lp = new LoginPage(driver);
	lp.setUsername(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	}
	
	@Test
	public void LoginLogoutFour() {
	String username = Excel.readData("regression", 1, 0);
	String password = Excel.readData("regression", 1, 1);
	
	
	LoginPage lp = new LoginPage(driver);
	lp.setUsername(username);
	lp.setPassword(password);
	lp.clickSubmit();
	}
	
	@Test
	public void LoginLogoutFive() {
	String username = Excel.readData("regression", 1, 0);
	String password = Excel.readData("regression", 1, 1);


	LoginPage lp = new LoginPage(driver);
	lp.setUsername(username);
	lp.setPassword(password);
	lp.clickSubmit();
	
	}
 }
	

