package org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class HelloWorldController {
	
	@GetMapping ("/hello")
	public String hello () {
		return "Olá, mundo!";
	}
		
		@GetMapping("/bsm")
		public String bsm () {
			return "BSM's da Generation Brasil:"
					+ "\nIntrodução às Habilidades Comportamentais e Mentalidades"
					+ "\nMentalidade de Crescimento"
					+ "\nPersistência"
					+ "\nResponsabilidade Pessoal"
					+ "\nOrientação ao Futuro"
					+ "\nComunicação"
					+ "\nOrientação ao Detalhe"
					+ "\nProatividade"
					+ "\nTrabalho em Equipe"
					+ "\nDar e Receber"
					+ "\nEstudo de Caso 1: Força de Trabalho Distribuida"
					+ "\nEstudo de Caso 2: Estregável Urgente"
					+ "\nEstudo de Caso 3: Novas Habilidades Necessárias"
					+ "\nEstudo de Caso 4: Aprender e Compartilhar"
					+ "\nGestão de tempo"
					+ "\nMaximizar a Aprendizagem Online e o Trabalho Remoto";
					 }
		
		@GetMapping("/apr_sem")
		public String aprendizado () {
			return "Objetivos de Aprendizado dessa semana:"
					+ "\n-Conferir Planejamento de Sessões - BSM"
					+ "\n- Spring Boot e suas ferramentas"
					+ "\nBlog Pessoal, Projeto Integrador";
		}


}
