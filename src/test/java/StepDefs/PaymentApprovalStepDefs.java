package StepDefs;

import TestRunner.TestRunner;
import cucumber.api.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utils.Spec;

import java.util.List;

public class PaymentApprovalStepDefs extends TestRunner {

    private static WebDriver driver;
    private static WebDriverWait wait;
    private static SoftAssert softas = new SoftAssert();

    @Given("Launch the browser Payment Approval")
    public void launchTheBrowserPaymentApproval() {
        driver = new Spec().init().getDriver();
        wait = new WebDriverWait(driver, 15);
    }

    @When("Open Payment Approval page on your browser {string}")
    public void openPaymentApprovalPageOnYourBrowser(String arg0) {
        driver.get(arg0);
    }

    @Then("{string} span section is displayed")
    public void spanSectionIsDisplayed(String arg0) {
        By bySectionLbl = By.xpath("//div[contains(@class, 'details-header')]/span[contains(text(), '"+arg0+"')]");

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(bySectionLbl));
            // Verify the section should be displayed on Payment Approval page
            softas.assertTrue(driver.findElement(bySectionLbl).isDisplayed(),
                    arg0+" section should be displayed on Payment Approval page");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("div sections are displayed")
    public void divSectionsAreDisplayed(List<String> data) {
        for(int i=0; i<data.size(); i++) {
            By bySectionLbl = By.xpath("//div[contains(@class, 'details-header') and contains(text(), '"+data.get(i)+"')]");

            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(bySectionLbl));
                // Verify the section should be displayed on Payment Approval page
                softas.assertTrue(driver.findElement(bySectionLbl).isDisplayed(),
                        data.get(i)+" section should be displayed on Payment Approval page");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Then("{string} is displayed in Contact field")
    public void isDisplayedInContactField(String arg0) {
        By byContactLbl = By.xpath("//a[(@title='"+arg0+"')]");

        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(byContactLbl));
            // Verify Contact name should be displayed on Payment Approval page
            softas.assertTrue(driver.findElement(byContactLbl).isDisplayed(),
                    arg0+" Contact name should be displayed on Payment Approval page");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("values are displayed")
    public void valuesAreDisplayed(List<String> data) {
        for(int i=0; i<data.size(); i++) {
            By byValueLbl = By.xpath("//span[contains(@data-bind, '"+data.get(i)+"')]");

            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(byValueLbl));
                // Verify the values should be displayed on Payment Approval page
                List<WebElement> elsValueLbl = driver.findElements(byValueLbl);
                for(WebElement e : elsValueLbl) {
                    softas.assertTrue(e.isDisplayed(),
                            data.get(i)+" value should be displayed on Payment Approval page");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Then("href buttons are displayed")
    public void hrefButtonsAreDisplayed(List<String> data) {
        for(int i=0; i<data.size(); i++) {
            By byButtonLbl = By.xpath("//a[contains(@data-bind, '"+data.get(i)+"')]");

            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(byButtonLbl));
                // Verify the href buttons should be displayed on Payment Approval page
                softas.assertTrue(driver.findElement(byButtonLbl).isDisplayed(),
                        data.get(i)+" href button should be displayed on Payment Approval page");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Then("buttons are displayed")
    public void buttonsAreDisplayed(List<String> data) {
        for(int i=0; i<data.size(); i++) {
            By byButtonLbl = By.xpath("//button[contains(@data-bind, '"+data.get(i)+"')]");

            try {
                wait.until(ExpectedConditions.presenceOfElementLocated(byButtonLbl));
                // Verify the buttons should be displayed on Payment Approval page
                softas.assertTrue(driver.findElement(byButtonLbl).isDisplayed(),
                        data.get(i)+" button should be displayed on Payment Approval page");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @And("Finish Payment Approval test")
    public void finishPaymentApprovalTest() {
        driver.quit();
        softas.assertAll();
    }
}
