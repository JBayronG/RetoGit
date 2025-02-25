package com.github.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.github.steps",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {
}
