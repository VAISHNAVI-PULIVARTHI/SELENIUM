package multipleclasses;

import org.testng.annotations.Test;

public class class1 {
	@Test(priority=1)
	  public void opening_browser() {
		  System.out.println("application successfully opened");
	  }
	  @Test(priority=2)
	  public void customer_details() {
		  System.out.println("customer details successfully updated");
	  }
	  @Test(priority=3)
	  public void product_details() {
		  System.out.println("product details successfully updated");
	  }
}
