package G4.CitiesAndCountries;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Country_DAO extends Thread{
	 public final List<Country> c_list;
	    BufferedReader br;
		String line; 

	    public Country_DAO() {
	    	c_list=new ArrayList<Country>();
	    	try {
				this.br = new BufferedReader(new FileReader("F:\\ITI AI\\G4\\Java\\Day4\\CSV_files\\Countries.csv"));
				do{   
		            line=br.readLine(); 
		            if(line!=null){
		            	String [] parts=line.split(",");
		            	c_list.add(new Country(parts[0], parts[1],parts[2] ,
		            			Double.parseDouble(parts[3]),Integer.parseInt(parts[4]),
		            			Double.parseDouble(parts[5]),Integer.parseInt(parts[6]) ) );
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
