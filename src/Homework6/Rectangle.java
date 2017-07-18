package Homework6;

import java.util.Scanner;
public class Rectangle{
	private double width;
	private double height;
	public Rectangle(){
		width = 1;
		height = 1;
	}
	public Rectangle(double w, double h){
		this.width = w;
		this.height = h;
	}
	public double getArea(){
		return height*width;
	}
	public double getPerimter(){
		return 2*height + 2*width;
	}
}
/*
public class test{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double width = 4.0;
		double height = 40.0;
		Rectangle reKt = new Rectangle(width, height);
		System.out.println("The area of  a "+width+" x "+height+" Rectangle is "+reKt.getArea());
		System.out.println("The perimeter of a "+width+" x "+height+" Rectangle is "+reKt.getPerimeter());
		width = 3.5;
		height = 35.9;
		reKt = new Rectangle(width, height);
		System.out.println("The area of  a "+width+" x "+height+" Rectangle is "+reKt.getArea());
		System.out.println("The perimeter of a "+width+" x "+height+" Rectangle is "+reKt.getPerimeter());
	}
}
*/