import java.util.ArrayList;

public class ForEachLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] animals = {"cat", "dog", "rat", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("rat");
		animals.add("cat");
		animals.add("dog");
		animals.add("bird");
		
		for(String i: animals) {
			System.out.println(i);
		}
	}

}
