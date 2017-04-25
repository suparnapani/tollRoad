import java.io.FileInputStream;

import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class ExcelDemo {

	public void readExcel() throws BiffException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Suparna\\Desktop\\ExcelDemo.xls");
	Workbook wb=Workbook.getWorkbook(fis);
	Sheet sh=wb.getSheet("Sheet1");
	int totalNoOfRows=sh.getRows();
	int totalNoOfCol=sh.getColumns();
	for(int row=0;row<totalNoOfRows;row++)
	{
		for(int col=0;col<totalNoOfCol;col++)
		{
			System.out.println(sh.getCell(col,row).getContents()+"\t");
	}
	System.out.println();
				
	}
}

	public static void main(String[] args) throws BiffException, IOException 
	{
		// TODO Auto-generated method stub
ExcelDemo d=new ExcelDemo();
d.readExcel();
	}
	}


