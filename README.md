# Shape - 3

Class Exercise:
Shape class (40 pts) – Shape.java
Shape Driver (20 pts) – ShapeTest.java
 

Class Exercise

 

Write a class called Shape that contains instance data that represents the name and number of sides of the shape. 
Define a constructor to initialize these values. Include mutator(setter) methods – with the this reference – for the instance data, 
and a toString method that returns a the shape data. Create a static variable to keep track of the number of shapes, 
and a static method to return the number of shapes entered. Create a driver class called ShapeTest, 
whose main method instantiates the objects and updates several Shape objects by prompting the user for the information.

 

In the Shape Class, you will need:

 

Two private members to store data
A static variable to store the number of shapes
One constructor, which should not accept any values during instantiation
Mutators for each private member of the class (Note: you don’t need to create accessors this time.)
A static method which returns the number of shapes
A toString method to output the information
 

In the ShapeTest driver, you will need:

 

At three Shape objects (no hardcoded info this time)
A Scanner Object to get information for all of the objects
Local variables to store information
To reference the static variable (with the updated number of shapes) in the driver
 

#Here is some sample output:

 

Enter info on 3 shapes:

Enter the name of the shape: Square

Enter the number of sides: 4

Enter the name of the shape: Hexagon

Enter the number of sides: 6

Enter the name of the shape: Octagon

Enter the number of sides: 8


Here is the info you entered for the 3 shapes: 

Shape: Square

No. of sides:4

Shape: Hexagon

No. of sides:6

Shape: Octagon

No. of sides:8

