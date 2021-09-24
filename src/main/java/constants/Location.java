package constants;

public interface Location {
	String PROJECT = System.getProperty("user.dir");
	String DRIVER = PROJECT + "/src/main/resources/drivers/";
	String PROPS = PROJECT + "/src/main/resources/config.properties";
	public String EXCEL = PROJECT + "/src/test/resources/excel/Data.xlsx";
}
