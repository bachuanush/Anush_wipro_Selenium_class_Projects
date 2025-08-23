package Tira_Mini_Proj;

import org.testng.annotations.Test;

import Testing.PageClass;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Search {
	   WebDriver driver;
	   Page_Object pg;

//	    @BeforeClass
//	    public void setup() {
//
//	    }
	    
  @DataProvider
  public Object[][] search_test() throws IOException{
	    String excelPath = "C:\\Users\\shashank\\Desktop\\Tira-Mini\\TiraMini.xlsx";
	    String sheetName = "SearchData";

	    FileInputStream fis = new FileInputStream(excelPath);
	    Workbook workbook = WorkbookFactory.create(fis);
	    Sheet sheet = workbook.getSheet(sheetName);

	    int rows = sheet.getPhysicalNumberOfRows();
	  //int cols = sheet.getRow(0).getLastCellNum();

	    Object[][] data = new Object[rows - 1][1];
	    for (int i = 1; i < rows; i++) {
            Row row = sheet.getRow(i);
            Cell cell = row.getCell(0);  // Always column 0
            data[i - 1][0] = (cell == null) ? "" : cell.toString();
        }
	    
	    workbook.close();
	    fis.close();
	    
	    return data;
  }
 
  
  @Test(dataProvider = "search_test")
  public void testLogin(String product) throws InterruptedException {
	    System.out.println("search : " + product);
      
        driver = new ChromeDriver();
        
        pg = new Page_Object(driver);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        
        driver.get("https://www.tirabeauty.com/");
        System.out.println("tira website opened success");
	    
	    pg.search_in(product);

      Thread.sleep(3000);
	}

}
