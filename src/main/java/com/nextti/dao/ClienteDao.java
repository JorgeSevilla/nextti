package com.nextti.dao;

import java.util.List;

import com.nextti.model.Cliente;

public interface ClienteDao {
	
	void saveCliente(Cliente cliente);
	
	void deleteClienteById(Long idCliente);
	
	void updateCliente(Cliente cliente);
	
	List<Cliente> findAllClientes();
	
	Cliente findById(Long idCliente);
	
	Cliente findByName(String nome);
	
}
