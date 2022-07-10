package oops_concept;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Bro";
		int age = 21;
		
		int a = 12;
		int b = 1111111;
		
		int sum = add(a,b);
		
		System.out.println("the sum is "+sum);
		
		hello(name, age);
		
	}
	
	static void hello(String name, int age) {
		System.out.println("Hello "+ name);
		System.out.println("you are "+age+" years old");
	}

	
	static int add(int x, int y) {
		int sum = x =y;
		return sum;
	}

}
