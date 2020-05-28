package com.nextti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nextti.dao.PedidoDao;
import com.nextti.model.Pedido;

public class PedidoServiceImpl implements PedidoService{
	
	@Autowired
	private PedidoDao _pedidoDao;

	@Override
	public void savePedido(Pedido pedido) {
		_pedidoDao.savePedido(pedido);
		
	}

	@Override
	public void deletePedidoById(Long idPedido) {
		_pedidoDao.deletePedidoById(idPedido);
		
	}

	@Override
	public void updatePedido(Pedido pedido) {
		_pedidoDao.updatePedido(pedido);
		
	}

	@Override
	public List<Pedido> findAllPedidos() {
		return _pedidoDao.findAllPedidos();
	}

	@Override
	public Pedido findById(Long idPedido) {
		return _pedidoDao.findById(idPedido);
	}

	@Override
	public List<Pedido> findByIdCliente(Long idCliente) {
		return _pedidoDao.findByIdCliente(idCliente);
	}

	@Override
	public List<Pedido> findByIdProduto(Long idProduto) {
		return _pedidoDao.findByIdProduto(idProduto);
	}

}
