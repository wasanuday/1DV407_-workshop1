package controller;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ControllerMain {

	public static void main(String[] args) throws FileNotFoundException {
	    model.memberModel model = new model.memberModel();
	    view.memberView mview= new view.memberView();
	    view.BoatView bview = new view.BoatView();
	
	
        MemberController  membercontroller =  new	MemberController();
        BoatController boatcontroller = new BoatController();
        membercontroller.apply(mview, model);
      //  boatcontroller.applyAddingBoat(model, bview);
      //    model.getmembers();
       
        
        System.out.println("hiiiii");
		
	}

}


