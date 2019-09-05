package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class class1 {
WebDriver driver;
@Given("I am launching the webshop url")
public void i_am_launching_the_webshop_url() {
    // Write code here that turns the phrase above into concrete actions
   // throw new cucumber.api.PendingException();
 driver = Drivers.configureDriver("chrome");
 driver.get("http://demowebshop.tricentis.com/");
  driver.manage().window().maximize();
}

@Then("I will check on Login")
public void i_will_check_on_Login() {
 driver.findElement(By.xpath("//a[@href='/login']")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("I enter username {string} and password {string}")
public void i_enter_username_and_password(String email, String password) {
 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password); 

    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@When("click on submit button")
public void click_on_submit_button() {
 driver.findElement(By.xpath("//input[@value='Log in']")).click();
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

@Then("verify for user account status")
public void verify_for_user_account_status() {
 System.out.println("status");
    // Write code here that turns the phrase above into concrete actions
    //throw new cucumber.api.PendingException();
}

}