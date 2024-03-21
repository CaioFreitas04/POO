public class Teste {
	public static void main(String args[]) {
		
		Funcionario funcvet[] = new Funcionario[5];
		double total = 0;

		funcvet[0] = new Gerente("Bourgeois", "1234", 3000);
		funcvet[1] = new Assistente("Carlos", "0032", 1500);
		funcvet[2] = new Assistente("Judas Tadeu Zacarias Iscariotes", "0667", 2000);
		funcvet[3] = new Vendedor("Cleberson", "7892", 2000, 350);
		funcvet[4] = new Vendedor("Seu Juquinha", "1221", 2100, 350);

		for(int i = 0; i < funcvet.length; i++) {
			System.out.print(i+1 + ". ");
			funcvet[i].mostrarDados();
			
			total += funcvet[i].calculaSalario();
		}

		System.out.println("\nTOTAL A PAGAR: " + total);

	}
}
