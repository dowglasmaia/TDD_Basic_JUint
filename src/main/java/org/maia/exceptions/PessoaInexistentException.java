package org.maia.exceptions;

public class PessoaInexistentException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PessoaInexistentException(String msg) {
		super(msg);
	}

}
