package aulaOO2;

public class Conta2 {
	protected  int numero;
	protected String nome;
	protected double saldo;
	protected double limite;

	boolean sacar(double valor) {
		if ((this.saldo+this.limite) < valor) {
			return false;
		} else {
			this.saldo -= valor;
			return true;
		}
	}

	void depositar(double valor) {
		this.saldo += valor;
	}
	
	double getSaldo() {
		return this.saldo;
	}
	
	void correcao(double taxa) {
		this.saldo += this.saldo * taxa;
	}
}