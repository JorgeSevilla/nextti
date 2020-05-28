package com.nextti.dao;

import java.util.List;

import com.nextti.model.Produto;

public interface ProdutoDao {
	
	void saveProduto(Produto produto);
	
	void deleteProdutoById(Long idProduto);
	
	void updateProduto(Produto produto);
	
	List<Produto> findAllProdutos();
	
	Produto findById(Long idProduto);
	
	Produto findBySku(String sku);

}
