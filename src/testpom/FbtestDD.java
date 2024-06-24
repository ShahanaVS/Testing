package testpom;

import org.testng.annotations.Test;

import basepkgDD.Baseclassfb;
import pagepom.FbpageDD;
import utilitydd.Excelutil;

public class FbtestDD extends Baseclassfb{
	@Test
	public void test()
	{
		FbpageDD ob = new FbpageDD(driver);
		//Reading the data from excel file
		String x1 = "C:\\Users\\hp\\eclipse-workspace\\Seleniumclass\\excel\\fbbbb.xlsx";
		String Sheet = "Sheet 1";
		int rowCount = Excelutil.getRowCount(x1, Sheet);
		for(int i=1;i<=rowCount;i++)
		{
			String Username = Excelutil.getCellValue(x1,Sheet,i,0);
			System.out.println("username---"  +Username);
			String Pwd = Excelutil.getCellValue(x1,Sheet,i,1);
			System.out.println("password--" +Pwd);
			
			ob.setvalues(Username, Pwd);
			ob.login();
		}
		
	}
	

}
