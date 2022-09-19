package chrome;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		String path = "C:\\Users\\Pratiksh\\Downloads\\KesaleP..xlsx";
		FileInputStream  file = new FileInputStream(path);
		Sheet value = WorkbookFactory.create(file).getSheet("sheet1");
		
		int lastrow = value.getLastRowNum();
		int lastcolumn = value.getRow(0).getLastCellNum();
		for(int i=0; i<lastrow; i++) 
		{
			for(int j=0; j<lastcolumn; j++) 
			{
				System.out.print(value.getRow(i).getCell(j).getStringCellValue()+"||");				
			}
			System.out.println();			
		}
	
			
		
		
	}
	

}
