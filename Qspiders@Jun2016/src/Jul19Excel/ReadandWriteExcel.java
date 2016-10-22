package Jul19Excel;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadandWriteExcel {
	
		public static int readExecel() throws IOException, EncryptedDocumentException, InvalidFormatException {
		FileInputStream fis=new FileInputStream("E:/SEstuff/book1.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
	
	int rc=wb.getSheet("Sheet1").getLastRowNum();
	System.out.println(rc);
	return rc;
  }
}
