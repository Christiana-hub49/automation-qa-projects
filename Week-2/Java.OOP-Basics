## Classes and Objects

- A class is a blueprint for creating objects
- An object is an instance of a class

Example:
class Car {
    String brand;
}

Car myCar = new Car();
myCar.brand = "Toyota";

---

## Methods

- A method defines what an object can do

Example:
int add(int a, int b) {
    return a + b;
}
## Encapsulation

- Encapsulation means hiding data and controlling access using methods
- We use private variables and public getters/setters

Example:
class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

---

## Inheritance

- Allows a class (child) to inherit from another class (parent)
- Uses the keyword `extends`

Example:
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

---

## Method Overriding

- A child class provides its own version of a method from the parent class

Example:
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

---

## Polymorphism

- Polymorphism means "many forms"
- The same method behaves differently depending on the object

Example:
Animal a = new Dog();
a.sound(); // Calls Dog's version

---

## Abstraction

- Abstraction hides implementation details and shows only essential features
- Achieved using abstract classes

Example:
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

---

## Interface

- An interface defines a contract (what a class must do)
- A class implements an interface

Example:
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

---

## Variable Scope

- Local variable: declared inside a method
- Instance variable: declared inside a class
- Static variable: shared among all objects

---

## Method Overloading

- Same method name with different parameters

Example:
int add(int a, int b)
int add(int a, int b, int c)
