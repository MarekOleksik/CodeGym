1. In a separate file, create a DrinkMaker class with three abstract methods:
- void getRightCup() - select a suitable cup
- void addIngredients() - add the ingredients
- void pour() - pour liquid
2. In the DrinkMaker class, declare and implement the void makeDrink() method, which prepares a beverage in the following order: select a cup, add ingredients, pour liquid.
3. In separate files, create LatteMaker and TeaMaker classes that inherit DrinkMaker.
4. Assign the following phrases among all the methods in the LatteMaker and TeaMaker classes, with different phrases for the different methods.
5. Each method should display its own phrase, without display the same phrase as any other method.

6. Phrases:
"Fill with boiling water"
"Grab a cup for latte"
"Add tea leaves"
"Grab a cup for tea"
"Fill with foamy milk"
"Make coffee"

Wymagania:
•	The DrinkMaker class must be in a separate file and must be abstract.
•	The DrinkMaker class must have three abstract methods: getRightCup, addIngredients, and pour.
•	The DrinkMaker class must implement the makeDrink method, which calls this class's abstract methods in the order specified by the task conditions.
•	The LatteMaker class must be in a separate file and be a descendant of the DrinkMaker class.
•	The TeaMaker class must be in a separate file and be a descendant of the DrinkMaker class.
•	The LatteMaker class's getRightCup method should display "Grab a cup for latte".
•	The LatteMaker's addIngredients method should display "Make coffee".
•	The LatteMaker class's pour method should display "Fill with foamy milk".
•	The TeaMaker class's getRightCup method should display "Grab a cup for tea".
•	The TeaMaker class's addIngredients method should display "Add tea leaves".
•	The TeaMaker class's pour method should display "Fill with boiling water".