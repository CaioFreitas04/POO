public class Gerente extends Funcionario {
	
	public Gerente(String nomein, String matriculain, double sal_basein) {
		super(nomein, matriculain, sal_basein);
	}

	public double calculaSalario() {
		return 2*getSalBase();
	}
}
