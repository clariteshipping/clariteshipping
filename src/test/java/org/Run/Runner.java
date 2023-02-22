package org.Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Adactin.feature",glue="org.aba",

		dryRun=false)



public class Runner {
	
	
}
