Read a URL from the console.
Display a space-delimited list of all the parameters (The parameters follow the "?" and are separated by "&", e.g. "lvl=15").
The URL contains at least 1 parameter.
The parameters must be displayed in the same order in which they are present in the URL.
If the obj parameter is present, pass its value to the relevant alert method.
alert(double value) - for numbers (fractional numbers have a decimal point)
alert(String value) - for strings
Note that the alert method must be called AFTER the list of all parameters is displayed.

Example 1

Input:
http://codegym.cc/alpha/index.html?lvl=15&view&name=Amigo

Output:
lvl view name

Example 2

Input:
http://codegym.cc/alpha/index.html?obj=3.14&name=Amigo

Output:
obj name
double: 3.14

Wymagania:
•	The program should read only one line from the keyboard.
•	The Solution class must not have static fields.
•	The program must display data on the screen in accordance with the task conditions.
•	The program should call the alert method with the double parameter if the obj parameter can be correctly converted to a double.
•	The program should call the alert method with the String parameter if the obj parameter CANNOT be correctly converted to a double.