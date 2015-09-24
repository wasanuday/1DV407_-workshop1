package view;

import java.util.Scanner;

public class memberView {
   //userInput n = new userInput();
	Scanner input = new Scanner(System.in);

	// private  String GetInputChar() {
		 
		//   String choise = input.next();
		//return choise;
		    
//		    try {
//		      int c = System.in.read();
//		      while (c == '\r' || c =='\n') {
//		        c = System.in.read();
//		      }
//		      return c;
//		    } catch (java.io.IOException e) {
//		      System.out.println("" + e);
//		      return 0;
//		    }
	//	  }
//		  
//		  public boolean WantsToQuit() {
//		    return GetInputChar().equals("q");
//		  }
		  
//		  public boolean WantsToRegisterMember()
//		  
//		  {
//			  
//			  return GetInputChar() == 'r';
//		  }
		  
		  public void PresentWelcomeMessage() {
			    System.out.println("welcome.............");
			  }

		  public void PresentInstructions() {
			    System.out.println(" 'r' to register new member, 'q' to quit");
	
}
		  
		  public void newMemberRegistration() {
			    System.out.println("  Register new member");
	   
			  }
		  
		  public int getpersonalnumber()
		  {
			   
		    System.out.println("Enter your  new personal number >> ");
			int pernum= input.nextInt(); 
			return pernum;
		  }
		  
		  public String getusername(){
		  System.out.println("Enter new username >> ");
			String name= input.next();
			return name;
		  }
		  
		
}
