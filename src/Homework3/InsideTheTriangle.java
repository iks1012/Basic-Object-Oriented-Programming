package Homework3;

import java.util.Scanner;

public class InsideTheTriangle {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int x0,x1,x2;
		int y0,y1,y2;
		x0 = 0  ;y0 = 0;
		x1 = 200;y1 = 0;
		x2 = 0  ;y2 = 100;
		String points;
		System.out.print("Enter a point's x- and y-coordinates:");
		points = in.nextLine();
		points = points.trim();
		int spaceMarker = points.indexOf(' ');
		int x = Integer.parseInt(points.substring(0, spaceMarker));
		int y = Integer.parseInt(points.substring(spaceMarker+1, points.length()));	
		double area = 0.5 *(-y1*x2 + y0*(-x1 + x2) + x0*(y1 - y2) + x1*y2);
		double s = 1/(2*area)*(y0*x2 - x0*y2 + (y2 - y0)*x + (x0 - x2)*y);
		double t = 1/(2*area)*(x0*y1 - y0*x1 + (y0 - y1)*x + (x1 - x0)*y);
		boolean one = (s >= 0);
		boolean two = (t >= 0);
		boolean three = (1-s-t >= 0);
		if(one && two && three){
			System.out.print(" The point is in the triangle");
		}
		else{
			System.out.print(" The point is not in the triangle");
		}
	}
}
