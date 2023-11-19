package excelData;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataExtraction {

	public static void main(String[] args) throws IOException {

		// creating input excel file FILEINPUTSTREAM
		FileInputStream fis = new FileInputStream("C:\\Users\\vinit\\OneDrive\\Desktop\\self\\Book1.xlsx");

		// creating object of XSSFWorkBook class to access required excel workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// getting the number of sheets and iterating
		int sheetNumber = wb.getNumberOfSheets();
		for (int j = 0; j < sheetNumber; j++) {

			// checking for required sheet name
			if (wb.getSheetName(j).equalsIgnoreCase("testdata")) {

				// opening the sheet required using getSheetAt(index); whose return type is XSSFSheet
				XSSFSheet sheet = wb.getSheetAt(j);

				// getting number of rows containing some data and iterating
				int numRows = sheet.getPhysicalNumberOfRows();

				for (int i = 1; i <= numRows; i++) {

					// checking for required row
					String col1 = sheet.getRow(i).getCell(0).toString();

					if (col1.equalsIgnoreCase("Product")) {

						// getting access to required row and getting the cell values
						String col2 = sheet.getRow(i).getCell(1).toString();
						String col3 = sheet.getRow(i).getCell(2).toString();

						System.out.println(col2);
						System.out.println(col3);

						// for writing data to excel creating a new cell and setting a cell value
						sheet.getRow(i).createCell(3).setCellValue("Nailed it");
						break;
					}
				}
				break;
			}
		}

		// creating FileOutputStream object and giving path of file to write data to
		FileOutputStream fos = new FileOutputStream("C:\\Users\\vinit\\OneDrive\\Desktop\\self\\Book1.xlsx");

		// writing data to workbook and sending FileOutputStream object
		wb.write(fos);

		// closing fileinput and fileoutput stream and workbook
		wb.close();
		fis.close();
		fos.close();

	}

}
