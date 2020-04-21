package org.maia;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.maia.exceptions.PessoaInexistentException;
import org.maia.exceptions.PessoaSemNomeException;

public class CadastroPessoaTests {
	
	@Test
	@DisplayName("Deve criar o Cadastro de Pessoa")
	public void deveCriarCadastroDePessoa() {
		//cenario e execução 
		CadastroPessoa cadastro = new CadastroPessoa();
		
		//verificação
		Assertions.assertThat(cadastro.getPessoa()).isEmpty();		
	}
	
	@Test
	@DisplayName("Deve adicionar o Cadastro de Pessoa")
	public void deveAdicionarUmaPessoa() {
		//cenario
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("Dowglas Maia");
		pessoa.setEmail("dowglasmaia@live.com");

		//execução
		cadastroPessoa.adicionar(pessoa);
		
		//verificação
		Assertions.assertThat(cadastroPessoa.getPessoa())
		.isNotEmpty()
		.hasSize(1)
		.contains(pessoa);		
	}
	
	@DisplayName("Não deve adicionar uma Pessoa com nome vazio")
	@Test
	public void  naoDeveAdicioinarPessoaComNomeVazio() {
		//cenario
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		Pessoa pessoa = new Pessoa();
		
		//execução
		org.junit.jupiter.api.Assertions
				.assertThrows(PessoaSemNomeException.class, ()-> cadastroPessoa.adicionar(pessoa)) ;
	}
	
	@Test
	@DisplayName("Deve criar o Cadastro de Pessoa")
	public void deveRemoverUmaPessoa() {
		//cenario
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		Pessoa pessoa = new Pessoa();
		pessoa.setId(1);
		pessoa.setNome("Dowglas Maia");
		pessoa.setEmail("dowglasmaia@live.com");
		cadastroPessoa.adicionar(pessoa);
		
		//execução
		cadastroPessoa.remover(pessoa);
		
		//verificação
		Assertions.assertThat(cadastroPessoa.getPessoa()).isEmpty();
	}

	
	@Test
	@DisplayName("Deve lançar um error ao tentar remover um cadastro não existente")
	public void  deveLancarErrorAoTentarRemoverPessoaInexistente() {
		//cenario	
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		Pessoa pessoa = new Pessoa();

		//execução
		org.junit.jupiter.api.Assertions
				.assertThrows(PessoaInexistentException.class, () -> cadastroPessoa.remover(pessoa));
	}


}
