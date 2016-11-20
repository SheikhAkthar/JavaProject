package Learner_Class_Package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class LearnerClass5 extends LearnerClass1 {
	@Test
	public void smokeTest(){
		LearnerClass2 likeHome = new LearnerClass2(driver);
		
		LearnerClass3 n = new LearnerClass3(driver);
		n.verifyElement(driver.findElement(By.xpath("html/body/div[4]/header/section[2]/div/div[1]/a/img")));
		
	}
	

}
