import java.lang.Math;


public class Ponto {
	
	private double x = 0, y = 0;
	
	public void setPoint(int xin, int yin) {
		
		if(xin < 0) xin = 0;
		if(yin < 0) yin = 0;
		
		x = xin;
		y = yin;
	}
	
	public double calcDist(Ponto p2) {
		double dx = this.x - p2.x;
		double dy = this.y - p2.y;
		
		return Math.sqrt((dx * dx) + (dy * dy));
	}
}