package utils;

import constants.Location;

public class ExcelUtilsdemo {
	public static void main(String[] args) {
		ExcelUtils excel=new ExcelUtils(Location.EXCEL, "Sheet1");
		excel.getRowCount();
		excel.getCellStringData(0, 0);
		excel.getCellNumericData(1, 1);	
		
	}

}
