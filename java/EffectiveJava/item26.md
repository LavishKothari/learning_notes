# Don't use raw types

## What will you learn?

* Erasure
* Unbounded wildcard types
* Recursive type bound

## Introduction to Java Generics

* Generics introduced in Java 5.
* What was happening before generics?
  * Before Java 5 (before generics) you were suppoed to cast every object when you read an object from Collection.
  * If a wrong object was inserted into the collection, this casting will fail at runtime with a `ClassCastException`.
  * We should follow a fail-fast approach.
* With generics, Compiler inserts casts for you, and fails at compile time instead of runtime - fail-fast approach.

* A class can have single or multiple `type-parameters`.
  * For example, `java.util.List` has one type-parameter that represents the type of object to be sotred in the list. Similarly `java.util.Map` has 2 type parameters (one for key and one for value)

* If you use raw types, you lose all the safety and expressiveness benefits of generics.
* Raw types are permitted for pre Java5 compatibility. This is called **Migration compatibility**
* Generics are implemented using **erasure**

### What is the difference between `List`, `List<Object>` and `List<?>`

The following code has no compile-time error. But when you retrieve the elements from the list, you don't know what type it is and you can get `ClassCastException`

```java
List list = new ArrayList();
list.add(Boolean.TRUE);
list.add("hello");
```

### Where should you legitimately use raw types?

* You must use raw types in class literals
* Use raw types with `instanceof` operator. `obj instanceof Set` is exactly same as `obj instanceof Set<?>`. Also note that `obj instanceof Set<String>` will give compile time error.

### Problems added by erasure

For a type parameter `T`, you can't write a class literal `T.class`. You can't use `instanceof` to test if an object is of type `T`. And you can't create an array of `T`. But it gets worse. You also can't write class literals for generic types like `List<String>.class`, or test if an object is an `instanceof` `List<String>`, or create an array of `List<String>`.

[Must read article](http://gafter.blogspot.com/2006/11/reified-generics-for-java.html) on ore problems.