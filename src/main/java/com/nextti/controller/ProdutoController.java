package com.nextti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nextti.model.Produto;
import com.nextti.services.ProdutoService;

@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"produto"})
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> findAllProduto(){
		return produtoService.findAllProduto();
	}
	
	@PostMapping
	public void adicionarProduto(@RequestBody Produto produto) {
		produtoService.saveProduto(produto);
	}
	
	@GetMapping(path = {"/{idProduto}"})
	public Produto findById(@PathVariable("idProduto") Long idProduto) {
		return produtoService.findById(idProduto);
	}
	
	@PutMapping(path = {"/{idProduto}"})
	public void updateProduto(@RequestBody Produto produto, @PathVariable("idProduto")Long idProduto){
		produto.setIdProduto(idProduto); 
		produtoService.updateCProduto(produto);
	}
	
	@DeleteMapping(path = {"/{idProduto}"})
	public void deleteClienteById(@PathVariable("idProduto")Long idProduto) {
		produtoService.deleteProdutoById(idProduto);
	}
}
