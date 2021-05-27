package G4.CitiesAndCountries;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rady
 */
public class City {
    private int id;
    private int population;
    private String name;
    private String countryCode;
    
    public City( int id,int population, String name, String countryCode)
	{
		this.id=id;
		this.population=population;
		this.name=name;
		this.countryCode=countryCode;

	}
    
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", population=" + population + ", countryCode=" + countryCode
				+ "]";
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
    
}

