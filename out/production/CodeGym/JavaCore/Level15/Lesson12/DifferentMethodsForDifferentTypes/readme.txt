1. Read data from the console until the word "exit" is entered.
2. For each value (except "exit"), call the print method. If the value:
2.1. contains a period ("."), then call the print method for Double;
2.2. is greater than zero, but less than 128, then call the print method for short;
2.3. less than or equal to zero or greater than or equal to 128, then call the print method for Integer;
2.4. otherwise, call the print method for String.

Wymagania:
•	The program must read data from the keyboard.
•	The program should stop reading data from the keyboard after "exit" is entered.
•	If the entered string contains a period (".") and can be correctly converted to a Double, the print(Double value) method should be called.
•	If the entered string can be correctly converted to a short and the resulting number is greater than 0, but less than 128, the print(short value) method should be called.
•	If the entered string can be correctly converted to an Integer and the resulting number is less than or equal to 0 or greater than or equal to 128, the print(Integer value) method should be called.
•	In all other cases, the print(String value) method should be called.