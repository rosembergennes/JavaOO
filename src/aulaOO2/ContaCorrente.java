package aulaOO2;

public class ContaCorrente extends Conta2{

	void correcao(double taxa) {
		this.saldo += this.saldo * 1.2;
	}
	
}
