package excelData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataExtractionUsingIterator {

	public static ArrayList getdata(String pageName) throws IOException {

		ArrayList data = new ArrayList();

		// creating input excel file FILEINPUTSTREAM
		FileInputStream fis = new FileInputStream("C:\\Users\\vinit\\OneDrive\\Desktop\\self\\Book1.xlsx");

		// creating object of XSSFWorkBook class to access required excel workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// getting the number of sheets and iterating
		int sheetNumber = wb.getNumberOfSheets();
		for (int j = 0; j < sheetNumber; j++) {

			// checking for required sheet name
			if (wb.getSheetName(j).equalsIgnoreCase("testdata")) {

				int k = 0;
				int column = 0;
				// opening the sheet required using getSheetAt(index); whose return type is
				// XSSFSheet
				XSSFSheet sheet = wb.getSheetAt(j);

				Iterator<Row> rows = sheet.iterator(); // sheet is collection of rows

				Row firstRow = rows.next();

				Iterator<Cell> ce = firstRow.cellIterator(); // rows is collection of cells

				//checking for the column of our choice
				while (ce.hasNext()) {
					String value = ce.next().getStringCellValue();
					if (value.equalsIgnoreCase("Pages")) {
						column = k;
						break;
					}
					k++; //defining a counter to get index of required column
				}
				
				//using while loop and iterator to iterate through all rows at sheet levell
				while (rows.hasNext()) {

					//filtering row based on requirement
					Row r = rows.next();
					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(pageName)) {
						
						//using cell iterator and while loop to iterate through cells of required row
						Iterator<Cell> cr = r.cellIterator();
						
						while (cr.hasNext()) {
							Cell c= cr.next();
							
							//getting cell type and extracting numeric or string accordingly
							if (c.getCellType()==CellType.STRING) {
								data.add(c.getStringCellValue());
							}
							else {
								data.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
							
						}
					}
				}

			}

		}
		return data;
	}
	
	public static void main (String[] args) throws IOException{
		ExcelDataExtractionUsingIterator ed= new ExcelDataExtractionUsingIterator();
		ArrayList a=ed.getdata("Login");
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		System.out.println(a.get(2));
		System.out.println(a.get(3));
	}

}
