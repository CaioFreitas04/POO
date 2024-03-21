public abstract class Funcionario implements Imprimivel{
	private String nome;
	private String matricula;
	private double sal_base;

	public Funcionario(String nomein, String matriculain, double sal_basein){
		nome = nomein;
		matricula = matriculain;
		if(sal_basein < 0)
			sal_base = 0;
		else
			sal_base = sal_basein;
	}

	public String getNome() {
		return nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public double getSalBase() {
		return sal_base;
	}

	public void setNome(String in) {
		nome = in;
	}

	public void setMatricula(String in) {
		matricula = in;
	}

	public void setSalBase(double in) {
		sal_base = in;
	}


	//classes abstratas;
	public abstract double calculaSalario();

	//imprímivel;
	public void mostrarDados() {
		System.out.println("NOME: " + getNome() + " MAT: " + getMatricula() + " PAG: " + calculaSalario());
	} 
}
