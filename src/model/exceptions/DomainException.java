package model.exceptions;

//quando uma classe é exceção coloca o sufixo Exception

public class DomainException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) { //podemos instanciar a exceção personalizada, passando uma mensagem pra ela. esta mensagem vai ficar armazenada dentro da exceção
		super(msg);
	}
	

}
