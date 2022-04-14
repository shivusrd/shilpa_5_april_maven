package excelutility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutility 
{
	static String path = "C:\\Users\\dubey\\eclipse-workspace\\5April_Framework\\testdata\\Book2.xlsx";
	
	  public static String Getreaddata(int rowno, int column)
	{
		String data = " ";
		
		try 
		 {
          FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			data = sheet.getRow(rowno).getCell(column).getStringCellValue();
        }

		catch (Exception e)
	   	 {  

		    System.out.println("issu in Getreaddata " + e);
		 }
			return data;
  }

	public static void main(String[] args) 
		{
			for (int i=1; i<=4; i++)
          {
				String out = Getreaddata(i, 2);
				String out1 = Getreaddata(i, 3);
				String out2 = Getreaddata(i, 4);
				String out3 = Getreaddata(i, 5);
				System.out.println(out+"   "+out1+"   "+out2+"    "+out3);
				
          }


		}
}
