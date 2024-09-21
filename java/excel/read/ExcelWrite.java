package excel.read;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	public static void main(String[] args) throws IOException {
		String location ="src\\\\test\\\\resources\\\\TestData\\\\excel1.xlsx.";
		File file =new File(location);
		FileInputStream fis = new FileInputStream(file);

		XSSFWorkbook wbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = wbook.getSheet("Sample");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.createCell(0);
		cell.setCellValue("Sasikumar");
		
		FileOutputStream fos = new FileOutputStream(file); //to write mode
		wbook.write(fos);
		wbook.close();
		
		System.out.println("done");
	}
}
