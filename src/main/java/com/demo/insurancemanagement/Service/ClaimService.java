package com.demo.insurancemanagement.Service;

import java.util.List;
import java.util.Optional;

import com.demo.insurancemanagement.Domain.Claim;


public interface ClaimService {
	
    public List<Claim> getAllClaims();
    
    public Optional<Claim> getClaimById(Long id);
    
    public Claim createClaim(Claim claim);

    public Claim updateClaim(Long id, Claim claim);

    public void deleteClaim(Long id);
    
}

