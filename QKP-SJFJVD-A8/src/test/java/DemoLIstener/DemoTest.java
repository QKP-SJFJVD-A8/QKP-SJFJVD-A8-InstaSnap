package DemoLIstener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GenericLibrary.BaseTest;

@Listeners(com.GenericLibrary.Listener.class)
public class DemoTest extends BaseTest{

	@Test
	public void m1() {
	
		Reporter.log("M1 Method Failed", true);
		Assert.fail();
	}
}
