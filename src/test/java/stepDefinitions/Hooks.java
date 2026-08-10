package stepDefinitions;

import io.cucumber.java.*;
import util.BaseClass;

public class Hooks {
	BaseClass baseClass = new BaseClass();
	
	@Before
	public void setUp() {
		baseClass.launchBrowser();
	}
	
	@After
	public void close() {
		baseClass.tearDown();
	}
}
