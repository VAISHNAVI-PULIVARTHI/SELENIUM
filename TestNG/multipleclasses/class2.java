package multipleclasses;

import org.testng.annotations.Test;

public class class2 extends class1 {
  @Test(priority=5)
  public void payment_details() {
	  System.out.println("payment done through credit card");
  }
  @Test(priority=4)
  public void deliver_details() {
	  System.out.println("product delivered to correct address");
  }
}
