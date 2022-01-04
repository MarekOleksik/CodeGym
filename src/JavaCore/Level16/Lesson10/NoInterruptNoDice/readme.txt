Figure out how the program works.
Make it so that the ourInterrupt method allows the TestThread to terminate itself.
Don't use the interrupt method.

Wymagania:
•	The Solution class must have a public static method called ourInterrupt with no parameters.
•	The run method should display "he-he" every half second until the ourInterrupt method is called.
•	You must change the condition of the while loop in the run method.
•	The main method must create a Thread object by passing a TestThread object to the constructor.
•	The main method must call the start method on the Thread object.
•	The main method must call the ourInterrupt method.