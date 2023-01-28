package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file = new File("C:\\Users\\Rajendra.Babu\\eclipse-workspace\\Second_Maven_Project2\\DataSource.xls");
		FileInputStream fis = new FileInputStream(file);
		
		//Horrible Spreadsheet format for .xls format 
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		HSSFSheet sh = wb.getSheetAt(0);
				
		int rowCount = sh.getLastRowNum()-sh.getFirstRowNum();
		int cellCount = sh.getRow(1).getLastCellNum();
		
		String arr[][] = new String[rowCount+1][cellCount];
		
		for(int i=0;i<=rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				arr[i][j]=sh.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		for(int k=1;k<arr.length;k++)
		{
			for(int l=0;l<cellCount;l++)
			{
				System.out.print(arr[k][l]+",");
			}
			System.out.println();
		}		

	}

}
