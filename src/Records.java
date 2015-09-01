/*
 * Helper File
 * Contains all functions
 *
 * Function List:
 * void addCar()
 * void removeCar()
 * void showCars(ArrayList)
 * void getCar(String VIN)
 * void getCarByPrice(Double low, Double high)
 * void save()
*/

import system.lang.*;
import system.util.*;
import system.io.*;
import "Car.java";

public class Records{
	
	ArrayList inventory;
		  
	//construct class and init ArrayList
	public Records(){
		scanner getCars = new scanner(File("cars.txt"));
		inventory = new ArrayList();

		//parse cars.txt and use regex to get individual values for each Car object going into arraylist

	}

	//method to add a car to from inventory
	public void addCar(){
		
	}

	//method to remove a car from inventory
	public void removeCar(){

	}

	//method to show all cars in inventory
	public void showCars(){
		
	}

	//method to search for specific cars using a VIN number
	public void getCar(String VIN){
		
	}
	
	//method to search for specific cars in inventory within a price range
	public void getCarsByPrice(Double low, Double high){
	
	}

	public void save(){
		//save current arraylist to cars.txt
	}

}
