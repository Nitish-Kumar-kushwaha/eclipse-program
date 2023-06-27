package selenium.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JDBCSeleniumWebDriver{
	WebDriver driver;
	String url ="";
	Connection con =null;
	Statement stmt = null;
	ResultSet result = null;

	@Before
	public void setUp() throws Exception{
	System.out.println("We are calling @Before............");	
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium1\\chromedriver.exe");
	driver = new ChromeDriver();
	url="https://login.yahoo.com";
	driver.get(url);
	}
	
	@Test
	public void CreateDB() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, InterruptedException{
	System.out.println("We are calling @Test............");	
	//Prepare connection
	String url1 ="jdbc:mysql://localhost:3306/db_world";
	
	// Load Microsoft SQL Server JDBC driver
	String dbClass = "com.mysql.jdbc.Driver";
	Class.forName(dbClass).newInstance();
	
	//Get connection to DB
	con = DriverManager.getConnection(url1,"root","root");
	
	//Create Statement
	stmt = (Statement) con.createStatement();
	
	// method which returns the requested information as rows of data
	result = stmt.executeQuery("select * from userinfo");
	if(result.next())
	{
	//String id = result.getString("userID");
	String name = result.getString("userName");
	
	driver.getCurrentUrl();
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("#login-username")).sendKeys(name);
	Thread.sleep(4000);
	driver.findElement(By.cssSelector("#login-signin")).click();
	Thread.sleep(4000);
	System.out.print("Passed");
	}
	}

	@After
	public void tearDown() throws SQLException{
	System.out.println("We are calling @After............");	
	driver.close(); 
	con.close();
	}
}