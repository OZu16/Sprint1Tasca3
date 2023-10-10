package n2exercici1;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass {

	public static void main(String[] args) {

		HashSet<Restaurant> restaurantsHashSet = new HashSet<>();
		
		restaurantsHashSet.add(new Restaurant("restaurant1", 3));
		restaurantsHashSet.add(new Restaurant("restaurant1", 3));
		restaurantsHashSet.add(new Restaurant("restaurant2", 2));
		restaurantsHashSet.add(new Restaurant("restaurant2", 3));
		restaurantsHashSet.add(new Restaurant("restaurant3", 4));
		restaurantsHashSet.add(new Restaurant("restaurant3", 5));
		restaurantsHashSet.add(new Restaurant("restaurant5", 1));
		restaurantsHashSet.add(new Restaurant("restaurant8", 4));
		restaurantsHashSet.add(new Restaurant("restaurant9", 5));
		
		Iterator<Restaurant> iterator = restaurantsHashSet.iterator();
		
		while(iterator.hasNext()) {
			Restaurant restaurant= iterator.next();
			System.out.println(restaurant.getName() + " : " + restaurant.getPoints() + "punts");
		}

	}

}
