Figure out what the program does.
Implement the calculateHorsesFinished method.
It must:
1. Calculate and return the number of horses that have finished. Use the isFinished() method.
2. If a horse has not yet crossed the finish line (!IsFinished()), then:
2.1. Display "Waiting for " + horse.getName().
2.2. Wait until it finishes the race. Think about what method you need to use to do this.
2.3. Not treat such a horse as finished.

Wymagania:
•	The calculateHorsesFinished method must return the number of horses that have finished.
•	The calculateHorsesFinished method must call the isFinished method on each horse in the passed list.
•	If any of the horses in the passed list has not yet finished, then the calculateHorsesFinished method should display "Waiting for " + horse.getName(). Example output for the first horse: "Waiting for Horse_01".
•	If any of the horses in the passed list has not yet finished, then the calculateHorsesFinished method must wait until it finishes. Use the correct method for waiting.
•	After the program is finished, the console must indicate that all the horses have finished. Example output for the first horse: "Horse_01 has finished the race!".