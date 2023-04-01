package com.demo.insurancemanagement.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.insurancemanagement.Domain.Client;
import com.demo.insurancemanagement.Repository.ClientRepository;

	
	public interface ClientService {

	    public List<Client> getAllClients();

	    public Optional<Client> getClientById(Long id) ;

	    public Client createClient(Client client) ;

	    public Client updateClient(Long id, Client client);

	    public void deleteClient(Long id);
	}
