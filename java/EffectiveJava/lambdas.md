## When to use annonymous classes instead of lamdas?

* Abstract classes cannot be instantiated using lambdas.
* Lamdas are only useful with interface which have only one method - **functional interfaces**
* A lambda cannot obtain reference to itself

```java
class Person {

    public void doSomething() {
        Function<String, Integer> func = s -> {
            System.out.println(this.toString()); // print - In Person -> toString of Person class
            return Integer.valueOf(3);
        };

        Function<String, Integer> otherFunc = new Function<>() {
            @Override
            public Integer apply(String s) {
                System.out.println(this.toString()); // will print - in function's annonymous class
                return Integer.valueOf(4);
            }

            @Override
            public String toString() {
                return "in function's annonymous class";
            }
        };


        func.apply("sdf");
        otherFunc.apply("sdf");

    }

    @Override
    public String toString() {
        return "In Person";
    }
}
```