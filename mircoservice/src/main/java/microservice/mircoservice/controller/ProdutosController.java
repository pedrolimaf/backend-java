package microservice.mircoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import microservice.mircoservice.model.Produtos;
import microservice.mircoservice.respository.ProdutosRepository;


@RestController
@RequestMapping("/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutosRepository produtosRepository;
	
	@GetMapping
	public List<Produtos> listarProdutos() {
		return produtosRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Produtos adicionarProdutos(@RequestBody Produtos produtos) {
		return produtosRepository.save(produtos);
	}
}
