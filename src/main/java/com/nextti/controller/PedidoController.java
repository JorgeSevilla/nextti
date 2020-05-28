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

import com.nextti.model.Pedido;
import com.nextti.services.PedidoService;

@CrossOrigin(origins = "https://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"pedido"})
public class PedidoController {
	
	@Autowired
	PedidoService pedidoService;
	
	@GetMapping
	public List<Pedido> findAllPedido(){
		return pedidoService.findAllPedidos();
	}
	
	@PostMapping
	public void adicionarCliente(@RequestBody Pedido pedido) {
		pedidoService.savePedido(pedido);
	}
	
	@GetMapping(path = {"/{idProduto}"})
	public Pedido findById(@PathVariable("idProduto") Long idProduto) {
		return pedidoService.findById(idProduto);
	}
	
	@PutMapping(path = {"/{idProduto}"})
	public void updatePedido(@RequestBody Pedido pedido, @PathVariable("idProduto")Long idProduto){
		pedido.setIdPedido(idProduto); 
		pedidoService.updatePedido(pedido);
	}
	
	@DeleteMapping(path = {"/{idProduto}"})
	public void deletePedidoById(@PathVariable("idProduto")Long idProduto) {
		pedidoService.deletePedidoById(idProduto);
	}

	
	

}
