1. Create a public static class MarkTwainBook that inherits Book. Name of the author [Mark Twain].
The constructor parameter is the book title.
2. Implement all the abstract methods in the MarkTwainBook class.
3. Change the return type of the getBook method to make it more appropriate.
4. In a similar manner, create the AgathaChristieBook class. Name of the author [Agatha Christie].
5. In the Book class, implement the getOutputByBookType method so that it returns:
5.1. agathaChristieOutput for books written by Agatha Christie;
5.2. markTwainOutput for books written by Mark Twain.

Wymagania:
•	The Solution class must contain the public static MarkTwainBook class.
•	The MarkTwainBook class must be a descendant of the Book class.
•	The MarkTwainBook class must correctly implement a constructor with one String parameter (book title).
•	The MarkTwainBook class constructor should call the constructor of the parent class (Book) with the argument "Mark Twain".
•	The getBook method in the MarkTwainBook class must have the MarkTwainBook return type and return the current object.
•	The Solution class must contain the public static AgathaChristieBook class.
•	The AgathaChristieBook class must be a descendant of the Book class.
•	The AgathaChristieBook class must correctly implement a constructor with one String parameter (book title).
•	The AgathaChristieBook class constructor should call the constructor of the parent class (Book) with the argument "Agatha Christie".
•	The getBook method in the AgathaChristieBook class must have the AgathaChristieBook return type and return the current object.
•	The getTitle method in the AgathaChristieBook and MarkTwainBook classes should return the title of a specific book.
•	The getOutputByBookType method must return the correct string for AgathaChristieBook objects.
•	The getOutputByBookType method must return the correct string for MarkTwainBook objects.
•	The MarkTwainBook class must have a String field title (book title).
•	The AgathaChristieBook class must have a String field title (book title).