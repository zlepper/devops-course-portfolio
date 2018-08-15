import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class StepDefinition {

    Account account;

    AutomatedTellerMachine atm;

    ResponseObject response;

    @Given("^I have an account with a balance of (\\d+)$")
    public void iHaveAnAccountWithABalanceOf(int balance) throws Throwable {
        account = new Account();
        account.setBalance(balance);
    }

    @When("^I make a deposit of (\\d+) at an ATM$")
    public void iMakeADepositOfAtAnATM(int deposit) throws Throwable {
        atm = new AutomatedTellerMachine();
        response = atm.makeDeposit(account, deposit);
    }

    @Then("^the ATM displays a message that deposit was successful$")
    public void theATMDisplaysAMessageThatDepositWasSuccessful() throws Throwable {
        assertEquals("Deposit successful", response.getMessage());
    }

    @And("^my account has a new balance of (\\d+)$")
    public void myAccountHasANewBalanceOf(int balance) throws Throwable {
        assertEquals(balance, account.getBalance());
    }

    @When("^I make a withdrawal of (\\d+) at an ATM$")
    public void iMakeAWithdrawalOfAtAnATM(int withdrawal) throws Throwable {
        atm = new AutomatedTellerMachine();
        response = atm.makeWithdrawal(account, withdrawal);

    }

    @Then("^the ATM displays a message that withdrawal was successful$")
    public void theATMDisplaysAMessageThatWithdrawalWasSuccessful() throws Throwable {
        assertEquals("Withdrawal successful", response.getMessage());
    }
}
