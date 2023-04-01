package com.demo.insurancemanagement.Service;

import java.util.List;
import java.util.Optional;

import com.demo.insurancemanagement.Domain.InsurancePolicy;


public interface InsurancePolicyService {
	

    public List<InsurancePolicy> getAllInsurancePolicies();

    public Optional<InsurancePolicy> getInsurancePolicyById(Long id);

    public InsurancePolicy createInsurancePolicy(InsurancePolicy insurancePolicy);

    public InsurancePolicy updateInsurancePolicy(Long id, InsurancePolicy insurancePolicy);

    public void deleteInsurancePolicy(Long id) ;
    
}

