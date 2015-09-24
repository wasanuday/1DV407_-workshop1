package model;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class memberModel {
    ArrayList< member> memberlist =new ArrayList<member>();
    private FileUtil memberfile = new FileUtil();

    
    
	public void NewmemberRegister( String name , int pnumber) throws FileNotFoundException {
	     	 member m= new member (name, pnumber);
	 memberfile.saveNewMemberToFile( m.getId(),  name, pnumber);
	    memberlist.add(m);
		 
	    
	}
	
	public void EditMemberInfo( String oldName, String newName , int pernumber)
	
	{
//		int x=0;
//		while( pernumber!=memberlist.get(x).getPernumber())
//		{ 
//		   x++;
//		}
//		
//		member m = memberlist.get(x);
//		m.setName(name);
//		m.setPernumber(pernumber);
//		memberfile.updateMemberIfo(m.getId(), )
	}
	
	public ArrayList<member> getallmember()
	{
		return memberlist;
	}

	
	
	public void AddNewBoat(String name , int pnumber , String type , Double length)
	{
		memberfile.saveNewBoatToMemberfile(pnumber, name, type, length);
		
		int x=0;
		while( pnumber!=memberlist.get(x).getPernumber())
		{ 
		   x++;
		}
		
		member m = memberlist.get(x);
        m.addBoat(type, length);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void getmembers(){
		member mm = null;
   	  for( int x=0; x<memberlist.size();x++){
   		 mm= memberlist.get(0);
   		}
   	 System.out.println( mm.getName()+" "+ mm.getPernumber()+" "+mm.getId()+" type: "+ mm.memberBoat.get(0).getType()+"  length"+ 	
   		mm.memberBoat.get(0).getLength());
	}
}
