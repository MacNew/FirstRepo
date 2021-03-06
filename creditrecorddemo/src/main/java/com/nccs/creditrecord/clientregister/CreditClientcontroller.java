package com.nccs.creditrecord.clientregister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class CreditClientcontroller {
	@Autowired private CreditClientService creditClientService;
	@RequestMapping(method = RequestMethod.GET, value = "/insertclient",consumes="application/json")
	public ResponseEntity addCrediterClient(){
		return new ResponseEntity(creditClientService.getData(), HttpStatus.OK);          
	}
}
