package com.BondApplication.Controller;

import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BondApplication.Models.Security;
import com.BondApplication.Services.SecurityServices;

@CrossOrigin(origins = "http://localhost:8080")

@RestController
@RequestMapping("/api")
public class SecurityController {

	@Autowired
	private SecurityServices service;

	@GetMapping("/Security")
	public List<Security> getAllSecurities() {
		System.out.println("In api cointroller");
		return service.getAllSecurities();
	}

	@GetMapping("/Security/{id}")
	public Security getSecuritybyId(@PathVariable long id) {
		return service.getSecuritybyId(id);
	}

	@GetMapping("/Security/{start_date}/{end_date}")
	public List<Security> getSecuritybyId(
			@PathVariable(value = "start_date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
			@PathVariable(value = "end_date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate) {
		return service.getSecurityByDateRange(fromDate, toDate);
	}

	@PostMapping("/Security")
	public ResponseEntity<Security> createSecurity(@RequestBody Security security) throws URISyntaxException {
		return service.createSecurity(security);
	}

	@PutMapping("/Security/{id}")
	public ResponseEntity<Security> updateSecurity(@RequestBody Security security) {
		return service.updateSecurity(security);
	}

	@DeleteMapping("/Security/{id}")
	public ResponseEntity<?> deleteGroup(@PathVariable long id) {
		return service.deleteSecurity(id);
	}

}
