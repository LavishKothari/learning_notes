# Item1: Consider static factory methods instead of constructors
**Static factory method**: A static method that returns instance of the class

## Advantages of static factory method
1. **Unlike constructors they have names.** (**Improves readability**)
Example, `BigInteger(int, int, Random)` this method returns a `BigInteger` that is probably prime, same is done by this static factory method `BigInteger.probablePrime`
	- A class can have only one constructor with a given parameter list.
	- If for a class you require multiple constructors with same signature, consider replacing it with static factory method.
2. **Static factory methods don't require to create a new object each time they are invoked.**
	- This allows you to reuse **preconstructed objects**
	- Cache the instances and return already constructed objects. (**instance controlled classes**)
	- Flyweight pattern, ensuring that no two equal instances exists, `a.equals(b)` iff `a==b`
3. **Unlike constructors, static factory methods can return an object of any subtype of their return type.**
	- This lets you hide the implementation details. 
	- The class of subtype-object that you return from static factory methods need not be public. (**compact API**)
	- Interfaces provide natural return-types for the static factory methods and actual returned objects are subtypes.
	- Consider `Collection` interface and non-instantiable companion class `Collections`
		- `Collections.synchronizedList` returns an object of class that is not visible outside (but the return type is `java.util.List`) 
		- This reduces the burden on the user of this method (he/she now don't have to remember all the class-types that each method returns, instead he/she should just know the interface name.)
		- Bulk of the API reduced along with the conceptual weight to use the API
		- By static factory method, you can make client to refer to the returned object by interface instead of specific concrete class (this is generally a good practice)
		- But now with Java8 interfaces can now have static methods.
			- so the static methods from Java8 onwards can be put in interface itself.
			- But it will be a good idea to put the implementation code behind these static methods in a package private class.
4. **Class of the returned object can vary from call to call (depending on the parameter to the static factory method.)**
	- If the concrete type of returned type is package private, then the type of returned object can also vary from **release to release**
		- Example `EnumSet` - It has no public constructors, has only static factory methods
		- Instance returned is either of `RegularEnumSet` or `JumboEnumSet` depending on the size of resulting EnumSet (<=64 then go for `RegularEnumSet` (backed by a single long) otherwise go for `JumboEnumSet`(backed by a long array))
		- Existence of these two implementation classes is invisible to the client
		- Future releases can change this implementation detail (basically the number 64)
5. **Class of the returned object need not to exist when the class containing the static factory method is written.**

## Disadvantages of using static factory method
1. **Classes without public or protected constructors cannot be sub-classed.**
	- Arguably it is a blessing as it favors composition over inheritance.
2. **Static factory methods are hard for the programmers to find.**
	- Difficult for the progrmmer to figure out how to instantiate the class.

## Common names for static factory methods
1. **from** `Date d = Date.from(format)`
2. **of** `EnumSet.of(RED, BLUE, GREEN)`
3. **valueOf** `BigInteger.valueOf(Integer.MAX_VALUE)`
4. **instance** or **getInstance**
5. **create** or **newInstance** `Array.newInstance`
6. **getType** `FileStore fileStore = Files.getFileStore(path)`
7. **newType** `BufferedReader br = Files.newBufferedReader(path)`
8. **type** `Collections.list`
