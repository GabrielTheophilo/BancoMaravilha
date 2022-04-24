package br.com.residencia.poo.exceptions;

public class OperacaoNaoAutorizadaException extends Exception {

	private static final long serialVersionUID = 1L;

	public OperacaoNaoAutorizadaException() {
		super("Erro na opera��o. Revise seus dados e tente novamente.");
	}

	public OperacaoNaoAutorizadaException(String mensagem) {
		super(mensagem);
	}
}
