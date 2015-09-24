package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileUtil {
  
      	
		/*
	    this method is used to read the file content into string
	*/
   public String getFileContent(String fileName) throws FileNotFoundException {
	    String result = "";
	    
	    Scanner input = new Scanner(new File(fileName));
	    while(input.hasNext()) {
	        result += input.nextLine();
	    }
	    
	    return result;
	}

	/*
	    this method is used to save the output text into filename
	*/
	public void saveNewMemberToFile(int id, String username, int personalnum) throws FileNotFoundException {
		
		System.out.println("id   "+id+" name   "+username+"&"+" personalnumber  "+personalnum);
      boolean flag = isFileExist("textfileMember.txt");
	    PrintWriter writer = new PrintWriter("textfileMember.txt");
        System.out.println(flag);
        
        
         writer.println("ssssssssssssssssssssssssssssssssssssssssssssssssssssss");
	    writer.close();
		}
	
	
	
	public void saveNewBoatToMemberfile( int pnumber , String name , String type , double length){
		
		
		
		
	}

	/*
	    this method is used to check if file exist or not
	*/
	public  boolean isFileExist(String fileName) {
	    return new File(fileName).exists();
	}
    

		
	}

