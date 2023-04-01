package com.demo.insurancemanagement.Service.Impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.insurancemanagement.Domain.Claim;
import com.demo.insurancemanagement.Repository.ClaimRepository;
import com.demo.insurancemanagement.Service.ClaimService;

@Service
public class ClaimServiceImpl implements ClaimService{
	
	    @Autowired
	    private ClaimRepository claimRepository;

	    public List<Claim> getAllClaims() {
	        return claimRepository.findAll();
	    }

	    public Optional<Claim> getClaimById(Long id) {
	    	try {
	        return claimRepository.findById(id);
	    }catch(Exception e) {
	    	e.printStackTrace();
	    	throw new ResourceNotFoundException("Not Found","Wrong id",null);
	    }
	   }

	    public Claim createClaim(Claim claim) {
	        return claimRepository.save(claim);
	    }

	    public Claim updateClaim(Long id, Claim claim) {
	        Claim existingClaim = claimRepository.getClaimById(id);
	        existingClaim.setClaimNumber(claim.getClaimNumber());
	        existingClaim.setDescription(claim.getDescription());
	        existingClaim.setClaimDate(claim.getClaimDate());
	        existingClaim.setClaimStatus(claim.getClaimStatus());
	        existingClaim.setInsurancePolicy(claim.getInsurancePolicy());
	        return claimRepository.save(existingClaim);
	    }

	    public void deleteClaim(Long id) {
	        claimRepository.deleteById(id);
	    }
	}

