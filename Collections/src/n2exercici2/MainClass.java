package n2exercici2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		HashSet<Restaurant> restaurantsHashSet = new HashSet<>();
		
		restaurantsHashSet.add(new Restaurant("a restaurant", 3));
		restaurantsHashSet.add(new Restaurant("b restaurant", 3));
		restaurantsHashSet.add(new Restaurant("g restaurant", 2));
		restaurantsHashSet.add(new Restaurant("c restaurant", 3));
		restaurantsHashSet.add(new Restaurant("a restaurant", 4));
		restaurantsHashSet.add(new Restaurant("z restaurant", 5));
		restaurantsHashSet.add(new Restaurant("o restaurant", 1));
		restaurantsHashSet.add(new Restaurant("p restaurant", 4));
		restaurantsHashSet.add(new Restaurant("d restaurant", 5));
		restaurantsHashSet.add(new Restaurant("d restaurant", 4));
		restaurantsHashSet.add(new Restaurant("d restaurant", 3));
		restaurantsHashSet.add(new Restaurant("d restaurant", 2));
		restaurantsHashSet.add(new Restaurant("d restaurant", 2));
		restaurantsHashSet.add(new Restaurant("d restaurant", 2));
		restaurantsHashSet.add(new Restaurant("d restaurant", 1));

		/*Iterator<Restaurant> iterator = restaurantsHashSet.iterator();
		
		while(iterator.hasNext()) {
			Restaurant restaurant= iterator.next();
			System.out.println(restaurant.getName() + " : " + restaurant.getPoints() + "punts");
		}*/

		List<Restaurant> restaurantsList = new ArrayList<>(restaurantsHashSet);
		
		Collections.sort(restaurantsList, Collections.reverseOrder());
		Collections.sort(restaurantsList, Collections.reverseOrder(new OrderByName()));

		for(int i = 0; i < restaurantsList.size(); i++) {
			System.out.println("nom: " + restaurantsList.get(i).getName() + ", puntuació: " + restaurantsList.get(i).getPoints() + "punts");
		}
	}

}
