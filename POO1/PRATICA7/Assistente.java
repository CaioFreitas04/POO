public class Assistente extends Funcionario {
	
	public Assistente(String nomein, String matriculain, double sal_basein){
		super(nomein, matriculain, sal_basein);
	}

	public double calculaSalario() {
		return getSalBase();
	}
}
