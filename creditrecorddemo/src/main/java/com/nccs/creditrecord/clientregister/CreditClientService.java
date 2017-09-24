package com.nccs.creditrecord.clientregister;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nccs.creditrecord.vender.register.Vender;
@Service
public class CreditClientService {
 	@Autowired private CreditClientRepository clientRepository;
	public List<CreditClient> getData() {
		List<CreditClient> creditersclient = new ArrayList<>();
		clientRepository.findAll().forEach(creditersclient::add);
		return creditersclient;
	}
       
}
