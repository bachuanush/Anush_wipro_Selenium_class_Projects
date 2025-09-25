package T2_Prac;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FileOperations {

    /**
     * Reads the first row from Excel and returns it as a Map<String, String>
     * Example: {"url" -> "https://example.com"}
     */
    public Map<String, String> readExcelpoi(String excelFilePath, String sheetName) throws Exception {
        Map<String, String> data = new HashMap<>();

        try (FileInputStream fis = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new Exception("Sheet " + sheetName + " not found in " + excelFilePath);
            }

            // Read first row (assuming A1 = key, B1 = value)
            Row row = sheet.getRow(0);
            if (row != null) {
                Cell keyCell = row.getCell(0);
                Cell valueCell = row.getCell(1);

                if (keyCell != null && valueCell != null) {
                    data.put(keyCell.toString().trim(), valueCell.toString().trim());
                }
            }
        }
        return data;
    }

    // Example usage
    public static void main(String[] args) throws Exception {
        FileOperations fo = new FileOperations();

        // Path to your Config.xlsx (update path as needed)
        String excelPath = "C:\\Users\\YourUser\\eclipse-workspace\\YourProject\\Config.xlsx";

        // Read sheet
        Map<String, String> excelData = fo.readExcelpoi(excelPath, "Sheet1");

        // Fetch URL using key (e.g., "url")
        String url = excelData.get("url");
        System.out.println("URL from Excel: " + url);
    }
}