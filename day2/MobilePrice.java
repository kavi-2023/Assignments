package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;

public class MobilePrice {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		//driver.get("https://www.amazon.in/");
				
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		
		List<WebElement> mobileprice=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		List<Integer> mlist=new ArrayList<>();
		
		for(WebElement each:mobileprice) {
			
			        String mp=each.getText();
			        String  replacecommas= mp.replaceAll(",","");
			        int parseint=Integer.parseInt(replacecommas);
			        System.out.println(parseint);
			        mlist.add(parseint);
			        
		}
		
		Collections.sort(mlist);
		System.out.println(mlist);
		System.out.println(mlist.get(0));
	}

}
