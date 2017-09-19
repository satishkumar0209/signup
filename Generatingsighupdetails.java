package erp;


import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;



public class Generatingsighupdetails
{
public static void main(String args[]) throws IOException, RowsExceededException, WriteException{
	
	String randomNumbers = RandomStringUtils.randomNumeric(5);
	String phNo = 79393+randomNumbers;
	String email= "satish@"+randomNumbers+".com";
	String name="satish";
	String password="123456";
	File f=new File("/home/vinod/Music/satish.xls");
	WritableWorkbook myexcel=Workbook.createWorkbook(f);
	WritableSheet mysheet=myexcel.createSheet("mysheet",0);
	Label one=new Label(0,0, name);
	Label two=new Label(0,1,email);
	Label Three=new Label(0,2,phNo);
	Label four=new Label(0,3,password);
	mysheet.addCell(one);
	mysheet.addCell(two);
	mysheet.addCell(Three);
	mysheet.addCell(four);
	myexcel.write();
	myexcel.close();
	
	
}
	
}
