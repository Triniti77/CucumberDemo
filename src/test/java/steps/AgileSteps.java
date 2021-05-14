package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AgileProjectPage;
import pages.HomePage;

import static org.junit.Assert.assertEquals;

public class AgileSteps {
    HomePage homePage = new HomePage();
    AgileProjectPage agileProjectPage = new AgileProjectPage();

    @Given("user is on home page")
    public void userIsOnHomePage() {
        homePage.navigate();
    }

    @When("user navigates to agile page")
    public void userNavigatesToAgilePage() {
        agileProjectPage.navigate();
    }

    @And("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        agileProjectPage.makeLogin(username, password);
    }

    @And("click login button")
    public void clickLoginButton() {
        agileProjectPage.proceedLogin();
    }

    @Then("welcome message is correct")
    public void welcomeMessageIsCorrect() {
        assertEquals("Guru99 Bank Customer HomePage", agileProjectPage.getTitle(), "Title is correct for customer page");
    }
}
