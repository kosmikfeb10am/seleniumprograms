package mar27th;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\Demo.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		//case 1
		//Modifying an existing cell
		
		ws.getRow(0).getCell(2).setCellValue("John");
		
		//Case 2
		//Adding new cell for existing row
				
				
		ws.getRow(1).createCell(2).setCellValue("Passed");
		
		//Case 3
		
		//Creating new Row 
		
		ws.createRow(3).createCell(0).setCellValue(false);
		
		FileOutputStream fos=new FileOutputStream("D:\\DemoMar27th m.xlsx");
		
		wb.write(fos);
		
		wb.close();
		
		
		
	}

}
