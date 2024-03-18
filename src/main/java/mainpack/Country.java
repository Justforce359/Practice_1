package mainpack;

public class Country {

    private String name;
    private double area;
    private double population;
    private String CountryName;
    private String CapitalPopulation;

    public Country() {
        name = "Russia";
        area = 17.1;
        population = 146.7;

    }

    public Country(String name, int area, int population, String countryName, String capitalPopulation) {
        this.name = name;
        this.area = area;
        this.population = population;
        CountryName = countryName;
        CapitalPopulation = capitalPopulation;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public double getPopulation() {
        return population;
    }

    public String getCountryName() {
        return CountryName;
    }

    public String getCapitalPopulation() {
        return CapitalPopulation;
    }



}
