package Quiz13B;

import java.util.ArrayList;

public class TestGeometricObjects {//polymorphism through interfaces

	public static void main(String[] args) {
		ArrayList<GeometricObject> objs = new ArrayList<GeometricObject>();
		objs.add(new Square(5));
		
		
		for(int i = 0; i < objs.size(); i++){
			System.out.println(objs.get(i).getArea());
			if(objs.get(i) instanceof Colorable)
				((Colorable)objs.get(i)).howToColor();
			
		}
	}

}
