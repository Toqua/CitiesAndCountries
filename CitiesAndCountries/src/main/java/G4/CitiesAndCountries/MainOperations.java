package G4.CitiesAndCountries;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class MainOperations {

	public Map<String,List<City>> CitesPerCountry = new HashMap<String,List<City>>();
	
	public void setCitesPerCountry(List<City> plist){
		
		Map<String,List<City>> Pmap =new HashMap<String,List<City>>();
		for(City p:plist){
			if(Pmap.containsKey(p.getCountryCode())){
				Pmap.get(p.getCountryCode()).add(p);
				//System.out.println(Pmap.get(p.getCountryCode()).toString());
			}
			else{
				
				List<City> temp= new ArrayList<City>();
				temp.add(p);
				Pmap.put(p.getCountryCode(), temp);
				//System.out.println(Pmap.get(p.getCountryCode()).toString());
			}
		}

		CitesPerCountry = Pmap;
		//CitesPerCountry.forEach((k,v)-> System.out.println("CountryCode=" + k + ", cities=" + v.toString()));

	}
	
	public void sortCityPopulation(String CountryCode){
		//CitesPerCountry.forEach((k,v)-> System.out.println("CountryCode=" + k + ", cities=" + v.toString()));
System.out.println(CitesPerCountry.containsKey(CountryCode));
		if(CitesPerCountry.containsKey(CountryCode)){
			CitesPerCountry.get(CountryCode).sort(new Comparator<City>() {
				public int compare(City o1, City o2) {
						// TODO Auto-generated method stub
						  if(o1.getPopulation() > o2.getPopulation()) return 1;
						  else if(o1.getPopulation() == o2.getPopulation())return 0;
						  else return -1;
				}
			});
			for(City c: CitesPerCountry.get(CountryCode)){
				System.out.println(c.toString());
			}
		}
		else{
			System.out.println("There isn't such city with this Country Code ");
		}
		
	}
}
