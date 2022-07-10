import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
		
		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList<String>();
		drinksList.add("soda");
		drinksList.add("coffee");
		
		groceryList.add(drinksList);

		groceryList.add(produceList);

		groceryList.add(bakeryList);
		
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(0, "sushi");
		
		food.remove(2);
		food.clear();
		
		System.out.println(groceryList.get(2).get(1));
		
		for(int i=0; i<food.size(); i++) {
			System.out.println(food.get(i));
		}
	}

}
