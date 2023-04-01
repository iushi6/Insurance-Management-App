package com.demo.insurancemanagement.Domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
public class InsurancePolicy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	 @Column(nullable = false)
	    private String policyNumber;

	    @Column(nullable = false)
	    private String type;

	    @Column(nullable = false)
	    private Double coverageAmount;

	    @Column(nullable = false)
	    private Double premium;

	    @Column(nullable = false)
	    private LocalDate startDate;

	    @Column(nullable = false)
	    private LocalDate endDate;

	    @ManyToOne(fetch = FetchType.LAZY)
	    private Client client;

	    @OneToMany(mappedBy = "insurancePolicy", cascade = CascadeType.ALL)
	    private List<Claim> claims = new ArrayList<>();

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPolicyNumber() {
			return policyNumber;
		}

		public void setPolicyNumber(String policyNumber) {
			this.policyNumber = policyNumber;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Double getCoverageAmount() {
			return coverageAmount;
		}

		public void setCoverageAmount(Double coverageAmount) {
			this.coverageAmount = coverageAmount;
		}

		public Double getPremium() {
			return premium;
		}

		public void setPremium(Double premium) {
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

		public Client getClient() {
			return client;
		}

		public void setClient(Client client) {
			this.client = client;
		}

		public List<Claim> getClaims() {
			return claims;
		}

		public void setClaims(List<Claim> claims) {
			this.claims = claims;
		}

		public InsurancePolicy(Long id, String policyNumber, String type, Double coverageAmount, Double premium,
				LocalDate startDate, LocalDate endDate, Client client, List<Claim> claims) {
			super();
			this.id = id;
			this.policyNumber = policyNumber;
			this.type = type;
			this.coverageAmount = coverageAmount;
			this.premium = premium;
			this.startDate = startDate;
			this.endDate = endDate;
			this.client = client;
			this.claims = claims;
		}


	
	
	
}
