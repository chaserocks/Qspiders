package ClassProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//WAS to Read Data from Xl sheets and write Data to Xl Sheets?
public class ReadWriteinXlSheets {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	// Open xl File
	
	FileInputStream fis=new FileInputStream("E:/SEstuff/book1.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	//read data
	Cell c=wb.getSheet("sheet1").getRow(0).getCell(0);
	System.out.println(c.toString());
	//write data and save/saveAs
	c.setCellValue("Manager");
	FileOutputStream fos=new FileOutputStream("E:/SEstuff/book1.xlsx");
	wb.write(fos);
	
}
}
