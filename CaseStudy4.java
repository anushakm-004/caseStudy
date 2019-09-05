package package1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CaseStudy4 {
WebDriver driver;

@Given("User launch the application")
public void user_launch_the_application() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
  driver=Drivers.configureDriver("chrome");
  driver.manage().window().maximize();
  driver.get("http://demowebshop.tricentis.com/");
 
}

@Then("User selects login option")
public void user_selects_login_option() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.xpath("//a[@href='/login']")).click();
 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("j.bysani@gmail.com");
 driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Password123");
 driver.findElement(By.xpath("//input[@value='Log in']")).click();
}

@Then("user searches product")
public void user_searches_product() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 Actions act = new Actions(driver);
 driver.findElement(By.xpath("//input[@type='text']")).click();
 act.sendKeys("C").pause(3000).sendKeys("a").pause(3000).sendKeys("m").pause(3000).sendKeys("e").pause(3000).sendKeys("r").pause(3000).sendKeys("a").perform();
   
 driver.findElement(By.xpath("//input[@type='submit']")).click();
}

@Then("user goes to cart")
public void user_goes_to_cart() {
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
 driver.findElement(By.xpath("//span[@class='cart-label']")).click();
 //System.out.println("No items in the cart");
 String msg=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div[2]/div[2]/div")).getText();
 System.out.println(msg);
}
}