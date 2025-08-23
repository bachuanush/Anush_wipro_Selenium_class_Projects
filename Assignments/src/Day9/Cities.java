package Day9;

import java.util.*;


class City {
 private String name;
 private int population;

 public City(String name, int population) {
     this.name = name;
     this.population = population;
 }


 public String getName() {
     return name;
 }

 public int getPopulation() {
     return population;
 }

 
 public String toString() {
     return "City{name='" + name + "', population=" + population + "}";
 }
}
public class Cities {
	 public static void main(String[] args) {
	      
	        List<City> c = new ArrayList<>();
	        c.add(new City("Tokyo", 37400068));
	        c.add(new City("New York", 18900000));
	        c.add(new City("London", 9300000));
	        c.add(new City("Paris", 11000000));
	        c.add(new City("Sydney", 5400000));
	        c.add(new City("Dubai", 3500000));
	        c.add(new City("Singapore", 5900000));

	        System.out.println("Before Sorting by Population:");
	        c.forEach(System.out::println);

	        System.out.println("*****************************");
	        
	        c.sort(Comparator.comparing(City::getPopulation).reversed());
	        System.out.println("After Sorting by Population (Desc):");
	        c.forEach(System.out::println);
	    }
}
