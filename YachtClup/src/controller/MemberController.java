package controller;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import model.member;

public class MemberController {

	public void apply(view.memberView view,model.memberModel model ) throws FileNotFoundException {
		view.PresentWelcomeMessage();
	     view.PresentInstructions();
	     
	     
//	     while(view.WantsToQuit()!= true)
//	     {
	    	 view.newMemberRegistration();
	    	 String username= view.getusername();
	    	int pnumber=   view.getpersonalnumber();
	    	 
	    //	System.out.println(username+" "+pnumber);
	    	  model.NewmemberRegister(username, pnumber);
	    	//	System.out.println(model.getmembers());
	    	  

	    	// model.saveintoTextFile();
	       


	}

}
