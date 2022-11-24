package frameworks;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nt_title_url {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("D://tu1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		String baseurl="https://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get(baseurl);
		d.manage().window().maximize();
		WebElement drop=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody"));
		List<WebElement> drop1=drop.findElements(By.tagName("a"));
		System.out.println(drop1.size());
		for(int i=0;i<drop1.size();i++)
		{
			System.out.println(drop1.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(drop1.get(i).getText());
			drop1.get(i).click();
			r.createCell(1).setCellValue(d.getTitle());
			r.createCell(2).setCellValue(d.getCurrentUrl());
			d.navigate().back();
			drop=d.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody"));
			drop1=drop.findElements(By.tagName("a"));
			if(!drop1.get(i).isSelected())
			{
				r.createCell(3).setCellValue("pass");
			}
			else
			{
				r.createCell(3).setCellValue("fail");
			}
			
			
		}
		FileOutputStream f2=new FileOutputStream("D://tu1.xlsx");
		wb.write(f2);
		f2.close();

	}

}
