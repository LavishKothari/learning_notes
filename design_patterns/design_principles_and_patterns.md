* [Design Principles and patterns](#design-principles-and-patterns)
  * [UML nomenclature](#uml-nomenclature)
  * [APIE Object oriented features](#apie-object-oriented-features)
  * [SOLID principles for Object oriented design](#solid-principles-for-object-oriented-design)
    * [Explanation](#explanation)
    * [Interface segregation principle](#interface-segregation-principle)
  * [Design Patterns](#design-patterns)
    * [Factory pattern](#factory-pattern)
    * [Strategy Pattern](#strategy-pattern)
    * [Singleton pattern](#singleton-pattern)
      * [Implementations](#implementations)
        * [Eager object creation](#eager-object-creation)
        * [Lazy object creation](#lazy-object-creation)
        * [Thread safe lazy creation](#thread-safe-lazy-creation)
        * [Double checked locking lazy](#double-checked-locking-lazy)
        * [Using inner static class lazy](#using-inner-static-class-lazy)
        * [Singletons using enum in Java](#singletons-using-enum-in-java)
      * [Caution points](#caution-points)
    * [Decorator pattern](#decorator-pattern)
    * [Adapter Pattern](#adapter-pattern)
    * [Facade Pattern](#facade-pattern)
    * [Proxy Pattern](#proxy-pattern)
    * [Builder Pattern](#builder-pattern)
    * [Observer Pattern](#observer-pattern)
    * [Bridge Pattern](#bridge-pattern)

# Design Principles and patterns

## UML nomenclature

* `------|>` stands for `is-a`
* `------->` stands for `has-a`

## APIE Object oriented features

* **A** - Abstraction
* **P** - Polymorphism
* **I** - Inheritance
* **E** - Encapsulation

## SOLID principles for Object oriented design

* **S** - Single responsibility principle
* **O** - Open-closed principle
* **L** - Liskov substitution principle
* **I** - Interface segregation principle
* **D** - Dependency Inversion principle

### Explanation

* **Single resposibiility principle** - A class should have one and only one job.
* **Open-closed principle**  - Open for extension but closed for modification
  * Open for extension means adding new features without breaking the existing features
  * Closed for modification means we should not introduce breaking changes in the existing code.
* **Liskov substitution principle** - All this is stating is that every subclass/derived class should be substitutable for their base/parent class.
* **Interface segregation principle** - A client should never be forced to implement an interface that it doesn’t use or clients shouldn’t be forced to depend on methods they do not use.
* **Dependency Inversion principle** - Two main ideas:
  * High level modules should not depend on low-level modules (implementations)
  * Abstractions should not depend on details, details should depend on abstractions.

### Interface segregation principle

```java
public interface Beverage {

    void getDescription();
    double getCost();

    boolean hasMilk();
    boolean hasChocolate();
}
```

```java
public class Coffee {

}
```

```java
public class Tea {

}
```

Tea should not have the method called `hasChocolate()`. If you have `Tea` class then `hasChocolate` in it makes no sense.

So it's better to have multiple smaller interfaces rather than having a single large interface with many methods.

## Design Patterns

### Factory pattern

* When you are about to instantiate, lets abstract this instantiation. So the instantiation is uniform every-where.
  * The instantiation can be complex.
  * Which concrete implementation you want to construct
  * From the factory you just simply return a sub-type of object needed.

Example:

* Let us consider that you have an interface `Animal` and it's concrete implementations are `Cat`, `Dog` and `Lion`.
* You have an interface called `AnimalFactory` and it's concrete implementations are `RandomMamalFactory`, `RandomBirdFactory`, `RandomAnimalFactory` etc.

```java
public interface Animal {

}

public class Cat implements Animal {

}

public class Dog implements Animal {

}

public class Lion implements Animal {

}
```

```java
public interface AnimalFactory {
    Animal createAnimal();
}

// creates a random animal
public class RandomAnimalFactory {
    @Override
    public Animal createAnimal() {
        ...
    }
}

// creates a random Bird
public class RandomBirdFactory {
    @Override
    public Animal createAnimal() {
        ...
    }
}

// creates a random Mamal
public class RandomMamalFactory {
    @Override
    public Animal createAnimal() {
        ...
    }
}
```

Also see: https://github.com/LavishKothari/learning_notes/tree/master/java/item1

### Strategy Pattern

* It's about using **composition instead of inheritance**.
* Inheritance breaks abstraction.
* Strategy pattern defines a family of algorithms, encapsulates each one and makes them interchangable.
  * You have many algorithms and you can plug and play the algorithm.
* Strategy pattern decouples the algorithms from the clients who use them.
  * Clients don't need to change when some of the algorithm changes.

Example:

* `List` don't contain the sorting algorithm, rather you inject the sorting strategy so that you can sort the `List` on the basis of injected sorting strategy.
* `List` `has-a` sorting strategy

```java
// abstract strategy
public interface SortingStrategy {
    void sort(List list);
}

// concrete strategy that sorts recursively
public class RecursiveSortingStrategy implements SortingStrategy {
    @Override
    public void sort(List list) {
        // ...
    }
}

public class IterativeSortingStrategy implements SortingStrategy {
    @Override
    public void sort(List list) {
        // ...
    }
}

public class DivideAndConquerSortingStrategy implements SortingStrategy {
    @Override
    public void sort(List list) {
        // ...
    }
}

public class RandomAccessSortingStrategy implements SortingStrategy {
    @Override
    public void sort(List list) {
        // ...
    }
}
```

```java
// can't do random access on this type of list
public interface LinkedList {
    private SortingStrategy sortingStrategy; // has-a relationship

    public List() {
        this.sortingStrategy = new IterativeSortingStrategy();
    }

    public List(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort() {
        // sort using this.sortingStrategy
        sortingStrategy.sort(this); // delegation
    }
}
```

```java
// can do random access on this type of list
public interface ArrayList {
    private SortingStrategy sortingStrategy; // has-a relationship

    public List() {
        this.sortingStrategy = new RandomAccessSortingStrategy();
    }

    // injecting using constructor
    public List(SortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    public void sort() {
        // sort using this.sortingStrategy
        sortingStrategy.sort(this); // delegation
    }
}
```

Now suppose that you again have a `ElementRemovalStrategy`. And you can simply go forward and implement different concrete types of `ElemenetRemovalStrategy`.

The main idea is that you can re-use the different `SortingStrategy` in different types of list. And this is what by which you can avoid code duplication, which was not possible if you were not using strategy-pattern.

### Singleton pattern

* Ensures that the class has only has one instance and provides a global access to that single instance.
* Makes it impossible to create a second instance of a singleton class.

Demerits of Singleton pattern:

* Global scope of singleton object. You don't know the scope of this instance. Any piece of code in the code can change this instance.
* Singletons make unit testing very difficult. Mocking becomes difficult.
* You have only one single instance - if your application is growing, you might need more instances insted of a single instance.
* **breakes the single responsibility principle**. You are now asking your singleton class to do the following three things:
  * Create one single instance
  * Make it impossible to create more than one instance.
  * Provide all the functionality that is expected out of this class.

It's completely fine to just have a single instance of a class in your design, but it is not okay if you force to have just one instance. It's not a good idea to make it completely impossible to create a second instance.

* Make the constructor of the singleton class as private.
* Use static method to create the singleton object for the first time and ensure that on each subsequent calls to get the instance, we return the same instance.

```java
public class SomeSingleton {
    private static SomeSingleton object;

    // outside code can't call this constructor
    private SomeSingleton() {

    }

    public static getInstance() {
        if(object == null) {
            object = new SomeSingleton();
        }
        return object;
    }

    // .. other responsibilities of this class
}
```

To get the singleton object you will do something like: `SomeSingleton.getInstance()`.

#### Implementations

##### Eager object creation

```java
public class SomeSingleton {
    private static SomeSingleton object = new SomeSingleton(); // eager creation

    // outside code can't call this constructor
    private SomeSingleton() {
        // ...
    }

    public static getInstance() {
        return object;
    }

    // .. other responsibilities of this class
}
```

##### Lazy object creation

```java
public class SomeSingleton {
    private static SomeSingleton object;

    // outside code can't call this constructor
    private SomeSingleton() {

    }

    public static getInstance() {
        if(object == null) {
            object = new SomeSingleton(); // lazy creation 
        }
        return object;
    }

    // .. other responsibilities of this class
}
```

##### Thread safe lazy creation

```java
public class SomeSingleton {
    private static SomeSingleton object;

    // outside code can't call this constructor
    private SomeSingleton() {

    }

    public static synchronized getInstance() {
        if(object == null) {
            object = new SomeSingleton(); // lazy creation 
        }
        return object;
    }

    // .. other responsibilities of this class
}
```

The above type of thread-safe lazy creation is very costly as it will cause contention every time when we call `SomeSingle.getInstance`. (But we want mutual exclusion only for the fist time when the object is created and not every other time.)

##### Double checked locking lazy

```java
public class SomeSingleton {
    private static SomeSingleton object;

    // outside code can't call this constructor
    private SomeSingleton() {

    }

    public static  getInstance() {
        if(object == null) {
            synchronized(SomeSingleton.class) {
                if(object == null)
                    object = new SomeSingleton(); // lazy creation 
            }
        }
        return object;
    }

    // .. other responsibilities of this class
}
```

##### Using inner static class lazy

* lazy initialization

```java
public class SomeSingleton {

    private SomeSingleton() {
        // ...
    }

    private static class InnerClass {
        public static INSTANCE = new SomeSingleton();
    }

    public static getInstance() {
        return InnerClass.INSTANCE;
    }
}
```

##### Singletons using enum in Java

* Eager initialization

```ava
public enum SomeSingleton {
    INSTANCE;

    public static void doSomething() {

    }
}
```

#### Caution points

* Deserialization can create a new instance.
* So it destroys the singleton pattern, to overcome this scenario all we need to do it provide the implementation of `readResolve()` method.

```java
protected Object readResolve() {
    return getInstance();
}
```

### Decorator pattern

* Just calling a method (that method performs some action/ corresponds to some behavior of the class)
* You have a wrapper which wraps the original object. This wrapper is called `decorator`.

**The decorator patterns attaches additional responsibilities to an object dynamically (at runtime). Decorators provides a flexible alternative to sub-classing for extending functionality.**

**To share behavior use composition instead of inheritance.**

**Use decorator pattern to avoid class explosion.**

**Adds behavior.**

```java
public interface Beverage {
    double getCost();
}

public class Decaf implements Beverage {
    @Override
    public double getCost() {
        // ... returns the baseline cost
        return 1.2;
    }
}

public class Espresso implements Beverage {
    @Override
    public double getCost() {
        // ... returns the baseline cost
        return 2.0;
    }
}
```

```java
// is-a
public abstract class AddonDecorator implements Beverage {
    Beverage beverage; // has-a
    // this is wrapping beverage and is agnostic of what specific beverage
}

public class CaramelDecorator extends AddonDecorator {
    public CaramelDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
    @Override
    public double getCost() {
        // ...
        return 0.5 + this.beverage.getCost();
    }
}

public class SoyDecorator extends AddonDecorator {
    public SoyDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        // ...
        return 0.8 + this.beverage.getCost();
    }
}
```

code showing how you can construct complex `Beverage`

```java
Beverage espresso = new Espresso();
Beverage soyEspresso = new SoyDecorator(espresso);
Beverage caramelSoyEspresso = new CaramelDecorator(soyEspresso);
// creating objects dynamically at runtime and avoid class explosion.
System.out.println(caramelSoyEspresso.getCost()); // 3.3
```

Example of decorator pattern in Java - `InputStream` and `BufferedInputStream`

Decorator pattern is useful when you have significant behavioural difference instead of just different properties.

### Adapter Pattern

* Making two interfaces compatible that aren't compatible
* **Wrapper pattern**

Definition:

* The adapter pattern converts the interface (contract) of a class into another interface that the clients expects
* Adapter lets classes work together that couldn't otherwise becasue of incompatible interfaces/contract.

Possible scenario where you can use this:

Suppose you want to use some library but you may go with some other alternative of this particular library in future. For this you can use adapter pattern where your adapter wraps the adaptee (the current library that you want to use) and if in future we want to switch to a different alternative, you just need to change the adapter/wrapper rather then changing all the places where this library is used.

The intention is not to add/alter/remove the behavior. You just have 2 different types of interfaces and want to make them compatible.

```java
// the contract that client will need (this contract don't change)
public interface Target {
    void request();
}

public class Adapter implements Target {
    private Adaptee adaptee; // composition
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest(); // delegating to adaptee
    }
}

// external library
public class Adaptee {
    public void specificRequest() {
        // ...
    }
}
```

### Facade Pattern

For hiding the complexity and actual implementation details

### Proxy Pattern

You may want to use it because of security or caching

### Builder Pattern

See item of Effective Java.

### Observer Pattern

Definition:

**The observer pattern defines a one-to-many dependency between objects so that one object changes state, then all the dependencies are notified.**

* Observer pattern is about moving from poll architecture to push architecture
* Concept of subscriber - but here subscriber don't poll, rather than that the field/state on which the subscription was there initially, that state change is pushed now to the subscriber. *The subsriber is notified of the state change.*
* Where there are tons of subscriber, then poll can be really absurd. So here we apply push architecture.
* **Subject/Observable** is being **observed** by the **subscribers**.
* Before this subscription can work, all the **subscribers** should **register** themselves to the **Subject/Observable**.
* When the state of **Subject/Observable** changes the  **subscribers/observers** are **notified**.

Example/Use case:

**Observer pattern is very suitable for a chat kind of application.** Suppose that there are some users who are registered to a chatroom, then whenever some new message/update is done to the chat-room then all the members of that chat-room should be notified. (It should never be the case that the users registered in the chat room are polling on a regular basis to see if there's something new that has happened in the chat-room.)

```java
package observer.pattern;

public interface Observable<T> {
    void register(Observer observer);

    void unregister(Observer observer);

    void notifyAllObservers();

    T getState();

    void setState(T state);
}
```

```java
package observer.pattern;

public interface Observer {
    <T> void update(Observable<T> observable);
}
```

```java
package observer.pattern;

import java.util.HashSet;
import java.util.Set;

public class ConcreteObservable<T> implements Observable<T> {

    private Set<Observer> observers = new HashSet<>();

    private T state; // we need to observe the state of this object

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObservers() {
        observers.stream()
                .forEach(observer -> observer.update(this));
    }

    @Override
    public T getState() {
        return state;
    }

    @Override
    public void setState(T newState) {
        this.state = newState;
        notifyAllObservers();
    }
}
```

```java
package observer.pattern;

import java.util.concurrent.atomic.AtomicInteger;

public class ConcreteObserver implements Observer {

    private static final AtomicInteger idGenerator = new AtomicInteger();
    private final int id;

    public ConcreteObserver() {
        this.id = idGenerator.incrementAndGet();
    }

    @Override
    public <T> void update(Observable<T> observable) {
        // here you can use observable to get the state that has changed.
        System.out.println("observer " + id + " is updated.");
    }
}
```

### Bridge Pattern

Definition:

**The intent of the bridge pattern is to decouple an abstraction from it's implementation so that the two can exist/vary independently.**

```java
public interface Implementor {

}

public class ConcreteImplementorA implements Implementor {

}

public class ConcreteImplementorB implements Implementor {

}

public class ConcreteImplementorC implements Implementor {

}

public abstract class Abstraction {
    Implementor implementor;
    // ...
}

public class ConcreteAbstractionA implements Abstraction {

}
public class ConcreteAbstractionB implements Abstraction {

}
```

Each `Abstraction` has-a `Implementor`. So just by designing 5 classes, you can actually have 3*2 = 6 different functionalities. (to avoid class explosion)

Real-time use case:

You have different product (like `Laptop`, `Book`, `Phone`) and you have different ways of displaying these media items - differnt views - `LongView` and `ShortView`.

Your requirement is to take any arbitrary media-resource and combine it with any arbitrary view.

```java
public interface Product {

}

public class Book implements Product {

}

public class Laptop implements Product {

}

public class Phone implements Product {

}

public abstract class View {
    Product product;
    void show();
}

public class LongView extends View {
    @Override
    public void show() {
        
    }
}

public class ShortView extends View {
    @Override
    public void show() {
        
    }
}
  
```

Suppose we didn't use Bridge-pattern in the above example, we'd have ended up creating 6 different classes which are: 

* `LongViewForBook`
* `LongViewForLaptop`
* `LongViewForPhone`
* `ShortViewForBook`
* `ShortViewForLaptop`
* `ShortViewForPhone`

This will get worse if we add more type of views and more products. So Bridge-pattern saved use here.

Bridge-pattern also avoid code-duplication. If you introduce some bug in `LongView` then you will have to update `LongViewForBook`, `LongViewforLaptop` and `LongViewForPhone` if you are not using Bridge-pattern. And if you are using bridge pattern, then you need to change only one class and that is `LongView`.