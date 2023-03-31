package com.demo.insurancemanagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.insurancemanagement.Domain.ClientDomain;

@Repository
public interface ClientRepository extends JpaRepository<ClientDomain,Long>{

}
