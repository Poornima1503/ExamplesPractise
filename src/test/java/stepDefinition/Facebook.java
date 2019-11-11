package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static stepDefinition.CucumberHooks.driver;

public class Facebook {

    @Given("^I am chrome user$")
    public void facebook_url() {
        System.out.println("Hello world");
    }

    @When("^I access (.*) website$")
    public void i_give_user_id_and_password(String website){
        System.out.println(website);
        //driver.get("http://facebook.com");
        driver.get("http://"+website+".com");
new CapScreenSht().capScrSht(driver, website);
    }

    @Then("^I see (.*) websiteName$")
    public void i_land_on_facebook_home_page(String websiteTitle){
        System.out.println("I am in website" + websiteTitle);
    }


}
