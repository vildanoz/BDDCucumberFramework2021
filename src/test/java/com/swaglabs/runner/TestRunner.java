package com.swaglabs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/features"},
        glue={"com/swaglabs/stepdefinitions"},tags="@login",monochrome = true,
        plugin={"pretty","html:target/site/cucumber-pretty.html"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        //checking if the steps are defined or not
        dryRun=true
)


public class TestRunner {


}
