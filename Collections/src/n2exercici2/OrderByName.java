package n2exercici2;

import java.util.Comparator;

public class OrderByName implements Comparator<Restaurant> {
	
	@Override
	public int compare(Restaurant a, Restaurant b) {
		return a.getName().compareTo(b.getName());
	}

}
