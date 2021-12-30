1. Create a Bridge interface with an int getCarsCount() method.
2. Write WaterBridge and SuspensionBridge classes that implement the Bridge interface.
3. The getCarsCount() method must return any constant int value.
4. The getCarsCount() method must return different values ​​for different classes.
5. Create a public println(Bridge bridge) method in the Solution class.
6. In the println method, display the result of calling getCarsCount() method on the bridge object.
7. Each class and interface must be in separate files.

Wymagania:
•	The Bridge interface must be in a separate file.
•	The WaterBridge and SuspensionBridge classes must be in separate files.
•	The WaterBridge and SuspensionBridge classes must implement the Bridge interface.
•	The getCarsCount() method must return different int values ​​for different classes, but always the same value for different objects of the same class.
•	The Solution class must implement a public println method with one Bridge parameter.
•	The println method must display the number of cars (result of the getCarsCount method) for the passed Bridge object.
•	The Bridge interface must define an int GetCarsCount() method.