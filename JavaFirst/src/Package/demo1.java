package Package;

import java.util.Scanner;

public class demo1 implements Interface {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int divide(int a, int b) throws ArithmeticException {
		// TODO Auto-generated method stub
		return a/b;
	}

	public static void main(String[] args){
		demo1 obj= new demo1();
		int a,b,c;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter numbers: ");
		a=input.nextInt();
		b=input.nextInt();
		System.out.println("Enter choice ");
		c=input.nextInt();
		switch(c){
		case 1:
			System.out.println(obj.add(a, b));
			break;
		case 2:
			System.out.println(obj.subtract(a, b));
			break;
		case 3:
			System.out.println(obj.multiply(a, b));
			break;
		case 4:
			try{
			System.out.println(obj.divide(a, b));
			}catch(ArithmeticException e){
				System.out.println("cant divide by zero");	
			}
			
			break;
		default:
			System.out.println("Incorrect");
		}
	}
}
