package testNGHW;

import java.io.IOException;
//import java.util.Iterator;

//import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExecl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//setup the path
		XSSFWorkbook wb =new XSSFWorkbook("./data/CreateLead.xlsx");
		//sheet
		XSSFSheet ws= wb.getSheet("Sheet1");
		//row
//		XSSFRow row=ws.getRow(0);
		//
		
	int rowcount=	ws.getLastRowNum();
	System.out.println(rowcount);
	 int cellcount =ws.getRow(0).getLastCellNum();
	for (int i = 1; i < rowcount; i++) {
	for (int j = 0; j <cellcount; j++) {
	String data =	ws.getRow(i).getCell(j).getStringCellValue();
		System.out.println(data);
	}	
	}
	wb.close();
	}

}
