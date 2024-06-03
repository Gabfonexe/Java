package Aulas.ClassesAbstratas;

public abstract class ClassesAbstratasConta {
  
  private Integer numero;
	private String titular;
	protected Double saldo;
		
	public ClassesAbstratasConta() {
	}
	
	public ClassesAbstratasConta(Integer numero, String titular, Double saldo) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getnumero() {
		return numero;
	}

	public void setnumero(Integer numero) {
		this.numero = numero;
	}

	public String gettitular() {
		return titular;
	}

	public void settitular(String titular) {
		this.titular = titular;
	}

	public Double getsaldo() {
		return saldo;
	}

	public void saque(double quantia) {
		saldo -= quantia + 5.0;
	}

	public void deposito(double quantia) {
		saldo += quantia;
	}

}
