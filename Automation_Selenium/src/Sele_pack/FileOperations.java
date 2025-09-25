package Sele_pack;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class FileOperations {

    /**
     * Reads key-value pairs from the first two columns of a sheet.
     * @param excelFilePath Path to the Excel file
     * @param sheetName Name of the sheet
     * @return Map with first column as keys and second column as values
     * @throws IOException if file/sheet not found or read error occurs
     */
    public Map<String, String> readExcelPOI(String excelFilePath, String sheetName) throws IOException {
        
    	HashMap<String, String> data = new HashMap<>();
    	
    	try (FileInputStream fis = new FileInputStream(excelFilePath);
    			Workbook wb = new XSSFWorkbook(fis)) {
    		
    		Sheet sheet = wb.getSheet(sheetName);
    		if(sheet == null) throw new IOException ("File not found " + sheetName);
    		
    		Iterator<Row> rows = sheet.iterator();
    		while(rows.hasNext()) {
    			Row row = rows.next();
    			Cell key = row.getCell(0);
    			Cell val = row.getCell(1);
    			
    			if(key == null || val == null) continue;
    			
    			key.setCellType(CellType.STRING);
    			val.setCellType(CellType.STRING);
    			
    			String k = key.getStringCellValue().trim();
    			String v = val.getStringCellValue().trim();
    			
    			if(!k.isEmpty()) {
    				data.put(k, v);
    			}
    		}
    	}
    	return data;
    }
}
