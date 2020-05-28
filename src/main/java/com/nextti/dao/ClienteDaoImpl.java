package com.nextti.dao;

import java.util.List;

import com.nextti.model.Cliente;

public class ClienteDaoImpl extends AbstractSession implements ClienteDao{

	@Override
	public void saveCliente(Cliente cliente) {
		getSession().persist(cliente);
	}

	@Override
	public void deleteClienteById(Long idCliente) {
		
		Cliente cliente = findById(idCliente);
		if(cliente != null) {
			getSession().delete(cliente);
		}
	}

	@Override
	public void updateCliente(Cliente cliente) {
		getSession().update(cliente);
	}

	@Override
	public List<Cliente> findAllClientes() {
		return getSession().createQuery("from Cliente").list();
	}

	@Override
	public Cliente findById(Long idCliente) {
		return (Cliente) getSession().get(Cliente.class, idCliente);
	}

	@Override
	public Cliente findByName(String nome) {
		return (Cliente) getSession().createQuery(
				"from Cliente where nome = :nome");
	}

}
