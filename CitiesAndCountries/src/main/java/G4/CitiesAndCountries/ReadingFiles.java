package G4.CitiesAndCountries;

import java.util.List;

public class ReadingFiles extends Thread {
	public City_DAO ReadCities;
	public Country_DAO ReadCountries;
	public List<Country> countries;
	public List<City> cities;
	
	public void run(){
		ReadCities = new City_DAO();
        ReadCities.start();
		ReadCountries = new Country_DAO();
		ReadCountries.start();
	}

	public List<Country> getCountries() {
		return countries;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCountries() {
		this.countries = ReadCountries.c_list;
	}

	public void setCities() {
		this.cities = ReadCities.c_list;
	}
	
	

}
