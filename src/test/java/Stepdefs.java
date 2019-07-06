import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BasePage;

import static org.junit.Assert.*;

public class Stepdefs {

    BasePage basePage;

    @Given("I access the Google home page")
    public void access_page() {

        this.basePage = new BasePage();
        basePage.getWebDriver().get("https://www.google.com.br");
    }

    @Given("I print the page source")
    public void print_page_source() {
//        System.out.println(this.basePage.getWebDriver().getPageSource());
    }

    @Then("I close the browser")
    public void close_browser() {
        this.basePage.getWebDriver().quit();
    }
}
