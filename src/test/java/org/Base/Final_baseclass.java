package org.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Final_baseclass {
	
	public static WebDriver driver;
	public static Select s;
	public static File file;
	public static String attribute;
		
		
		public static  void driverLaunch(String url) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get(url);
		}			
			public static  void maximize() {
			
				driver.manage().window().maximize();
		}
			public static  void implicitWait(long time) {
				driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			}
			
			public WebElement findElementById(String id) {
				WebElement element = driver.findElement(By.id(id));
				return element;
			}
			
			public static void sendText(WebElement element, String text) {
				element.sendKeys(text);
				System.out.println();
				
			}
			public String getattribute(String string) {
			String attribute = new String();
     		return attribute;
			
			}
			// Screenshot
			
			public static void screenShot(String fileNme) throws IOException {
				TakesScreenshot screenShot = (TakesScreenshot) driver;
				// Out put of a method
				File source = screenShot.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\Abraham\\eclipse-workspace2\\school\\src\\test\\resources\\coppy\\\"+fileNme+\".png");
				FileUtils.copyFile(source, dest);

			}
		 public void Selectoptionsbyindex(WebElement element, int index) {
				Select s = new Select(element);
				s.selectByIndex(index);
				
			}
		 
//		 public void loginPageData() {
//				sendKeysMethod(getUserName(), "jocinthn");
//				sendKeysMethod(getPassWord(), "123456");
//				clickMethod(getLoginButton());
//		 }
		 
		 public String getData(String sheetName, int rowNum, int getCell) throws IOException {
				File file = new File("C:\\Users\\Abraham\\eclipse-workspace2\\school\\Data5\\hello.xlsx");
				FileInputStream inputStream = new FileInputStream(file);
				Workbook workbook = new XSSFWorkbook(inputStream);
				Sheet Sheet =workbook.getSheet(sheetName);
				Row row = Sheet.getRow(rowNum);
				Cell cell = row.getCell(getCell);
				String name = cell.getStringCellValue();
				return name;
			} 
			public static void clickElement(WebElement element) {
			element.click();
					
			}
			
			
			 public String getNum(String sheetName, int rowNum, int getCell) throws IOException {
					File file = new File("C:\\Users\\Abraham\\eclipse-workspace2\\school\\Data5\\hello.xlsx");
					FileInputStream inputStream = new FileInputStream(file);
					Workbook workbook = new XSSFWorkbook(inputStream);
					Sheet Sheet =workbook.getSheet(sheetName);
					Row row = Sheet.getRow(rowNum);
					Cell cell = row.getCell(getCell);
					double numericCellValue = cell.getNumericCellValue();
					String string = Double.toString(numericCellValue);
					return string;
}
			 


}
