package com.nextti.dao;

import java.util.List;

import com.nextti.model.Produto;

public class ProdutoDaoImpl extends AbstractSession implements ProdutoDao{

	@Override
	public void saveProduto(Produto produto) {
		getSession().persist(produto);
		
	}

	@Override
	public void deleteProdutoById(Long idProduto) {
		Produto produto = findById(idProduto);
		if(produto != null) {
			getSession().delete(produto);
		}
		
	}

	@Override
	public void updateProduto(Produto produto) {
		getSession().update(produto);
		
	}

	@Override
	public List<Produto> findAllProdutos() {
		return getSession().createQuery("from Produto").list();
	}

	@Override
	public Produto findById(Long idProduto) {
		return (Produto) getSession().get(Produto.class, idProduto);
	}

	@Override
	public Produto findBySku(String sku) {
		return (Produto) getSession().createQuery(
				"from Produto where sku = :sku")
				.setParameter("sku", sku).uniqueResult();
	}

}
