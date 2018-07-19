package w9.Countries;

public class Main {
    public static void main(String[] args) {
        CountryMap countryMap = new CountryMap();
        countryMap.addCountry(new Country("Ukraine",38000));
        countryMap.addCountry(new Country("Moldova",16078));
        countryMap.addCountry(new Country("Poland",18975));

        countryMap.print();
        countryMap.searchByName("Ukraine");
        countryMap.searchByName("Kyiv");
    }
}
