// Project: Car Dealership
// Writers: Clayton Billups and Lee Nardo
// 
//	Purpose: Simulate the basic functionality of a 
//	car dealership using Java
//

import java.lang.*;
import system.util.*;
import system.io.*;
import "Records.java";

public class CarDealer{
	
		  public static void main(String args[]){
				//load Records database
				Records cars = new Records();

				//create scanner userInput(ui)
				Scanner ui = new Scanner(System.in);

				//create user interaction loop
				while(ui.hasNextLine()){
					switch(ui){
						add:
							cars.addCar();
							break;
						remove:
							cars.removeCar();
							break;
						list:
							cars.showCars();
							break;
						search:
							cars.getCar();
							break;
						exit:
							cars.save();
							System.out.println("Goodbye!");
							exit(1);
							break;
					}		
				}

		  }

}
