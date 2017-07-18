package WeiHomework;

public class TestMyPoint {
	public static void main(String[] args){
		
		MyPoint m1 = new MyPoint(0.0,0.0);
		MyPoint m2 = new MyPoint(10, 30.5);
		System.out.println("Distance: " + m1.distance(m2));
		
	}
}
