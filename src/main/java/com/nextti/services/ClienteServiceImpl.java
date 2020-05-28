package com.nextti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nextti.dao.ClienteDao;
import com.nextti.model.Cliente;

public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDao _clienteDao;

	@Override
	public void saveCliente(Cliente cliente) {
		_clienteDao.saveCliente(cliente);
		
	}

	@Override
	public void deleteClienteById(Long idCliente) {
		_clienteDao.deleteClienteById(idCliente);
		
	}

	@Override
	public void updateCliente(Cliente cliente) {
		_clienteDao.updateCliente(cliente);
		
	}

	@Override
	public List<Cliente> findAllCliente() {
		return _clienteDao.findAllClientes();
	}

	@Override
	public Cliente findById(Long idCliente) {
		return _clienteDao.findById(idCliente);
	}

	@Override
	public Cliente findByName(String nome) {
		return _clienteDao.findByName(nome);
	}

}
