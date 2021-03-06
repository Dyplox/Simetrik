package com.testing.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/conexion.feature",
        glue = "com.testing.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class CnxRunner {
}