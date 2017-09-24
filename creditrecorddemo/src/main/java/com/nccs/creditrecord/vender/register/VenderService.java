package com.nccs.creditrecord.vender.register;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VenderService {
	@Autowired
	private VenderRepository venderrepository;

	public Vender  addVender(Vender vender) {
		Boolean check=true;
		List<Vender>venderlist = new ArrayList<>();
		venderrepository.findAll().forEach(venderlist::add);
		for(Vender ven:venderlist){
			 if(ven.getUsername().equalsIgnoreCase(vender.getUsername())){
				 	check= false; 
			 }
 			
		}
		if(check){
			 	venderrepository.save(vender);
			 	return vender;
		}else{
			return null;	
		}
		
		
	}
public Vender  check(Vender vender) {
	   	       Vender  venderdetails = new Vender();
	   	       List<Vender>venderlist = new ArrayList<>();
	   	       venderrepository.findAll().forEach(venderlist::add);
	   	       for(Vender ven:venderlist){
                  if(ven.getUsername().equalsIgnoreCase(vender.getUsername())&&ven.getPassword().equalsIgnoreCase(vender.getPassword())){
                      venderdetails.setFname(ven.getFname());
                      venderdetails.setLname(ven.getLname());
                      venderdetails.setUsername(ven.getUsername());
                 
                       return venderdetails; 
                	  
                  }	   	    	   
	                                 	       	    	   
	   	       }       
		     return  null;
	}

	public void updateVender(Vender vender) {
		venderrepository.save(vender);

	}

	public List<Vender> getData() {
		List<Vender> vender = new ArrayList<>();
		venderrepository.findAll().forEach(vender::add);
		return vender;
	}

	public Boolean getData(String username) {
	
		List<Vender> vender = new ArrayList<Vender>();
		venderrepository.findAll().forEach(vender::add);
		for (Vender ven : vender) {
			if (ven.getUsername().equalsIgnoreCase(username)) {
				return true;				
			}
		}
		return false;
	}

}
