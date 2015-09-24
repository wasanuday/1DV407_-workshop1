package view;

import java.util.Scanner;

public class BoatView {
	Scanner input = new Scanner(System.in);
	 //  userInput u = new userInput();
	public void presentAddNewBoatInstruction()
	{    
		 System.out.println("************Add New Boat************");
	
         
	}
    public String getboatowner( )
    {
    	
    	System.out.println("Enter owner boat name");
    	return input.nextLine();
    	
    }
	
    public int getownerPersonalNumber()
    {
    	
    	
    	System.out.println(" Enter personal number of the boat owner");
    	return input.nextInt();
    	
    }
    
    public String GetBoatType()
    {
    	System.out.println("Enter boat type");
    	return input.next();
    	
    }
    
    public double GetBoatLength()
    {
    
    	System.out.println(" Enter boat length");
    	return input.nextDouble();
    	
    }
    
    
    
    
    public void printscontent()
	{
		System.out.println("configration info ***********************");
		
	}
   
}
