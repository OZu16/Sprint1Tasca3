package n2exercici1;

import java.util.Objects;

public class Restaurant {

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
	public int hashCode() {
		return Objects.hash(name, points);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(name, other.name) && points == other.points;
	}
	
	
}
