package module1;

import org.testng.annotations.Test;

public class program1 {
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
  @Test(priority=5)
  public void payment_details() {
	  System.out.println("payment done through credit card");
  }
  @Test(priority=4)
  public void deliver_details() {
	  System.out.println("product delivered to correct address");
  }
  @Test(enabled=false)
  public void feedback_details() {
	  System.out.println("feedback collected from customer ");
  }
  @Test(priority=7)
  public void logoff() {
	  System.out.println("application successfully closed");
  }
}
