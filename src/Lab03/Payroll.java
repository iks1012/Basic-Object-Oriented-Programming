package Lab03;

import java.util.Scanner;

public class Payroll {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String name;
		double hours, hourlyPay, fedTax, stateTax;
		System.out.print("Name: ");
		name = in.nextLine();
		System.out.print("Hours: ");
		hours = in.nextDouble();
		System.out.print("Hourly Pay: ");
		hourlyPay = in.nextDouble();
		System.out.print("Federal Tax percentage: %");
		fedTax = in.nextDouble() ;
		System.out.print("State Tax percentage: %");
		stateTax = in.nextDouble();
		System.out.println("Name: " + name);
		System.out.println("Hours worked: "+ hours);
		System.out.println("Hourly Pay: "+ hourlyPay);
		System.out.println("Federal Tax rate: %"+ fedTax);
		System.out.println("State Tax rate: %" + stateTax);
		System.out.println("Final Pay Amount: " + ((hours*hourlyPay)*(1 -((fedTax/100)+(stateTax/100)))));
		
	}

}
