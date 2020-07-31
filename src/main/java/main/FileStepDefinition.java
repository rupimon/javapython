package main;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class FileStepDefinition {
	@Given("^I execute the python script \"([^\"]*)\" that creates a text file with three lines$")
	public void i_execute_the_python_script_that_creates_a_text_file_with_three_lines(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		ProcessBuilder pb = new ProcessBuilder("C:\\Python34\\python.exe",arg1);
		pb.start();
	}

	@Then("^the file \"([^\"]*)\" should have (\\d+) lines of text$")
	public void the_file_should_have_lines_of_text(String arg1, int arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println(arg1);
	    BufferedReader f = new BufferedReader(new FileReader(new File(arg1)));
	    String line;
	    int count = 0;
		while((line = f.readLine()) != null){
	    	count++;
	    }
		System.out.println(count);
		assertTrue(count==arg2);
	}
}
