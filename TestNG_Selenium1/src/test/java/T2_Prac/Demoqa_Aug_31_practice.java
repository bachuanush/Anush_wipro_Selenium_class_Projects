package T2_Prac;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demoqa_Aug_31_practice {
	WebDriver driver;
    DemoQA_page pg;

@BeforeTest
public void setup() {
    driver=new ChromeDriver();
    pg=new DemoQA_page(driver);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();
}

@Test(dataProvider = "excelData")
public void testLogin(Map<String, String> data) {
    driver.get(data.get("url"));
    boolean loginResult=pg.login(data.get("username1"),data.get("password1"));
    if (loginResult) {
        System.out.println("Login successful");
    } else {
        System.out.println("Login failed");
    }
}

@DataProvider(name="excelData")
public Object[][] getData() throws Exception {
    String path="C:\\Users\\priya\\Downloads\\sauce.xlsx";
    Map<String, String> mapData=readColumnWiseData(path, "Sheet1");
    return new Object[][] { { mapData } };
}

public static Map<String, String> readColumnWiseData(String filePath, String sheetName) throws IOException {
    FileInputStream fis = new FileInputStream(filePath);
    Workbook workbook = new XSSFWorkbook(fis);
    Sheet sheet = workbook.getSheet(sheetName);
    Map<String, String> dataMap=new HashMap<>(); 
    int rowCount = sheet.getPhysicalNumberOfRows();
    for (int i = 0; i < rowCount; i++) {
        Row row = sheet.getRow(i);
        String key=row.getCell(0).toString();
        String value=row.getCell(1).toString();
        dataMap.put(key,value);
    }
    workbook.close();
    return dataMap;
}


@Test(dataProvider = "excelData")
public void testLogin1(Map<String, String> data) {
    String url = data.get("url");
    String validity = pg.isValidUrl(url);
    System.out.println("URL: " + url + " is " + validity);
}

@Test
public void testPageTitle() {
     String eTitle="Swag Labs";
     pg.verifyPageTitle1(eTitle);
     
 }

}

