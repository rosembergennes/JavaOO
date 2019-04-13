package aulaOO2;

public class TestaHeranca {
 public static void main(String[] args) {
	 Funcionario f1= new Funcionario();
	 f1.setSalario(1000);
	 double salFunc=f1.getSalario();
	 System.out.println("Salario do funcioanrio : "+salFunc);
	 System.out.println("Bonus do funcioanrio : "+f1.getBonus());
	 
	 
	 DBA d1= new DBA();
	 d1.setSalario(1000);
	 double salFunc2 =d1.getSalario();
	 d1.setNome("Loucoi");
	// d1.getBonus
	 System.out.println("Salario do funcioanrio : "+salFunc2);
	 System.out.println("Bonus do funcioanrio : "+d1.getBonus());
	 System.out.println("Nome do funcioanrio : "+d1.getNome());
	 
	 
 }
}
