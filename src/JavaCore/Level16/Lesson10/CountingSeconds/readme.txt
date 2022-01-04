1. Write an implementation for the run method in the Stopwatch thread.
2. The Stopwatch class must count the number of seconds that have passed from the creation of the thread until a string is entered.
3. Display the number of seconds.

Wymagania:
•	The Stopwatch class's run method must have a loop.
•	The run method should call Thread.sleep(1000).
•	The run method should increment the field seconds every 1 second.
•	After the Stopwatch thread is interrupted, the run method must display the number of seconds.
•	There must be only one run method in the Stopwatch class.