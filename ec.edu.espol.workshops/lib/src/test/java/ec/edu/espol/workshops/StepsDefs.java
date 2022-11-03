package ec.edu.espol.workshops;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

public class StepsDefs {
  private Customer customer;
  private String actualAnswer;


  @Given("the customer is a {string} years old {string} {string}")
  public void customer_is(String age, String civilState, String gender) {
    char charGender = gender.compareTo("male") == 0 ? 'M' : 'F';
    boolean isMarried = civilState.compareTo("married") == 0;
    this.customer = new Customer(Integer.parseInt(age), charGender, isMarried);
  }

  @When("calculate the insurance prime and ask if is 500")
  public void ask_if_insurance_prime_is500() {
    int insurancePrime = this.calculate_the_insurance_prime();
    this.actualAnswer = insurancePrime == 500 ? "Yes" : "No";
  }

  @Then("the answer should be {string}")
  public void answer_should_be(String expectedAnswer) {
    assertEquals(expectedAnswer, actualAnswer);
  }
  
  private int calculate_the_insurance_prime() {
    return CarInsurance.verify_business_rules(this.customer);
  }
}