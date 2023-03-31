package com.demo.insurancemanagement.Domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "policies",schema = "insuranceSystem")
public class InsurancePolicies {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "policyId")
    private Long id;
	
	@Column(name = "policyType")
	private String policyType;
	
	@Column(name = "coverageAMT")
	private Long coverageAmount;
	
	@Column(name = "premium")
	private Long premium;
	
	@Column(name= "startDate")
	private LocalDate startDate;
	
	@Column(name = "endDate")
	private LocalDate endDate;

	//Getters and Setters --- >
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPolicyType() {
		return policyType;
	}

	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}

	public Long getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(Long coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public Long getPremium() {
		return premium;
	}

	public void setPremium(Long premium) {
		this.premium = premium;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	

	
	
}
