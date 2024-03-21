public class Vendedor extends Funcionario {

	private double comissao;

	public Vendedor(String nomein, String matriculain, double sal_basein, double comissaoin){
		super(nomein, matriculain, sal_basein);
		if(comissaoin < 0)
			comissao = 0;
		else
			comissao = comissaoin;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double in) {
		comissao = in;
	}

	public double calculaSalario() {
		return getSalBase() + comissao;
	}
}
