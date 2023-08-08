package com.BondApplication.Services;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BondApplication.Models.Security;
//import com.BondApplication.Repo.SecurityRepository;
import com.BondApplication.Repo.SecurityRepository;

@Service
public class SecurityServices {
	
	@Autowired
	private SecurityRepository repository ;

	
	public List<Security> getAllSecurities() {
		System.out.println("In all securities");
//		List<Security> securities = new ArrayList<>();
		List<Security> securities = repository.findAll()
;//		System.out.println(repository.findAll());
//		for(Security security : repository.findAll()) {
//			securities.add(security) ;
//		}
//		
//		System.out.println(securities);
		return securities ;
	}
	
	
	public Security getSecuritybyId(long id) {
		return  repository.findById(id).get() ;
	}
	
	
	public List<Security> getSecurityByDateRange(LocalDate fromDate ,LocalDate toDate){
		List<Security> securities = new ArrayList<>();
		for(Security security : repository.getData_between(fromDate, toDate)) {
			securities.add(security) ;
		}
		return securities ;
	}
	
	public ResponseEntity<Security> createSecurity(Security security) throws URISyntaxException {
		Security result = repository.save(security) ;
		return ResponseEntity.created(new URI("/api/Security/" + result.getSecurityId()))
                .body(result);
	}
	
	public ResponseEntity<Security> updateSecurity(Security security) {
		Security result = repository.save(security) ;
		return ResponseEntity.ok().body(result) ;
		
	}
	
	public ResponseEntity<Security> deleteSecurity(long id) {
		repository.deleteById(id);
		return ResponseEntity.ok().build();
	}
	
}
