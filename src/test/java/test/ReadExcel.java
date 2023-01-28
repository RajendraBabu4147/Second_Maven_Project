package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ReadExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver;// declared here to make it access to all methods 

		System.setProperty("webdriver.edge.driver", "C:\\ShiftGear\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();

		
		
		File file = new File("C:\\Users\\Rajendra.Babu\\eclipse-workspace\\Second_Maven_Project2\\StudentRegistrationForm.xls");
		FileInputStream fis = new FileInputStream(file);
		//creating workbook instance that refers to .xls file

		HSSFWorkbook wb=new HSSFWorkbook(fis);

		//creating a Sheet object to retrieve the object

		HSSFSheet sheet=wb.getSheetAt(0);

		//evaluating cell type

		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();

		for(Row row: sheet) //iteration over row using for each loop

		{

		for(Cell cell: row) //iteration over cell using for each loop

		{

		switch(formulaEvaluator.evaluateInCell(cell).getCellType())

		{

		
		case STRING: 
		System.out.print(cell.getStringCellValue()+ "\t\t");
		break;
		
		case NUMERIC:
		/* Double intr = cell.getNumericCellValue();
		System.out.print(intr + "\t\t");
		break;
		*/
		
		/*DataFormatter dataFormatter = new DataFormatter();
		String formattedCellStr = dataFormatter.formatCellValue(cell);
		System.out.print(formattedCellStr + "\t\t");
		break;
		*/
			
			double retVal = cell.getNumericCellValue();
            System.out.println(retVal);
            NumberFormat nf = DecimalFormat.getInstance();
            nf.setMaximumFractionDigits(0);
            String str = nf.format(retVal);
            System.out.println(str);
            str=str.replace(",", "");
            System.out.println(str);
            break;
            
            
		default:
		break;

		}

		}

		System.out.println();

		}
		
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
	       
		for(int i=1;i<=rowCount;i++) 
		{
		WebElement firstName = driver.findElement(By.id("firstName"));  
		firstName.sendKeys(sheet.getRow(i).getCell(0).getStringCellValue());
				
		WebElement lastName = driver.findElement(By.id("lastName"));  
		lastName.sendKeys(sheet.getRow(i).getCell(1).getStringCellValue());
		
		WebElement email = driver.findElement(By.id("userEmail"));  
		email.sendKeys(sheet.getRow(i).getCell(2).getStringCellValue());
		
		WebElement userNum = driver.findElement(By.id("userNumber"));  
		userNum.sendKeys(String.valueOf(sheet.getRow(i).getCell(3).getNumericCellValue()));
		
		WebElement currentAdd = driver.findElement(By.id("currentAddress"));  
		currentAdd.sendKeys(sheet.getRow(i).getCell(4).getStringCellValue());
		
		}
		//driver.quit();
	}
	}