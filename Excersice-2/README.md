# Design Patterns in Java

This repository contains implementations of various design patterns in Java, using animals and birds as examples.

## A. Structural Patterns

### 1. Adapter Pattern

#### Description:
The Adapter pattern allows objects with incompatible interfaces to collaborate. Here, we have used an example of adapting a Bird to a ToyDuck interface using an Adapter.

#### Implementation:
- **Classes**: `Bird`, `Sparrow`, `ToyDuck`, `PlasticToyDuck`, `BirdAdapter`, `AdapterPattern`
- **Demo**: `AdapterPattern`

### 2. Facade Pattern

#### Description:
The Facade pattern provides a unified interface to a set of interfaces in a subsystem. Here, we simplify interactions with a zoo using a `ZooFacade`.

#### Implementation:
- **Classes**: `Lion`, `Elephant`, `Monkey`, `ZooFacade`, `FacadePattern`
- **Demo**: `FacadePattern`

### 3. Proxy Pattern

#### Description:
The Proxy pattern provides a surrogate or placeholder object, which controls access to another object. Here, we have a `ProxyLion` controlling access to a `RealLion`.

#### Implementation:
- **Classes**: `Lion`, `RealLion`, `ProxyLion`, `ProxyPattern`
- **Demo**: `ProxyPattern`

## B. Creational Patterns

### 1. Singleton Pattern

#### Description:
The Singleton pattern ensures a class has only one instance and provides a global point of access to it.

#### Implementation:
- **Classes**: `AnimalKingdom`, `SingletonPattern`
- **Demo**: `SingletonPattern`

### 2. Factory Pattern

#### Description:
The Factory pattern provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created.

#### Implementation:
- **Classes**: `Animal`, `Dog`, `Cat`, `AnimalFactory`, `FactoryPattern`
- **Demo**: `FactoryPattern`

### 3. Builder Pattern

#### Description:
The Builder pattern separates the construction of a complex object from its representation, allowing the same construction process to create different representations.

#### Implementation:
- **Classes**: `Animal`, `Animal.Builder`, `BuilderPattern`
- **Demo**: `BuilderPattern`

## C. Behavioural Patterns

### 1. Chain of Responsibility Pattern

#### Description:
The Chain of Responsibility pattern allows an object to send a command without knowing what object will receive and handle it. Here, we handle requests for different types of animals.

#### Implementation:
- **Classes**: `AnimalHandler`, `LandAnimalHandler`, `WaterAnimalHandler`, `Lion`, `Elephant`, `Dolphin`, `Shark`, `ChainOfResponsibilityPattern`
- **Demo**: `ChainOfResponsibilityPattern`

### 2. Memento Pattern

#### Description:
The Memento pattern provides the ability to restore an object to its previous state. Here, we save and restore the state of an `Animal`.

#### Implementation:
- **Classes**: `AnimalMemento`, `Animal`, `Caretaker`, `MementoPattern`
- **Demo**: `MementoPattern`

### 3. Observer Pattern

#### Description:
The Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

#### Implementation:
- **Classes**: `Subject`, `AnimalSubject`, `Observer`, `LandAnimalObserver`, `WaterAnimalObserver`, `ObserverPattern`
- **Demo**: `ObserverPattern`

## Running the Examples

Each pattern has a demo class (`PatternNamePattern`) with a `main` method. You can compile and run these demos individually to see the patterns in action.

### Example:
To run the Singleton Pattern demo:
```sh
javac SingletonPattern.java
java SingletonPattern

