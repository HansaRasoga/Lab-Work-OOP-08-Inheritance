# These are the question in lab sheet 08
Object Oriented Programming I 
Lab Sheet 8 Inheritance 
1. Create a class called Vehicle (Superclass). Inside the superclass 
• Include two instance variables brand (String), and year (int). 
• Create a parameterized constructor including brand and year. 
• Implement Getter methods for those instance variables 
• Inside Vehicle class implement following three methods. 
o public void start() 
▪ System.out.println("Starting the " + year + " " + brand + " vehicle."); 
o public void stop()  
▪ System.out.println("Stopping the " + year + " " + brand + " 
vehicle."); 
o public void accelerate()  
▪ System.out.println("Accelerating the " + year + " " + brand + " 
vehicle."); 
Child Class 01  
Create a child class called ‘Car’ and create a constructor inside the class. 
Use same instance variables that use in the main class. (*hint use super key word) 
Create a method called ‘honk()’ and display following values inside that method. 
System.out.println("Honking the horn of the " + getYear() + " " + getBrand() + " 
car.") 
Child Class 02 
• Create a child class called ‘Motorcycle’ and create a constructor inside the class. 
• Use same instance variables that use in the main class. (*hint use super key 
word) 
• Create a method called ‘wheelie()’ and display following values inside that 
method. 
o System.out.println("Popping a wheelie on the " + getYear() + " " + 
getBrand() + " motorcycle.") 
Create a Main Class 
• Create a main class called VehicleInheritanceExample and create separate 
objects for Car class and Motorcycle’ and pass suitable values for Year and Brand 
variables. 
• By using that object that is created for the Car class called start(), accelerate(), 
honk(), stop()  
• By using that object that is created for the Motorcycle’ class called start(), 
accelerate(), wheelie (), stop() accordingly. 