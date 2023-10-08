package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CountriesGame {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        Map<String, String> countries = new HashMap<>();
        Map<String, Integer> rating = new HashMap<>();
        String rutaCountries = "C:\\Users\\Gerard\\Desktop\\countries\\countries.txt";
        String rutaClassificacio = "C:\\Users\\Gerard\\Desktop\\countries\\classificacio.txt";
        String userName = "";
        String userCapital = "";
        int numRandom = 0;
        int points = 0;
        
        try {
            Scanner scanner = new Scanner(new File(rutaCountries));

            while (scanner.hasNextLine()) {
                String[] linea = scanner.nextLine().split(" ");
                countries.put(linea [0], linea[1]);
            }

            
        } catch (FileNotFoundException e) {
            System.out.println("fitxer no trobat");
        	//e.printStackTrace();
        }

        /*for (Map.Entry<String, String> entry : lineas.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }*/
        
        System.out.println("introdueix nom usuari");
        userName = sc.nextLine();
        
        
        List<String> keysList = new ArrayList<>(countries.keySet());
        List<String> valueList = new ArrayList<>(countries.values());

	    for(int i = 0; i < 10; i++) {
	    	numRandom =  (int) (Math.random() * countries.size() + 1);
	        System.out.println("escriu la capital del seguent pais " + keysList.get(numRandom) + " " + valueList.get(numRandom));
	        	userCapital = sc.nextLine();
	        	
	        if(userCapital.equalsIgnoreCase(valueList.get(numRandom))) {
	        	points++;
	        }
	        rating.put(userName, points);
        }
	    	    
	    try {
	    	BufferedWriter writer = new BufferedWriter(new FileWriter(rutaClassificacio));
	    	writer.write(userName + ": " + points);
	    	writer.newLine();
	    	System.out.println("puntuacio registrada al document classificacio.txt");

        } catch (IOException e) {
            System.out.println("fitxer no trobat");
            //e.printStackTrace();
        }
    }
}