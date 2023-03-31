package com.demo.insurancemanagement.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.insurancemanagement.Domain.Client;
import com.demo.insurancemanagement.Repository.ClientRepository;

@RestController
@RequestMapping("/api/clients")
public class ClientController {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping
	public List<Client>getAllClients(){
		return clientRepository.findAll();		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable Long id){
		Optional<Client> oClient = clientRepository.findById(id);
		
		if(oClient.isPresent()) {
			return ResponseEntity.ok(oClient.get());
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@PostMapping
	public Client createClient(@RequestBody Client client) {
		return clientRepository.save(client);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client updatedClient){
		Optional<Client> optionalClient = clientRepository.findById(id);
		if(optionalClient.isPresent()) {
			Client client = optionalClient.get();
			client.setName(updatedClient.getName());
			client.setDateofBirth(updatedClient.getDateofBirth());
			client.setAddress(updatedClient.getAddress());
			client.setCity(updatedClient.getCity());
			client.setGender(updatedClient.getGender());
			client.setPhoneNumber(updatedClient.getPhoneNumber());
			return ResponseEntity.ok(clientRepository.save(client));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteClient(@PathVariable Long id){
		Optional<Client> optionalClient = clientRepository.findById(id);
		if(optionalClient.isPresent()) {
			clientRepository.deleteById(id);
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	
	

}
