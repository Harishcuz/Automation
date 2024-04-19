package SeleniumConcept;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class DataDriverFrameworkConcept {
	public static List<LinkedHashMap<String,String>> readingValueFromExcel() throws IOException {
		List<LinkedHashMap<String,String>> empList = new ArrayList<LinkedHashMap<String,String>>();
		File excelLocation = new File("E:\\Selenium\\Believerz\\Automation\\TestData\\datas.xlsx");
		FileInputStream f = new FileInputStream(excelLocation);
		Workbook wb =  new XSSFWorkbook(f);  // xlsx 
		//Workbook wb =  new HSSfWorkbook();  // xls   old format
		Sheet s=wb.getSheet("datafile");
		Row headerRow = s.getRow(0);
		for(int i=1; i<s.getPhysicalNumberOfRows(); i++){
			LinkedHashMap<String,String> mapdata = new LinkedHashMap<String,String>();
			Row eachrow = s.getRow(i);
			for(int j=0;j<headerRow.getPhysicalNumberOfCells();j++) {
				Cell eachCell = eachrow.getCell(j);
				if(eachCell.getCellType()==CellType.NUMERIC) {
					Double number = eachCell.getNumericCellValue();
					long longnumber = new Double(number).longValue();
				String name=	String.valueOf(longnumber);
				mapdata.put(headerRow.getCell(j).getStringCellValue(), name);
				}
				if(eachCell.getCellType()==CellType.STRING) {
					mapdata.put(headerRow.getCell(j).getStringCellValue(), eachCell.getStringCellValue());
				}
			}
			empList.add(mapdata);
		}
		return empList;
	}
	public static void main(String[] args) throws IOException  {
		System.out.println(readingValueFromExcel().get(0).get("password"));
		System.out.println();
		
	}
}
