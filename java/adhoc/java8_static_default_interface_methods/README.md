# Static methods and Default methods in interfaces (from Java8 onwards)
Prior to Java 8 we could have only method declarations in interfaces.
## What we were missing prior to default methods?
- Tough to design interfaces, as once you make a public interface, you cannot then add methods to it, as the implemetation classes (classes that extend this interface) will start breaking once you add methods in interface.

## default methods (Virtual Extension methods / Defender methods)
```
public interface SomeInterface {
	default void defaultMethod() {
		// default implementation
	}
}
```
Now when a class implements `SomeInterface` it is *not mandatory* for that class to provide implementation of `defaultMethod`
If the implementation class wants, it can override the `defaultMethod`

### Diamond problem with default method
Consider the following scenario:
- Two interfaces with same default method signature
- A class implemeting both of the above two interfaces.
Which implementation of default method should be chosen?
**It is mandatory (mandated by compiler) to provide implementation of common default methods** (If you don't provide implementation of common default method, you'll get compilation error)

### Advantages of default methods in interfaces
- **Extending interfaces** is now possible
- **You don't need to create utility classes** (All methods of `java.util.Collections` class can now be put into `java.util.Collection` interface - this can't be done now as it will be a breaking change, but if default methods were allowed in interfaces when collection-framework was designed, then we could have considered this approach) 
- Enhanced collection API (in java 8) with **support for lambda expressions**.
	- you can write `list.forEach(a -> System.out.println(a));` where `list` is of type `List<SomeClass>`
	- `List<T>` extends 'Collection<T>' extends `Iterable<T>`
	- This `Iterable<T>` provides a default implementation of `forEach` method.

## static methods in interface
Rules
- You **must provide implementation**
- You **can't override them** in the classes that implements this interface.
	- This is done to avoid undesirable results due to poor implementation in the implementing classes
Benefits
- Good for providing utility methods
- We can get rid of Companion class (like `java.util.Collections` is the companion class of `java.util.Collection`)

