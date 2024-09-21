package excel.read;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {
	public static void main(String[] args) throws IOException {
		String location ="src\\test\\resources\\TestData\\excel1.xlsx.";
		XSSFWorkbook wbook=new XSSFWorkbook(location);
		XSSFSheet sheet=wbook.getSheetAt(1);
		int noofRows=sheet.getPhysicalNumberOfRows();
		for(int i=0;i<noofRows;i++) {
		XSSFRow row=sheet.getRow(i);
			int noOfCell=row.getPhysicalNumberOfCells();
			for(int j=0;j<noOfCell;j++) {
		XSSFCell cell=row.getCell(j);
		CellType cellType=cell.getCellType();
			if(cellType==CellType.STRING) {
				String svalue=cell.getStringCellValue();
			System.out.println("String value"+svalue);
			}else if(cellType==CellType.BOOLEAN) {
				Boolean bvalue=cell.getBooleanCellValue();
				System.out.println("boolean value"+bvalue);
			}else if(cellType==CellType.NUMERIC) { 
			if(DateUtil.isCellDateFormatted(cell)){
				Date d = cell.getDateCellValue();
				SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
				String dvalue=df.format(d);
				System.out.println("DateValue"+dvalue);
			}
			else{
				double value=cell.getNumericCellValue();
				System.out.println("Numeric value"+value);
			}
			}
		}
		}
		wbook.close();
	}
	}

