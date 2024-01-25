import java.util.Scanner;


public class Teste {
	public static void main (String args[]) {
		
		Triangulo tri = new Triangulo();
		Scanner scan = new Scanner(System.in);
		int intIn, i, exitFlag = 0;
		double doubleIn;
		
		while(true) {
			
			if(exitFlag == 1) break;
			
			System.out.print("\n\n");
			System.out.println("TRIANGULO ATUAL: a = " + tri.getSide(1) + ", b = " + tri.getSide(2) + ", c = " + tri.getSide(3));
			System.out.println("Selecione uma opcao.");
			System.out.println("1. inserir lados do triangulo.");
			System.out.println("2. checar se eh um triangulo.");
			System.out.println("3. calcular o perimetro do triangulo.");
			System.out.println("4. verificar o tipo do triangulo.");
			System.out.println("Outro. sair!");
			System.out.print("\n>> ");
			
			intIn = scan.nextInt();
			
			switch (intIn) {
				case 1:
					for(i = 0; i < 3; i++) {	//loop para ler todos os lados;
						System.out.println("Insira o " + (i+1) + "o lado.");
						System.out.print(">> ");
						
						doubleIn = scan.nextDouble();
						
						if(!(tri.setSide(i+1, doubleIn))) {
							System.out.println("Lado invalido. Inalterado.");
						}
					}
				break;
				
				case 2:
					if(tri.isTriangle()) {
						System.out.println("Eh um triangulo!");
					}
					else {
						System.out.println("Naum eh um triangulo!");
					}
				break;
				
				case 3:
					System.out.println("O perimetro de seu triangulo eh " + tri.perimeter());
				break;
				
				case 4:
					System.out.print("Seu triangulo eh ");
					switch (tri.triangleType()) {
						case 1:
							System.out.println("equilatero!");
						break;
						
						case 2:
							System.out.println("isosceles!");
						break;
						
						case 3:
							System.out.println("escaleno!");
						break;
						
						case -1:
							System.out.println("INEXISTENTE!");
						break;
					}
				break;
				
				default:
					System.out.println("Encerrando...");
					exitFlag = 1;
				break;
			}
			
			System.out.print("\n\n");
		}
		
	}
}