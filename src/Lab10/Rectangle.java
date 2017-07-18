package Lab10;

public class Rectangle {
	private double width;
	private double length;
	String color = "white";
	public double getWidth() {
		return width;
	}
	public void setWidth(double w) {
		this.width = w;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double l) {
		this.length = l;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String c) {
		this.color = c;
	}
	
	public Rectangle(){
		length = 1;
		width = 1;
	}
	public Rectangle(double l, double w){
		this.length = l;
		this.width = w;
	}
	public double getArea(double l, double w){
		double area = l*w;
		return area;
	}
	public double getPerimeter(double l, double w){
		double perim = 2*l+2*w;
		return perim;
	}
	
}
