package com.nextti.dao;

import java.util.List;

import com.nextti.model.Pedido;

public class PedidoDaoImpl extends AbstractSession implements PedidoDao{

	@Override
	public void savePedido(Pedido pedido) {

		getSession().persist(pedido);
		
	}

	@Override
	public void deletePedidoById(Long idPedido) {
		Pedido pedido = findById(idPedido);
		if(pedido != null) {
			getSession().delete(pedido);
		}
	}

	@Override
	public void updatePedido(Pedido pedido) {
		getSession().update(pedido);
	}

	@Override
	public List<Pedido> findAllPedidos() {
		return getSession().createQuery("from Pedido").list();
	}

	@Override
	public Pedido findById(Long idPedido) {
		return  (Pedido) getSession().get(Pedido.class, idPedido);
	}

	@Override
	public List<Pedido> findByIdCliente(Long idCliente) {
		return (List<Pedido>) getSession().createQuery(
				"from Pedido p join p.cliente c where c.idCliente = :idCliente")
				.setParameter("idCliente", idCliente).list();
	}

	@Override
	public List<Pedido> findByIdProduto(Long idProduto) {
		return (List<Pedido>) getSession().createQuery(
				"from Pedido pe join pe.produto pr where pr.idProduto = :idProduto")
				.setParameter("idProduto", idProduto).list();
	}

}
