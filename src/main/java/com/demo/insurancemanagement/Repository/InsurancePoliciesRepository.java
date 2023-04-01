package com.demo.insurancemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.insurancemanagement.Domain.InsurancePolicy;

@Repository
public interface InsurancePoliciesRepository extends JpaRepository<InsurancePolicy, Long> {

}
