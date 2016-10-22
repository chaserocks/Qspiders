package ClassProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class countingthenoofrowsandcellsinXl {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis=new FileInputStream("E:/SEstuff/book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rc=wb.getSheet("sheet3").getLastRowNum();
		System.out.println(rc);
		
		for(int i=0;i<=rc;i++)
		{
			int cc=wb.getSheet("sheet3").getRow(i).getLastCellNum();
			System.out.println(cc);
		}
	}

}
