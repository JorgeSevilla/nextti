package com.nextti.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nextti.dao.ProdutoDao;
import com.nextti.model.Produto;

public class ProdutoServiceImpl implements ProdutoService{
	
	@Autowired
	private ProdutoDao _produtoDao;

	@Override
	public void saveProduto(Produto produto) {
		_produtoDao.saveProduto(produto);
		
	}

	@Override
	public void deleteProdutoById(Long idProduto) {
		_produtoDao.deleteProdutoById(idProduto);
		
	}

	@Override
	public void updateCProduto(Produto produto) {
		_produtoDao.updateProduto(produto);
		
	}

	@Override
	public List<Produto> findAllProduto() {
		
		return _produtoDao.findAllProdutos();
	}

	@Override
	public Produto findById(Long idProduto) {
		return _produtoDao.findById(idProduto);
	}

	@Override
	public Produto findBySku(String sku) {
		return _produtoDao.findBySku(sku);
	}
	
	

}
