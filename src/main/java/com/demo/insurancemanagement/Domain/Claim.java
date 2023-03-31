package com.demo.insurancemanagement.Domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "claim",schema = "insuranceSystem")
public class Claim {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name ="claimNumber")
	private Long claimNumber;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "claimDate")
	private LocalDate claimDate;
	
	@Column(name="claimStatus")
	private LocalDate claimStatus;

	
	//Getter and Setter ---->
	public Long getClaimNumber() {
		return claimNumber;
	}

	public void setClaimNumber(Long claimNumber) {
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

	public LocalDate getClaimStatus() {
		return claimStatus;
	}

	public void setClaimStatus(LocalDate claimStatus) {
		this.claimStatus = claimStatus;
	}
	
	
}
