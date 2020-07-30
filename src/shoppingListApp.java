import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class shoppingListApp {

	
	private static Map<String, Double> items= new TreeMap<>();
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		boolean yesNo;
		//Display a list of at least 8 item names and prices.
		fillMapItems();
		printMenu(); 
				
		while( yesNo= true){
		// Ask the user to enter an item name
		System.out.println("What item would you like to order? Choose an item from the list.");
		ArrayList<String> orderedItems= new ArrayList<>();
		ArrayList<Double> cost= new ArrayList<>();
		String userChoice = scnr.nextLine();
		
		try { orderedItems.add(userChoice); 
		
		}catch (Exception v) { 
			 System.out.println("Please enter vaild choice.");
		}
		// display that item and price and add that item and its price to
		//the user’s order.
		//If that item doesn’t exist, display an error and re-prompt the user. 
		//Display the menu again if you’d like.)
		if (items.get(userChoice) == null) {
			System.out.println("Error. Please enter again");
			fillMapItems();
			printMenu();
		} else if (items.get(userChoice) != null){
			 cost.add(items.values(userChoice);
			System.out.println(" Adding " + userChoice + " at cost "+ items.get(userChoice));
			 orderedItems.add(userChoice);// not storing
	        }
		} //Ask if they want to add another. Repeat if they do.
		System.out.println(" Would you like anything else? y/n ");
		        getYesNo(scnr, "enter order");
		
	}
	  //When they’re done adding items, display a list of all items ordered with prices in
	   // System.out.println(" Your order is " + orderedItems)
		
		
		//Display the average price of items ordered.
	

	
	//map items
	private static void fillMapItems() {
		
		items.put("Apple", .99);
		items.put("Banana", .59);
        items.put("Cauliflower", 1.59);
	    items.put("Dragonfruit", 2.19);
	    items.put("Elderberry", 1.79);
	    items.put("Figs", 2.09);
	    items.put("grapefruit", 1.99);
	    items.put("honeydew", 3.49);
	}
	// prints menu label and fills with items
	private static void printMenu() {
		System.out.println("item ....... price");
		
		for(Map.Entry<String,Double> entry: items.entrySet()){
			System.out.println( entry.getKey( )+ "\t " + entry.getValue());
		}
	}
	
	//User order total calculator
	private static double orderSum(List<Double> orderedItems) {
		double sum = 0;
		for (int i = 0; i < items.size(); i++) {
			double num = items.get(i);
			sum += num;
		}
		return sum;
	}
	
    //Find minimum price
	public static int minimun( List<Integer> minPrice) {
		int min = minPrice.get(0); 
		for (int num : minPrice) {
			if (num < min) {
				min = num;
				}
			}
	return min;
	}
	
	//Find maximum price
	public static int maximun( List<Integer> maxPrice) {
		int max = maxPrice.get(0); 
		for (int num : maxPrice) {
			if (num > max) {
				max = num;
				}
			}
	return max;
  }
	//Valid yes or no
	public static boolean getYesNo(Scanner scnr, String prompt) {
		String input;
		boolean isValid;
		do {
			System.out.println("That was not valid " + prompt);
			input=scnr.nextLine();
			
			isValid= "yes".equalsIgnoreCase(input) ||"y".equalsIgnoreCase(input)|| 
					"no".equalsIgnoreCase(input)||"n".equalsIgnoreCase(input); 
		} while (!isValid);
		return input.toLowerCase().startsWith("y");
  }
	
}
