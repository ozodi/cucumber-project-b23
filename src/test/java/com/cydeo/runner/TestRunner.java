package com.cydeo.runner;


//This class has only one purpose
// Instructing how and what feature we want to run
//where are the step definitions

//do we want to just generate missing step definitions
//dryRun=true will  run the test without failing for missing steps
//it's like a quick scan

// do we want to get json, html report

// do we want to filter the test run according to certain tags

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( features = "classpath:features", //"src/test/resources/features",
                  glue = "com/cydeo/step_definitions" ,
                  publish = true,//it will give you public link of your local html report
                  plugin = { "pretty",
                          "html:target/cucumber.html",// this is for detailed html report
                           "rerun:target/rerun.txt" ,//store the failed scenario into rerun.txt
                          "me.jvt.cucumber.report.PrettyReports:target" //fancy report
                            },
                  dryRun = false
                 // ,tags = "@calculator"
                    )
public class TestRunner {
}

