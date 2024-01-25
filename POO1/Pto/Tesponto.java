public class Tesponto {
	public static void main (String args[]) {
		
		Ponto p1 = new Ponto();
		Ponto p2 = new Ponto();
		
		p1.setPoint(0, 0);
		p2.setPoint(0, 3);
		
		System.out.println(p1.calcDist(p2));
	}
}