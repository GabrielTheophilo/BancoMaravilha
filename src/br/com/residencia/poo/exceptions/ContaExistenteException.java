package br.com.residencia.poo.exceptions;

public class ContaExistenteException extends Exception {

	private static final long serialVersionUID = 1L;
	/* linha acima gerada automaticamente pelo java, para controle de vers�o da
	 * classe Exception criada.*/

	public ContaExistenteException() {
		super("Este titular j� possui uma conta cadastrada no sistema!");
	}

	/* CONSTRUTOR PARA PERSONALIZAR O getMessage() */
	public ContaExistenteException(String mensagem) {
		super(mensagem);
	}
}