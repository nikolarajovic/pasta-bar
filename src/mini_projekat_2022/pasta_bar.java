package mini_projekat_2022;

import java.util.Scanner;

public class pasta_bar {
	// mini project "pasta bar"

	public static int findIngredient(String[] ingredients, String ingredient) {
		int findIngredient = 0;
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredient)) {
				findIngredient = i;
			}
		}
		return findIngredient;
	}

	public static boolean isRegularCustomer(String[] regularCustomers, String customer) {
		for (int i = 0; i < regularCustomers.length; i++) {
			if (regularCustomers[i].equals(customer)) {
				return true;
			}
		}
		return false;
	}

	public static void print(String[] ingredients, int[] prices) {
		for (int i = 0; i < prices.length; i++) {
			System.out.println(ingredients[i] + " - " + prices[i]);
		}
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] regularCustomers = { "064666231", "064555222", "0651112345", "066345425", "0662344444", "0644445553" };
		String[] ingredients = { "Macaroni", "Spaghetti", "Bolognese", "Turkey meat", "Beef", "Bacon", "Chicken",
				"4 cheeses", "Smoked cheese", "Parmesan", "Sour cream", "Pesto sauce", "Napolitana", "Vegetable mix",
				"Mushrooms", "Box" };
		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		String ingredient = "";
		int price = 0;
		int i = 0;

		System.out.println("*** RYAN'S PASTA BAR ***\n");
		System.out.println("HELLO AND WELCOME TO RYAN'S PASTA BAR!!\n");
		System.out.println("PLEASE FEEL FREE TO CHOOSE YOUR BODIES FUEL FOR TODAY\n");
		print(ingredients, prices);
		System.out.println();

		System.out.print("Choose an ingredient for your pasta: ");
		ingredient = s.nextLine();

		while (!ingredient.equals("Order")) {
			price += prices[i];
			System.out.print("Choose an ingredient for your pasta: ");
			ingredient = s.nextLine();
			i = findIngredient(ingredients, ingredient);	
		}

		System.out.print("\nEnter your phone number: ");
		String customer = s.next();

		if (isRegularCustomer(regularCustomers, customer) == true) {
			price -= (price * 10 / 100);
		}

		System.out.println("\nYOUR PASTA COSTS: " + price + " RSD");
		System.out.println("\n*** ENJOY!! WE KNOW YOU WILL!! ***");

	}

}
