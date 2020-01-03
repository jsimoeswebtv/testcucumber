/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nos.cucumber;

/**
 *
 * @author jsimo
 */
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = false,
        features = "src/test/resources",
        plugin = {"pretty", "html:target/cucumber-reports",
            "json:target/cucumber.json","junit:target/report.xml"
        }
)
public class RunCucumberTest {
}
