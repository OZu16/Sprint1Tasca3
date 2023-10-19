package n1exercici3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

	public class CountriesGame {
		
		static Scanner sc = new Scanner(System.in);
	
		
		public static void textToHashMap( Map<String, String> countries){
	    	
	        String rutaCountries = "C:\\Users\\Gerard\\Desktop\\countries\\countries.txt";
	        
	        try {
	            Scanner scanner = new Scanner(new File(rutaCountries));
	
	            while (scanner.hasNextLine()) {
	                String[] linea = scanner.nextLine().split(" ");
	                countries.put(linea [0], linea[1]);
	            }
	
	            
	        } catch (FileNotFoundException e) {
	        	e.printStackTrace();
	        }
	  }
	  
	  
	public static int gamePoints(Map<String, String> countries) {	
		
	  List<String> keysList = new ArrayList<>(countries.keySet());
	  List<String> valueList = new ArrayList<>(countries.values());
	  String userCapital = "";
		int numRandom = 0;
	  int points = 0;
	
		    for(int i = 0; i < 10; i++) {
		    	numRandom =  (int) (Math.random() * countries.size() + 1);
		        System.out.println("escriu la capital del seguent pais: " + keysList.get(numRandom));
		        	userCapital = sc.nextLine();
		        	
		        if(userCapital.equalsIgnoreCase(valueList.get(numRandom))) {
		        	points++;
		        }
		    	
		    }
	  return points;
	}
	
	public static void textPointsAndUser(int points, String userName) {
		
		String rutaClassificacio = "C:\\Users\\Gerard\\Desktop\\countries\\classificacio.txt";
		
	  try {
	  	FileWriter writer = new FileWriter(rutaClassificacio);
	  	writer.write(userName + ": " + points + "\n");
	  	writer.close();
	  	
	  	System.out.println("puntuacio registrada al document classificacio.txt");
	
	  } catch (IOException e) {
	      e.printStackTrace();
	  }
	}

}
