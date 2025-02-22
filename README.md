1. Encapsulation
Definition:
Encapsulation is the process of bundling data (attributes) and methods (functions) that operate on the data into a single unit, known as a class. It restricts direct access to some of an object’s components, which means that the internal representation of an object is hidden from the outside.

Key Points:

Data Hiding: Private variables and methods hide internal states.
Controlled Access: Public methods (getters and setters) provide controlled access to private data.
Benefits: Enhances security, increases modularity, and improves code maintainability

2. Abstraction
Definition:
Abstraction involves hiding the complex reality while exposing only the necessary parts. It allows programmers to focus on interactions at a high level rather than the underlying implementation details.

Key Points:

Simplification: Provides a simplified model of a complex system.
Abstract Classes and Interfaces: In Java, abstraction is implemented using abstract classes (which can have some implemented methods) and interfaces (which provide a contract without implementation).
Benefits: Reduces complexity and increases reusability by allowing the programmer to work with objects at a higher level.

3. Inheritance
Definition:
Inheritance is a mechanism that allows one class (the child or subclass) to inherit properties and behaviors (fields and methods) from another class (the parent or superclass).

Key Points:

Reusability: Enables code reusability by allowing the subclass to use methods and fields of the superclass.
Hierarchy: Supports a hierarchical classification of classes.
Types: In Java, single inheritance is supported (a class can extend only one superclass), but multiple inheritance is simulated through interfaces.
Benefits: Promotes the DRY (Don't Repeat Yourself) principle, making code easier to maintain and extend.

4. Polymorphism
Definition:
Polymorphism means "many forms" and allows objects to be treated as instances of their parent class rather than their actual class. The most common use of polymorphism is when a parent class reference is used to refer to a child class object.

Key Points:

Method Overloading: A form of compile-time polymorphism where methods in the same class have the same name but different parameters.
Method Overriding: A form of runtime polymorphism where a subclass provides a specific implementation of a method that is already defined in its superclass.
Benefits: Enhances flexibility and maintainability by allowing one interface to be used for a general class of actions.

Interconnections and Benefits of OOP
Modularity: Each class is designed to manage a specific aspect of the application, making the code easier to manage and debug.
Maintainability: By hiding internal complexities and promoting code reuse, OOP makes maintaining and updating software simpler.
Scalability: Well-designed OOP systems can be more easily scaled or modified to meet new requirements.
Real-world Modeling: OOP allows developers to model real-world entities and their interactions more naturally.
