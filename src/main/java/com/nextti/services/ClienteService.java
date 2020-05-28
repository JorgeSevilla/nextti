package com.nextti.services;

import java.util.List;

import com.nextti.model.Cliente;

public interface ClienteService {
	
	void saveCliente(Cliente cliente);
	
	void deleteClienteById(Long idCliente);
	
	void updateCliente(Cliente cliente);
	
	List<Cliente> findAllCliente();
	
	Cliente findById(Long idCliente);
	
	Cliente findByName(String nome);
	
}
