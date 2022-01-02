Think where and on what object you need to call the join method to have the result displayed
first for firstThread and then for secondThread.
Call the join method in the right place.

Example output:
firstThread : String 1
firstThread : String 2
...
firstThread : String 19
firstThread : String 20
secondThread : String 1
...
secondThread : String 20

Wymagania:
•	The main method must call the join method on firstThread.
•	The main method should not call the join method on secondThread.
•	The main method should not call System.out.println or System.out.print().
•	The program's output must match the example in the task.