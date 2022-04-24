package br.com.residencia.poo.exceptions;

public class CpfInvalidoException extends Exception {

	private static final long serialVersionUID = 1L;

	public CpfInvalidoException() {
		super("N�mero de CPF inv�lido!");
	}

	public CpfInvalidoException(String message) {
		super(message);
	}
}
