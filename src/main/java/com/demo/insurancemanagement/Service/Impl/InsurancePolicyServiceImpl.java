package com.demo.insurancemanagement.Service.Impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.demo.insurancemanagement.Domain.InsurancePolicy;
import com.demo.insurancemanagement.Repository.InsurancePolicyRepository;
import com.demo.insurancemanagement.Service.InsurancePolicyService;


@Service
public class InsurancePolicyServiceImpl implements InsurancePolicyService{
	
	
	@Autowired
	public InsurancePolicyRepository insurancePolicyRepository;
	
	public List<InsurancePolicy> getAllInsurancePolicies() {
	    try {
	        return insurancePolicyRepository.findAll();
	    } catch (Exception e) {
	        e.printStackTrace();
	        // throwing a custom exception here
	         throw new ResourceNotFoundException("Insurance Policies", "all", null);
	    }
	}
	
	    public Optional<InsurancePolicy> getInsurancePolicyById(Long id) {
	    	try {
	        return insurancePolicyRepository.findById(id);
	    } catch (Exception e) {
	    	e.printStackTrace();
	    	throw new ResourceNotFoundException("Insurance Policy not found","wrong id",null);
	    }
	    	
	  }

	    public InsurancePolicy createInsurancePolicy(InsurancePolicy insurancePolicy) {
	        return insurancePolicyRepository.save(insurancePolicy);
	    }

	    public InsurancePolicy updateInsurancePolicy(Long id, InsurancePolicy insurancePolicy) {
	        insurancePolicy.setId(id);
	        try {
				return insurancePolicyRepository.save(insurancePolicy);
			} catch (Exception e) {
				e.printStackTrace();
				throw new ResourceNotFoundException("Insurance Policy not found ","Create new",null);
			}
	    }

	    public void deleteInsurancePolicy(Long id) {
	        insurancePolicyRepository.deleteById(id);
	    }
	
	
}