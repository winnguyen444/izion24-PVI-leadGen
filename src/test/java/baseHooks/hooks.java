package baseHooks;

import java.io.IOException;

import baseCode.libary;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends libary {
	public static Scenario scenario;
	
	@Before
	public void setUp(Scenario cucumScenario) throws IOException, InterruptedException {
		scenario = cucumScenario;
		setUpAndroid();
		openApp();
	}
	
	@After
	public void quit() {
		tearDown();
	}
}
