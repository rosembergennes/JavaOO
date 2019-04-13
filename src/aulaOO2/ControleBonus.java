package aulaOO2;

public class ControleBonus {
private double TotalBonus=0;

public void setTotalBonus(Funcionario funcionario) {
	this.TotalBonus +=funcionario.getBonus();
}

public double getTotalBonus() {
	return this.TotalBonus;
}
	
}
