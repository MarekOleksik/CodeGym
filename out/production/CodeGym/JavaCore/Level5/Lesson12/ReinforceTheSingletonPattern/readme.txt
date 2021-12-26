1. Find an example of the singleton pattern used for lazy initialization. Use your favorite search engine (such as Google).
2. In separate files, create three singleton classes in its likeness and image: Sun, Moon, and Earth.
3. Implement the Planet interface in the Sun, Moon, and Earth classes.
4. In Solution class's static block, call the readKeyFromConsoleAndInitPlanet method.
5. Implement the readKeyFromConsoleAndInitPlanet method:
5.1. Read one String value from the console.
5.2. If the value is equal to one of the Planet interface's constants, create a corresponding object and assign it to Planet thePlanet, otherwise set the Planet thePlanet to null.

Requirements:
•	The Sun class should prevent Sun objects from being created outside the class.
•	The Sun class must have a private static Sun field named instance.
•	The Sun class must implement the public static getInstance method, which returns the value of the field instance.
•	The Sun class's getInstance method must ALWAYS return the same object.
•	The field instance must be initialized after the first call to the getInstance method, but not before.
•	The Moon class should prevent Moon objects from being created outside the class.
•	The Moon class must have a private static Moon field instance.
•	The Moon class must implement the public static getInstance method, which returns the value of the field instance.
•	The Moon class's getInstance method must ALWAYS return the same object.
•	The field instance must be initialized after the first call to the getInstance method, but not before.
•	The Earth class should prevent Earth objects from being created outside the class.
•	The Earth class must have a private static Earth field instance.
•	The Earth class must implement the public static getInstance method, which returns the value of the field instance.
•	The Earth class's getInstance method must ALWAYS return the same object.
•	The field instance must be initialized after the first call to the getInstance method, but not before.
•	The readKeyFromConsoleAndInitPlanet method must be called in the Solution class's static block.
•	The readKeyFromConsoleAndInitPlanet method should read one line from the keyboard.
•	The readKeyFromConsoleAndInitPlanet method must correctly update the value of the variable thePlanet according to the task conditions.
•	The Sun, Moon and Earth classes must be in separate files.