package com.demo.insurancemanagement.Domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
public class Client {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String contactInformation;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<InsurancePolicy> insurancePolicies = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContactInformation() {
		return contactInformation;
	}

	public void setContactInformation(String contactInformation) {
		this.contactInformation = contactInformation;
	}

	public List<InsurancePolicy> getInsurancePolicies() {
		return insurancePolicies;
	}

	public void setInsurancePolicies(List<InsurancePolicy> insurancePolicies) {
		this.insurancePolicies = insurancePolicies;
	}

	public Client(Long id, String name, LocalDate dateOfBirth, String address, String contactInformation,
			List<InsurancePolicy> insurancePolicies) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.contactInformation = contactInformation;
		this.insurancePolicies = insurancePolicies;
	}
	public Client() {
		
	}
    
	
}
