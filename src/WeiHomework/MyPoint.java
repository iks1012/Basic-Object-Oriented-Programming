package WeiHomework;
public class MyPoint {
	private double x;
	private double y;
	public MyPoint(){
		x=0;
		y=0;
	}
	public MyPoint(double x1, double y1){
		x=x1;
		y=y1;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double distance(MyPoint mP){
		double dx = x-mP.getX();
		double dy = y-mP.getY();
		
		double distance = Math.sqrt(dx*dx+dy*dy);
		
		
		return distance;
	}
	public double distance(double x1, double y1){
		double dx = x-x1;
		double dy = y-y1;
		
		double distance = Math.sqrt(dx*dx+dy*dy);
		
		
		return distance;
	}
}
