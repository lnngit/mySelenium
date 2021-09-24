package utils;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constants.Location;

public class MyExcelUtils {
	private XSSFWorkbook workBook;
	private XSSFSheet sheet;

	public MyExcelUtils(String excelPath, String sheetName) {
		try {
			this.workBook = new XSSFWorkbook(excelPath);
			this.sheet = workBook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public MyExcelUtils(String excelPath, int sheetIndex) {
		try {
			this.workBook = new XSSFWorkbook(excelPath);
			this.sheet = workBook.getSheetAt(sheetIndex);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public int getNumberOfRows() {
		return sheet.getPhysicalNumberOfRows();
	}

	public String getStringCellValue(int row, int cell) {
		return sheet.getRow(row).getCell(cell).getStringCellValue();
	}

	public double getNumericCellValue(int row, int cell) {
		return sheet.getRow(row).getCell(cell).getNumericCellValue();
	}

	public String getCellValue(int rowNum, int cellNum) {
		XSSFCell cell = sheet.getRow(rowNum).getCell(cellNum);
		CellType type = cell.getCellType();
		if (CellType.STRING.equals(type)) {
			return cell.getStringCellValue();
		} else if (CellType.NUMERIC.equals(type)) {
			return String.valueOf(cell.getNumericCellValue());
		} else if (CellType.BOOLEAN.equals(type)) {
			return String.valueOf(cell.getBooleanCellValue());
		} else {
			return "";
		}
	}

	@Override
	protected void finalize() throws Throwable {
		if (workBook != null) {
			workBook.close();
		}
	}

	public static void main(String[] args) {
		MyExcelUtils utils = new MyExcelUtils(Location.EXCEL, 0);
		int rows = utils.getNumberOfRows();
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(utils.getCellValue(i, j));
			}
		}
	}
}
