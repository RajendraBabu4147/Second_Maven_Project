package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;


public class ReadStudentExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	/*	File file = new File("C:\\Users\\Rajendra.Babu\\eclipse-workspace\\Second_Maven_Project2\\StudentRegistrationForm.xls");
		FileInputStream fis = new FileInputStream(file);
		
		//Horrible Spreadsheet format for .xls format 
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheetAt(0);
				
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sh)     //iteration over row using for each loop  
		{  
		for(Cell cell: row)    //iteration over cell using for each loop  
		{  
		switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
		{  
		 
		case Cell.FirstName:    //field that represents string cell type  
		System.out.print(cell.getStringCellValue()+ "\t\t");  
		break;
		
		case Cell.LastName:   //field that represents numeric cell type  
		System.out.print(cell.getNumericCellValue()+ "\t\t");   
		break;
			
			
		}  
		}  
		System.out.println();  
		
		
	}  
		*/
		}  
		}  