package br.com.consultarEndereco.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/endereco")
public class Endereco {
	
	@GetMapping("/versao")
	public String revision() {
		return "1.0";
	}
	
	@GetMapping()
	public String endereco() {
		return "EndPoint Consultar Endereço";
	}
	

}
