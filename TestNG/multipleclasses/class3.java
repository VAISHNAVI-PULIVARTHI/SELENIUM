package multipleclasses;

import org.testng.annotations.Test;

public class class3 extends class2 {
	 @Test(priority=6)
	  public void feedback_details() {
		  System.out.println("feedback collected from customer ");
	  }
	  @Test(priority=7)
	  public void logoff() {
		  System.out.println("application successfully closed");
	  }
}
