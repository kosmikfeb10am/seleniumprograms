package mar27th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	
	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis=new FileInputStream("D:\\Demo.xlsx");
		
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet ws=wb.getSheet("Sheet1");
		
		System.out.println(" no of rows "+ws.getPhysicalNumberOfRows());
		
		System.out.println(" last row index"+ws.getLastRowNum());
		
		
		Iterator<Row> rows=ws.iterator();
		
		
		Row r=null;
		
		Cell c=null;
		
		while(rows.hasNext())
		{
			
			
			r=rows.next();
			
			System.out.println(" no of cells "+ r.getPhysicalNumberOfCells());
			
			
			Iterator<Cell> cells=r.iterator();
			
			
			while(cells.hasNext())
			{
				
				c=cells.next();
				
				if(c.getCellType()==CellType.STRING)
				{
					
					System.out.println(c.getStringCellValue()+" is a String");
				}
				else if(c.getCellType()==CellType.NUMERIC)
				{
					
					System.out.println(c.getNumericCellValue()+" is a Number");
				}
				else if(c.getCellType()==CellType.BOOLEAN)
				{
					
					System.out.println(c.getBooleanCellValue()+" is a boolean");
				}
			}
		}
		
		
		
	}

}
