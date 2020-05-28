package com.nextti.services;

import java.util.List;

import com.nextti.model.Pedido;

public interface PedidoService {
	
	void savePedido(Pedido pedido);
	
	void deletePedidoById(Long idPedido);
	
	void updatePedido(Pedido pedido);
	
	List<Pedido> findAllPedidos();
	
	Pedido findById(Long idPedido);
	
	
	List<Pedido> findByIdCliente(Long idCliente);
	
	List<Pedido> findByIdProduto(Long idProduto);

}
