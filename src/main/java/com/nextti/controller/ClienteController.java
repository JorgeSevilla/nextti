package com.nextti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nextti.model.Cliente;
import com.nextti.services.ClienteService;

@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"cliente"})
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> findAllCliente(){
		return clienteService.findAllCliente();
	}
	
	@PostMapping
	public void adicionarCliente(@RequestBody Cliente cliente) {
		 clienteService.saveCliente(cliente);
	}
	
	@GetMapping(path = {"/{idCliente}"})
	public Cliente findById(@PathVariable("idCliente") Long idCliente) {
		return clienteService.findById(idCliente);
	}
	
	@PutMapping(path = {"/{idCliente}"})
	public void updateCliente(@RequestBody Cliente cliente, @PathVariable("idCliente")Long idCliente){
		cliente.setIdCliente(idCliente); 
		clienteService.updateCliente(cliente);
	}
	
	@DeleteMapping(path = {"/{idCliente}"})
	public void deleteClienteById(@PathVariable("idCliente")Long idCliente) {
		clienteService.deleteClienteById(idCliente);
	}

}
