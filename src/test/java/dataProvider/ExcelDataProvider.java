package dataProvider;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	XSSFWorkbook wb;

	public ExcelDataProvider() {
		File src = new File("./ApplicationTestData/AppData.xlsx");

		try {
			FileInputStream fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			System.out.println("Exception is " + e.getMessage());
		}
	}

	public String getData(int sheetIndex, int row, int column) {
		// To get the Data using the Sheet Index
		String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public String getData(String sheetname, int row, int column) {
		// To get the Data using the Sheet Name
		String data = wb.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
		return data;
	}

	public int getRowCount(int SheetIndex) {
		int row = wb.getSheetAt(SheetIndex).getLastRowNum();

		row = row + 1;
		return row;
	}

}
