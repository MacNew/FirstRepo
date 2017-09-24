package com.nccs.creditrecord.vender.register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class VenderController {
	@Autowired
	private VenderService venderservice;
 @RequestMapping(method = RequestMethod.GET, value = "/register")
	public ResponseEntity<String> handle() {
		return new ResponseEntity(venderservice.getData(), HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.POST, value = "/register")
	public ResponseEntity addData(@RequestBody Vender vender) {
		if (venderservice.addVender(vender)!=null) {
			 return new ResponseEntity(vender,HttpStatus.OK);
		} else {
			return new ResponseEntity("Can't register",HttpStatus.BAD_REQUEST);

		}		
	}
	@RequestMapping(method = RequestMethod.PUT, value = "/register")
	public ResponseEntity updateData(@RequestBody Vender vender) {
		venderservice.updateVender(vender);
		return new ResponseEntity( vender, HttpStatus.OK);
	}
	//user name or password checking;
	@RequestMapping(method = RequestMethod.POST, value="/checkusernameandpassword", produces = MediaType.APPLICATION_JSON_VALUE)
     public ResponseEntity check(@RequestBody Vender vender){
		    if( venderservice.check(vender)==null){
		    	System.out.println("Hello i am null");
		    	 return new ResponseEntity(HttpStatus.BAD_REQUEST);
				    
		    }   else{
		    		 System.out.println(venderservice.check(vender).getFname()+"Hello i am first name");
			         System.out.println(venderservice.check(vender).getLname()+"Hello i am last name");
			           return new ResponseEntity( venderservice.check(vender),HttpStatus.OK);   			    	
			   
		    	 
		    }
	       	
             
	}   	
	
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/check_username/{username:.+}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity getId(@PathVariable("username") String username) {
		if (venderservice.getData(username)) {
			return new ResponseEntity(venderservice.getData(username), HttpStatus.OK);
		} else {
			return new ResponseEntity(false, HttpStatus.BAD_REQUEST);
		}
	} 
}
