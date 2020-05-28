package com.nextti.dao;

import java.util.List;

import com.nextti.model.Pedido;

public interface PedidoDao {
	
	void savePedido(Pedido pedido);
	
	void deletePedidoById(Long idPedido);
	
	void updatePedido(Pedido pedido);
	
	List<Pedido> findAllPedidos();
	
	Pedido findById(Long idPedido);
	
	List<Pedido>findByIdCliente(Long idCliente);
	
	List<Pedido>findByIdProduto(Long idProduto);
}
