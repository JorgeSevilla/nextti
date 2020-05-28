package com.nextti.services;

import java.util.List;

import com.nextti.model.Produto;

public interface ProdutoService {
	
	void saveProduto(Produto produto);
	
	void deleteProdutoById(Long idProduto);
	
	void updateCProduto(Produto produto);
	
	List<Produto> findAllProduto();
	
	Produto findById(Long idProduto);
	
	Produto findBySku(String sku);

}
