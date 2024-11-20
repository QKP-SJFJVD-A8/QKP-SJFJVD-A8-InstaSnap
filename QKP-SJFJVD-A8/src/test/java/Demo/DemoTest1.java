package Demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Ecommerce.InstaSnap.GenericLibrary.BaseTest;

public class DemoTest1 extends BaseTest {
	@Test(groups = "A")
	public void m1() {
		Reporter.log(" Method M1------Team A", true); 
	}

	@Test(groups = "B")
	public void m2() {
		Reporter.log(" Method M2------Team B", true);
	}

	@Test(groups = "A")
	public void m3() {
		Reporter.log(" Method M3------Team A", true);
	}

	@Test(groups = "B")
	public void m4() {
		Reporter.log(" Method M4------Team B", true);
	}

	@Test(groups = "A")
	public void m5() {
		Reporter.log(" Method M5------Team A", true);

	}

	@Test(groups = "B")
	public void m6() {
		Reporter.log(" Method M6------Team B", true);

	}

	@Test(groups = "A")
	public void m7() {
		Reporter.log(" Method M7------Team A", true);

	}

	@Test(groups = "B")
	public void m8() {
		Reporter.log(" Method M8------Team B", true);

	}

	@Test(groups = "A")
	public void m9() {
		Reporter.log(" Method M9------Team A", true);
	}

	@Test(groups = "B")
	public void m10() {
		Reporter.log(" Method M10------Team B", true);

	}
}
