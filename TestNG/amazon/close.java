package amazon;

import org.testng.annotations.AfterTest;

public class close extends operations {
 
  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
