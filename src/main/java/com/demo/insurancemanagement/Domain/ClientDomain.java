package com.demo.insurancemanagement.Domain;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "client_user", schema = "insuranceSystem")
public class ClientDomain {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "DOB")
	private LocalDate dateofBirth;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone")
	private String phoneNumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "gender")
	private String gender;
	
//	@OneToMany(mappedBy = "client")
//	private List<InsurancePolicy> insurancePolicies;
	
}
