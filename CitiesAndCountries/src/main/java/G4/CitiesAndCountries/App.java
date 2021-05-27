package G4.CitiesAndCountries;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Hello world!
 *
 */
public class App 
{
	
    public static void main( String[] args )
    {
    	List<Country> countries = null;
    	List<City> cities = null ;
        ReadingFiles RFs = new ReadingFiles();
        RFs.start();
        try {
			RFs.join();
			RFs.setCities();
	        RFs.setCountries();
	        RFs.join();
	        countries = RFs.getCountries();
	    	cities = RFs.getCities();
	    	RFs.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("finish reading from files");
    	MainOperations O = new MainOperations();
    	O.setCitesPerCountry(cities);
    	O.sortCityPopulation("EGY");
    	
    	
    	Stream<Integer> countriesPopulations = countries.stream().map(Country::getPopulation).sorted();
    	System.out.println(countriesPopulations);
    	int averagecountriesPopulations = IntStream.of(countries.stream().map(Country::getPopulation)).average();
    	Integer maxcountriesPopulations = countries.stream().map(Country::getPopulation).max(null);
    	//Highest population city of each country
    	//Highest population capital
    }
}
