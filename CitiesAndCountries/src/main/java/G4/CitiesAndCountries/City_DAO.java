package G4.CitiesAndCountries;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rady
 */
public class City_DAO extends Thread {
    public final List<City> c_list;
    BufferedReader br;
	String line; 

    public City_DAO() {
    	c_list=new ArrayList<City>();
    	try {
			this.br = new BufferedReader(new FileReader("F:\\ITI AI\\G4\\Java\\Day4\\CSV_files\\Cities.csv"));
			do{   
	            line=br.readLine(); 
	            if(line!=null){
	            	String [] parts=line.split(",");
	            	c_list.add(new City(Integer.parseInt(parts[0]), Integer.parseInt(parts[2]),parts[1] ,parts[3]));
	            	}
	        }while(line!=null); 
    	} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

