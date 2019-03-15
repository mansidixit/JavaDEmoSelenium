import cucumber.api.java.After;

public class HookTest {
	@After
	public void cleanUp() {
		System.out.println("Insert any code to run for cleanup here");
	}
}
