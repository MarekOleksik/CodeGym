Figure out what gets initialized and in what order. Set breakpoints and use the debugger.

Correct the order in which data is initialized to get the following result:
static void init()
Static block
public static void main
Non-static block
static void printAllFields
0
null
Solution constructor
static void printAllFields
6
First name

Wymagania:
•	The program should display data on the screen.
•	The screen output must match the task conditions.
•	The Solution class's static initializer block should cause "static void init()" and "Static block" to be displayed on the screen.
•	The program must not read data from the keyboard.