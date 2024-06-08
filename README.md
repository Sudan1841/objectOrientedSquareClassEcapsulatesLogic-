# objectOrientedSquareClassEcapsulatesLogic-

# This code to follow object-oriented principles by creating a Square class that encapsulates the logic for creating and printing a square. We'll define methods for initializing the square, generating its lines, and printing it. Here's the updated code:

# Explanation:

Class Definition:



The Square class encapsulates the logic for generating and printing a square.

Attributes:



size: An integer representing the size of the square.

square: A String array to store each line of the square.

Constructor:



Square(int size): Initializes the size and the square array. Calls the generateSquare method to populate the square array.

Methods:



generateSquare(): Generates each line of the square based on the given size.

Uses a loop to create the first and last lines filled with asterisks (*).

For the middle lines, it places an asterisk at the beginning and end, with spaces in between.

printSquare(): Prints each line of the square stored in the square array.

Main Method:



In the main method, an instance of the Square class is created with a size of 20.

The printSquare method is called to display the generated square.

This object-oriented approach organizes the code into a reusable Square class, making it easier to manage, extend, and understand.




