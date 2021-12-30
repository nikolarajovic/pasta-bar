package mini_projekat_2022;

import java.util.Scanner;

public class pasta_bar {
	// mini project called "pasta bar"
	
	public static int findIngredient(String[] ingredients, String ingredient) {
		int findIngredient = 0;
		for (int i = 0; i < ingredients.length; i++) {
			if (ingredients[i].equals(ingredient)) {
				findIngredient = i;
			}
		}
		return findIngredient;
	}
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] regularCustomers = { "064666231", "064555222", "0651112345", "066345425", 
										"0662344444", "0644445553" };
		String[] ingredients = { "Macaroni", "Spaghetti", "Bolognese", "Turkey meat",
								"Beef", "Bacon", "Chicken", "4 cheeses",
								"Smoked cheese", "Parmesan", "Sour cream", "Pesto sauce",
								"Napolitana", "Vegetable mix", "Mushrooms", "Box" };
		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };
		
		System.out.print("Ingredient: ");
		String ingredient = s.nextLine();

	}

}
