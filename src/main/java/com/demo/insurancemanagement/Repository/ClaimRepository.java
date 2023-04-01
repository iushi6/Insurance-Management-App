package com.demo.insurancemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.insurancemanagement.Domain.Claim;

public interface ClaimRepository extends JpaRepository<Claim,Long> {

	Claim getClaimById(Long id);

}
