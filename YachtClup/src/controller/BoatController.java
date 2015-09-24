package controller;

public class BoatController {

	public void applyAddingBoat(model.memberModel m , view.BoatView v ) {

      v.presentAddNewBoatInstruction();
      String in=  v.getboatowner();
      int  in1 = v.getownerPersonalNumber();
      String in2 = v.GetBoatType();
     double in3= v.GetBoatLength();
     m.AddNewBoat(in, in1, in2, in3);
     
      
	}

}
