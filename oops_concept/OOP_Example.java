package oops_concept;

public class OOP_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// constructors help create objects with different attributes 
		//object is an instance of a class that may contain attributes and methods
		
		Human human1 = new Human("Rick", 65, 70);
		Human human2 = new Human("Morty", 16, 50);
		
		
		//System.out.println(human1.name);

		human2.eat();
		human1.drink();
	}

}
