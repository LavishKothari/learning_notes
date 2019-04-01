# A list of all learnings in Java

* `SuppressWarnings` - Effective Java - Item27
* `SafeVarArgs` - Effective Java Item32
* `Serializable` and `Externalizable`
* Singleton using enum
* the order in which static fields are defined in class matters
* you can have multiple static initializer blocks in a class
* `Supplier`
* concept of **reifiable**
  * Arrays are reifiable and generics are non-reifiable
    * If the element type of the array is not reifiable, then you will get warning.
  * a non-reifiable type is one whose runtime representation contains less information than its compile-time representation
* source and binary compatibility
* double locking - lazy initialization
* benefits of **immutability**
  * You can do caching
  * thread safety - easily pass an immutable objects to different threads.
* If a method is stateless consider making it static?
* Recursive type bound
* Unbounded wildcard types
* **heap pollution** - the following code gives `ArrayStoreException`

```java
Number[] numbers = new Integer[5];
numbers[0] = 1;
numbers[1] = 5.01; // heap pollution
```

* Covariant and invariant
  * Arrays are covariant, and generics are invariant.
* **covariance** - `? extends T` - you can read/get but cannot write/add/put
* **Contravariance** - `? super T` - you can write/add/put elements but cannot read/get

```java
private static class A {}
private static class B extends A {}
private static class C extends B {}

private static void someMethod(List<? super C> list) {
    list.add(new C());
    list.add(new B()); // will give compile-time error
}
```

* **PECS stands for producer- extends , consumer- super**.