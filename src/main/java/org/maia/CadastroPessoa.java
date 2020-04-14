package org.maia;

import java.util.ArrayList;
import java.util.List;

import org.maia.exceptions.PessoaInexistentException;
import org.maia.exceptions.PessoaSemNomeException;

public class CadastroPessoa {

	private List<Pessoa>pessoas = new ArrayList<>();
	
	public List<Pessoa> getPessoa() {		
		return this.pessoas;
	}

	public void adicionar(Pessoa pessoa) {
		if(pessoa.getNome() == null) {
			throw new PessoaSemNomeException("Não pode Cadastra uma Pessoa com nome Vazio, refaça a operação com os dados da Pessoa.");
		}
		this.pessoas.add(pessoa);
		
	}

	public void remover(Pessoa pessoa) {
		if(this.pessoas.isEmpty()) {
			throw new PessoaInexistentException("Nenhum Pessoa Cadastrada no Sistema.");
		}
		
		//this.pessoas.removeAll(pessoas);		
		this.pessoas.remove(pessoa);		
	}

}
