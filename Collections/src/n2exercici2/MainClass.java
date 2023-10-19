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
		restaurantsHashSet.add(new Restaurant("z restaurant", 2));
		restaurantsHashSet.add(new Restaurant("z restaurant", 1));
		restaurantsHashSet.add(new Restaurant("z restaurant", 3));
		restaurantsHashSet.add(new Restaurant("z restaurant", 1));
		restaurantsHashSet.add(new Restaurant("z restaurant", 1));


		List<Restaurant> restaurantsList = new ArrayList<>(restaurantsHashSet);
		
		
		Collections.sort(restaurantsList, (o1, o2) ->{
			return o2.getName().compareTo(o1.getName());
		});
		
		Collections.sort(restaurantsList, (o1, o2) ->{
			if(o1.getName().equals(o2.getName())) {
				return Integer.compare(o2.getPoints(),o1.getPoints());
			}else{
				return 0;
			}
		});
		

		for(int i = 0; i < restaurantsList.size(); i++) {
			System.out.println("nom: " + restaurantsList.get(i).getName() + ", puntuació: " + restaurantsList.get(i).getPoints() + "punts");
		}
	}

}