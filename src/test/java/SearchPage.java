import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SearchPage extends Base{
	
@Test
	public void SearchOption()
	{
	setupDriver();
		driver.findElement(By.name("q")).sendKeys("Smile");
		driver.findElement(By.name("btnK")).click();
		TearDown();
	}
}
