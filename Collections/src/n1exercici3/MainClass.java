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

public class MainClass {
	
	static Scanner sc = new Scanner(System.in);
	
    public static void main(String[] args) {
    	
        Map<String, String> countries = new HashMap<>();
        String userName = "";
        int points = 0;
        
        CountriesGame a = new CountriesGame();
        
        System.out.println("introdueix nom usuari");
        userName = sc.nextLine();
        
        try {
        	a.textToHashMap(countries);
        }catch(FileNotFoundException e) {
        	e.printStackTrace();
        }
        
        points = a.gamePoints(countries);
        
       
        try {
			a.pointsAndUserToTxt(points, userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
          	   
        
    }

    
}