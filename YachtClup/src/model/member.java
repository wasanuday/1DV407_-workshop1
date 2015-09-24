package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class member {

	private String name;
	private static int  id=0;
	private int pernumber;
	ArrayList<Boat> memberBoat;
	

	public member(  String name, int pernumber ) throws FileNotFoundException {
		this.name= name;
		this.id= ++id;
		this.pernumber= pernumber;
		memberBoat = new ArrayList<Boat>();
	
		}

	
      public void addBoat( String type, double length )
      {
    	  this.memberBoat.add(new Boat(type,length));
        
      }
      

      public int countBoatsOfmember()
    {
    	
    	return memberBoat.size();
    }

	  public String getName() {
		return name;
	}


	 public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getPernumber() {
		return pernumber;
	}




	public void setPernumber(int pernumber) {
		this.pernumber = pernumber;
	}




//	public FileUtil getMeModel() {
//		return memberfile;
//	}
//
//
//
//
//	public void setMeModel( FileUtil file) {
//		this.memberfile= file;
//	}
	
	
	
	
	
		
		
	
	}