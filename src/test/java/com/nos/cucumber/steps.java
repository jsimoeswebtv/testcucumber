/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nos.cucumber;

import io.cucumber.java.en.*;



public class steps {

    /**
     *
     */
    @Given("today is Sunday")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
       
    }

    /**
     *
     */
    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
       
    }
    
    @Given("i can do a test")
public void i_can_do_a_test() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Then("i want to check something")
public void i_want_to_check_something() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

    /**
     *
     * @param string
     */
    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        // Write code here that turns the phrase above into concrete actions
       
    }
}
