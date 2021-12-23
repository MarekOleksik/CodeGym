Simplify the code: remove all inheritance and implementations that will be added automatically by the compiler
PS: The me and zapp objects have a has-a relationship: https://en.wikipedia.org/wiki/Has-a

Wymagania:
The SpecificSerializable interface should extend the Serializable interface.
The JavaDev class must implement the SpecificSerializable interface.
The code should not have explicit inheritance involving the Object class (extends Object).
The JuniorJavaDev class should not explicitly inherit the SpecificSerializable interface.