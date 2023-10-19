package n2exercici2;

import n2exercici2.Restaurant;

public class Restaurant implements Comparable<Object> {

	String name = "";
	int points = 0;
	
	
	public Restaurant(String name, int points) {
		super();
		this.name = name;
		this.points = points;
	}


	public String getName() {
		return name;
	}


	public int getPoints() {
		return points;
	}
	
	@Override
	public boolean equals(Object object) {
		
		if(object == null) return false;
		
		Restaurant restaurant = (Restaurant) object;
		if(this.getName().equals(restaurant.getName()) && this.getPoints() == restaurant.getPoints()) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getName().hashCode();
	}
	
	
	@Override
	public int compareTo(Object object) {
		
		Restaurant restaurant = (Restaurant) object;
		return this.points - restaurant.points;
	}
}