package ClassProject;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//WAS to PRint contentt of Xl sheet which has Data in 3 rows and 3 columns?
public class WritedataasinWebTableformatinXL {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("E:/SEstuff/book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				Cell c =wb.getSheet("sheet2").getRow(i).getCell(j);
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
	}
	
}
