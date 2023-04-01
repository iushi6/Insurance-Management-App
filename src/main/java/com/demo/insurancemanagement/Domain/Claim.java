package com.demo.insurancemanagement.Domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Claim {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable =false)
	private String claimNumber;
	
	@Column(nullable =false)
	private String description;
	
	@Column(nullable =false)
	private LocalDate claimDate;
	
	@Column(nullable =false)
	private Enum<ClaimStatus> claimStatus;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private InsurancePolicy insurancePolicy;

	
	//Getter and Setter ---->
	public String getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(String claimNumber) {
		this.claimNumber = claimNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(LocalDate claimDate) {
		this.claimDate = claimDate;
	}

	public Enum<ClaimStatus> getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(Enum<ClaimStatus> claimStatus) {
		this.claimStatus = claimStatus;
	}

	//Constructors --->
	public Claim(Long id, String claimNumber, String description, LocalDate claimDate, Enum<ClaimStatus> claimStatus,
			InsurancePolicy insurancePolicy) {
		super();
		Id = id;
		this.claimNumber = claimNumber;
		this.description = description;
		this.claimDate = claimDate;
		this.claimStatus = claimStatus;
		this.insurancePolicy = insurancePolicy;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public InsurancePolicy getInsurancePolicy() {
		return insurancePolicy;
	}

	public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
		this.insurancePolicy = insurancePolicy;
	}

	

}
	

	

