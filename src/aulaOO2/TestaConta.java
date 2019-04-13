package aulaOO2;

public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta();
//		Conta c1;
//		c1 = new Conta();
		
		c1.numero = 001;
		c1.nome = "Joao";
		c1.saldo = 100.0;
		c1.limite = 10.0;
		
		System.out.println("Numero da conta: "+c1.numero);
		System.out.println("Titular: "+c1.nome);
		System.out.println("Saldo atual: "+c1.saldo);
		System.out.println("Limite: "+c1.limite);
		
		int saque = 1100;
		
		boolean resultado = c1.sacar(saque);
		
		if (resultado) {
			System.out.println("Voce sacou R$"+saque+" e seu saldo atual eh R$"+c1.saldo);
		} else {
			System.out.println("Saque nao efetuado, valor acima do possivel");
		}
		
//		c1.sacar(10000);
//		System.out.println("Saldo atual: "+c1.saldo);
//		
//		c1.depositar(1000);
//		System.out.println("Saldo atual: "+c1.saldo);
		
	}

}
