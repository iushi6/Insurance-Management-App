package com.demo.insurancemanagement.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.insurancemanagement.Domain.Client;
import com.demo.insurancemanagement.Repository.ClientRepository;
import com.demo.insurancemanagement.Service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	public ClientRepository clientRepository;
	
	@Override
	public List<Client> getAllClients() {
		 return clientRepository.findAll();
	}

	@Override
	public Optional<Client> getClientById(Long id) {
		try {
		 return clientRepository.findById(id);
	}catch(Exception e) {
		e.printStackTrace();
		throw new ResourceNotFoundException("Not Found","not found",null);
	  }
	}

	@Override
	public Client createClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client updateClient(Long id, Client client) {
		client.setId(id);
        return clientRepository.save(client);
	}

	@Override
	public void deleteClient(Long id) {
		 clientRepository.deleteById(id);
		
	}

}
