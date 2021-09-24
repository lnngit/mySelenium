package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	private XSSFWorkbook workbook;
	private XSSFSheet sheet;

	public ExcelUtils(String excelpath, String sheetname) {
		try {
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getRowCount() {
		
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("row count :" + numberOfRows);
		return numberOfRows;
	}
	
	public int getColCount() {
		int numberOfcols = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("col count :" + numberOfcols);
		return numberOfcols;
	}

	public String getCellStringData(int rowNum, int colNum) {
		String celldata = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		//System.out.println("cell data :" + celldata);
		return celldata;
		
	}

	public double getCellNumericData(int rowNum, int colNum) {
		double celldata = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
		System.out.println("cell data :" + celldata);
		return celldata;
	}
}
