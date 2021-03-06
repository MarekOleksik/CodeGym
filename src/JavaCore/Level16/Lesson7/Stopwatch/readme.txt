1. Figure out what the program does.
2. Implement logic in the doStep method so that the runner's speed is taken into consideration.
2.1. The Runner class's getSpeed() method displays how many steps per second a runner takes.
The runner needs to actually take a specified number of steps per second.
If Usain takes 4 steps per second, then he will take 8 steps in 2 seconds.
If Carl takes 2 steps per second, then he will take 4 steps in 2 seconds.
2.2. The Thread class's sleep method has a long parameter.

IMPORTANT! Use the Thread.sleep() method, not Stopwatch.sleep().

Wymagania:
•	The getSpeed method must return an int.
•	The Runner class's field speed must be an int.
•	The Runner class constructor must accept a String and an int.
•	The doStep method must account for the runner's speed. If the runner's speed is 2 steps per second, then the method should run for half a second; if the runner's speed is 4 steps per second, then the method should run for a quarter of a second.
•	The program's output should indicate how many steps Usain and Carl took in 2 seconds.