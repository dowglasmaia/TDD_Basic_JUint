package org.maia;

import org.assertj.core.api.Assertions;
import org.junit.Ignore;
import org.junit.Test;
import org.maia.exceptions.PessoaInexistentException;
import org.maia.exceptions.PessoaSemNomeException;

public class CadastroPessoaTests {
	
	@Test
	//@Ignore
	public void deveCriarCadastroDePessoa() {
		//cenario e execução 
		CadastroPessoa cadastro = new CadastroPessoa();
		
		//verificação
		Assertions.assertThat(cadastro.getPessoa()).isEmpty();		
	}
	
	@Test
	//@Ignore
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
	
	@Test(expected = PessoaSemNomeException.class)
	public void  naoDeveAdicioinarPessoaComNomeVazio() {
		//cenario
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		Pessoa pessoa = new Pessoa();
		
		//execução
		cadastroPessoa.adicionar(pessoa);		
	}
	
	@Test
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
	
	@Test(expected = PessoaInexistentException.class)
	public void  deveLancarErrorAoTentarRemoverPessoaInexistente() {
		//cenario	
		CadastroPessoa cadastroPessoa = new CadastroPessoa();
		Pessoa pessoa = new Pessoa();
		
		//execução
		cadastroPessoa.remover(pessoa);	
	}
	

}
