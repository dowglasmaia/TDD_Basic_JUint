package org.maia.exceptions;

public class PessoaSemNomeException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public PessoaSemNomeException(String msg) {
		super(msg);
	}

}
