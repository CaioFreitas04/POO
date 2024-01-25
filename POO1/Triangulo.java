public class Triangulo {
	
	private double l1, l2, l3;
	
	public boolean setSide (int side, double val) {
		
		if(val <= 0) return false;
		
		switch (side){
			case 1:
				l1 = val;
				return true;
			break;
			
			case 2:
				l2 = val;
				return true;
			break;
			
			case 3:
				l3 = val;
				return true;
			break;
			
			default:
				return false;
			break;
		}
	}
	
	public double getSide (int side) {
		
		switch (side) {
			case 1:
				return l1;
			break;
			
			case 2:
				return l2;
			break;
		
			case 3:
				return l3;
			break;
			
			default:
				return -1;
			break;
		}
	}
	
	public boolean isTriangle () {
		if ( l1 + l2 > l3 || l1 + l3 > l2 || l2 + l3 > l1) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	public double perimeter () {
		return l1 + l2 + l3;
	}
	
	public int triangleType () {
		
		// códigos de retorno da função:
		//		1: equilátero;
		//		2: isósceles;
		//		3: escaleno;
		//		-1: não é triângulo;
		
		if (!(isTriangle())) {
			return -1;
		}
		
		if (l1 == l2 && l2 == l3) {
			return 1;
		}
		else if (l1 == l2 || l1 == l3 || l2 == l3) {
			return 2;
		}
		
		else {
			return 3;
		}
	}
}
