1. In the run method, add a delay of 10 milliseconds after all the actions. Display "Thread interrupted" if the thread is interrupted.
2. Make all the threads run sequentially: first, for thread 1, count down from COUNT to 1; then for thread 2 - from COUNT to 1, etc.

Example:
#1: 4
#1: 3
...
#1: 1
#2: 4
...

Wymagania:
•	The program should create 4 SleepingThread objects.
•	The main method should call join on each created SleepingThread object.
•	The run method should use Thread.sleep(10).
•	The program's output must correspond to the task conditions.
•	If a SleepingThread thread is interrupted, it should display "Thread interrupted".