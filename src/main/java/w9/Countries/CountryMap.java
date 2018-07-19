package w9.Countries;

import java.util.HashMap;
import java.util.Map;

class CountryMap {
    private Map<String, Integer> countryMap;

    CountryMap() {
        this.countryMap = new HashMap<>();
    }

    void searchByName(String countryName) {
        if (countryMap.containsKey(countryName)) {
            countryMap
                    .entrySet()
                    .stream()
                    .filter(e -> e.getKey().matches(countryName))
                    .forEach(e -> System.out.println(e.getKey() + " : " + e.getValue()));
        } else System.out.println("You try to search: " + countryName + ". Nothing was found, try something else");
    }

    void print() {
        System.out.println(countryMap.entrySet());
    }

    void addCountry(Country country) {
        countryMap.put(country.getName(), country.getPopulation());
    }
}
