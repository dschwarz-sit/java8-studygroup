## OCA Chapter 5 Essentials

#### Be able to write code that extends other classes
* Calling *this()* or *super()* has to be the first statement of a constructor.
* Explicit *super()* call required if no non-arg-constructor available in parent class.

#### Understand the rules for method overriding
* Not applicable for private methods in parent class!
* Covariant return type == inherited type. E.g. not possible to override return type *int* with *long*

#### Understand the rules for hiding methods and variables
* Methods/variables exist twice (one in the parent, one in the child).
* Caution when referring to a hidden method/variable.

#### Recognize the difference between method overriding and method overloading
* Overriding: Redefine a method in child class
* Overloading: Add a new method	

#### Be able to write code that creates and extends abstract classes
* Abstract classes can be *public* or *package private*
* Be careful whether a concrete class implements all abstract methods
* Method override rules apply for implementing abstract methods

#### Be able to write code that creates, extends, and implements interfaces
* Interfaces can be *public* or *package private*
* Interfaces are *abstract*, methods are *public abstract*
* Interfaces can have variables. They need to be initialized. Variables are *public static final*.
* Correct usage of keywords *implements* and *extends*

#### Be able to write code that uses default and static interface methods
* Inheritance of default methods when extending interfaces
    * Override default method with abstract method
    * Override default method with another default method
* Static interface methods are not inherited in implementing classes

#### Understand polymorphism
* An object can be referred to using a variable of a parent type or an interface
* Overridden methods are always resolved at runtime

#### Recognize valid reference casting
* Casting to superclass of interface not necessary
* Casting of unrelated types are prohibited by the compiler