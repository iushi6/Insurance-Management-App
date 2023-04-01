package com.demo.insurancemanagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.insurancemanagement.Domain.InsurancePolicy;
import com.demo.insurancemanagement.Repository.InsurancePoliciesRepository;

@RestController
@RequestMapping("/api/policies")
public class InsurancePolicyController {

	@Autowired
	private InsurancePoliciesRepository insurancePoliciesRepository;
	
	@GetMapping
	public List<InsurancePolicy>getAllPolicies(){
		return insurancePoliciesRepository.findAll();		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<InsurancePolicy> getInsurancePoliciesById(@PathVariable Long policyId){
		Optional<InsurancePolicy> oinsurancePolicy = insurancePoliciesRepository.findById(policyId);
		
		if(oinsurancePolicy.isPresent()) {
			return ResponseEntity.ok(oinsurancePolicy.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public InsurancePolicy createInsureancePolicies(@RequestBody InsurancePolicy insurancePolicies) {
		return insurancePoliciesRepository.save(insurancePolicies);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<InsurancePolicy> updateInsurancePolicies(@PathVariable Long policyId, @RequestBody InsurancePolicy updatedPolicy){
		Optional<InsurancePolicy> optionalPolicy = insurancePoliciesRepository.findById(policyId);
		if(optionalPolicy.isPresent()) {
			InsurancePolicy insurancePolicies = optionalPolicy.get();
			insurancePolicies.setType(updatedPolicy.getType());
			insurancePolicies.setPremium(updatedPolicy.getPremium());
			insurancePolicies.setStartDate(updatedPolicy.getStartDate());
			insurancePolicies.setEndDate(updatedPolicy.getEndDate());
			insurancePolicies.setCoverageAmount(updatedPolicy.getCoverageAmount());
			return ResponseEntity.ok(insurancePoliciesRepository.save(insurancePolicies));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteInsurancePolicy(@PathVariable Long policyId){
		Optional<InsurancePolicy> optionalPolicy = insurancePoliciesRepository.findById(policyId);
		if(optionalPolicy.isPresent()) {
			insurancePoliciesRepository.deleteById(policyId);
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}
