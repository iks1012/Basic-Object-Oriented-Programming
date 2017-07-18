package Quiz13B;

public class Square extends GeometricObject implements Colorable, 
Comparable<Square>, Cloneable {//need to include all the methods from interface..., can be split 
	protected double sidelength;
	
	public Square(double sidelength){
		this.sidelength = sidelength;
	}
	public Square(){
		this(0); // sends the value of 0 to another constructor;
	}
	
	
	@Override
	public double getArea(){
		return Math.pow(sidelength,2);
	}
	
	@Override
	public double getPerimeter(){
		return 4*sidelength;
		
	}
	
	@Override
	public void howToColor(){
		System.out.println("fill it in");
	}
	
	@Override
	public int compareTo(Square other){
		if(getArea() > other.getArea()){
			return 1;
		}
		else if(getArea() < other.getArea()){
			return -1;
		}
		else{
			return 0;
		}
		
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}












