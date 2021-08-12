package FileReadingPrograms;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReading {
public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("D:\\Data\\ExcelWorksheet.xlsx");
	XSSFWorkbook vb= new XSSFWorkbook(fis);
	XSSFSheet sheet=vb.getSheetAt(0);
	String data= sheet.getRow(0).getCell(1).getStringCellValue();
	System.out.println(data);
	double data1= sheet.getRow(1).getCell(1).getNumericCellValue();
	System.out.println(data1);
		

}
}
