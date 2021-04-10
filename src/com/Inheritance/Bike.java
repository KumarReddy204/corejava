package com.Inheritance;

public class Bike extends BikeCompany
{
    int i;
    public void run()
    {
	System.out.println("Execute Bike Class Run Method");
    }
    
    public void m1()
    {
	System.out.println("Execute Bike Class M1() Method");
    }

    public static void main(String[] args)
    {
	/*BikeCompany oBikeCompany = new BikeCompany();
	oBikeCompany.run();
	oBikeCompany.bcM1();
	oBikeCompany.m1();	//Compile time error The method m1() is undefined for the type BikeCompany.
	 */ 
	
	/*Bike oBike = new BikeCompany(); // Compile time error Type mismatch: cannot convert from BikeCompany to Bike.
	  
	 * Bike oBike = (Bike)new BikeCompany(); // runtime Exception java.lang.ClassCastException: parent class cannot be cast to child class.
	 */ 
	
	/*BikeCompany oBikeCompany = new Bike();
	oBikeCompany.bcM1();
	oBikeCompany.run();
	System.out.println(oBikeCompany.i); // compile time error*/
	
	Bike oBike = new Bike();
	System.out.println(oBike.i);
	oBike.bcM1();
	oBike.run();
	
    }

}

 /*Explination
  -------------
  
  * Inheritance in java is used to add addition functionalities to the Present class.
  * 
  * 1.Here Parent class is BikeCompany and Child Class is Bike.
  * 
  * 2.if you create object instance for parent class like below
  * 	i.e BikeCompany oBikeCompany = new BikeCompany();
  * 	-> you can access only parent class variables and methods.
  * 
  * 3.if you create child class as instance and create object for Parent class.
  * 	i.e You will get the compile time error (Type is mismatch)
  * 	-> if you type cast that object instance then resolve the compile time error but get runtime error
  * 		(java.lang.ClassCastException: parent class cannot be cast to child class)
  * 
  * 4.if you create parent instance and create object for Child as below
  * 	i.e BikeCompany oBikeCompany = new Bike();
  * 	 it will access only parent class methods and varaiables.
  * 	 if any same method exist means i will execute the sub class method.
  * 
  * 5.Finally Best Practice to create object for child class and you can access both class variables and methods.
  * */
