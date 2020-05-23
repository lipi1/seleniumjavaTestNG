package dataDrivenTestCase;

import excelUtils.ExcelUtils;

public class dataDrivenTest {

	public static void main(String[] args) {
		ExcelUtils  reader= new ExcelUtils("D:\\professional\\Automation\\eclipse worksapce\\EndToEnd\\src\\main\\java\\excelTestData\\datadriven2.xlsx");
		int rowCount=reader.getRowCount("Sheet1");
		for (int row=2; row<=rowCount; row++) {
		System.out.println("-----------------------");	
		String column=reader.getCellData("Sheet1", "senario", row);
		System.out.println(column);
		String column2=reader.getCellData("Sheet1", "account", row);
		System.out.println(column2);
		String column3=reader.getCellData("Sheet1", "rows", row);
		System.out.println(column3);
		String column4=reader.getCellData("Sheet1", "templatename", row);
		System.out.println(column4);
		String column5=reader.getCellData("Sheet1", "fieldsintemplate", row);
		System.out.println(column5);
		
		// write you xpath code here and put webdriver outside for loop
		
		
	}

}
}
	
