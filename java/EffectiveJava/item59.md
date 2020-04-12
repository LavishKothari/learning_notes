# Use the existing libraries to the extent possible
- Benefits:
  - You get the advantage of knowledge of experts who wrote it
  - You also take advantage of experience of experts who used it
  - You don't have to waste your time writing ad-hoc solutions and reinvent the wheel
  - For standard libraries, their performance tend to improve over time
    - You will get this for free.
  - Any bug fixes will be available to you for free
  - Any additional new features will be available for free
  - When you use an existing library function, your code becomes more 
    - readable 
    - reusable 
    - maintainable by magnitude of developers
    
Other Suggestions:
- If you require some functionality that's not available in Java's standard library, go for some high quality third party library like Google's Guava library 
    
Other learnings from this item:
- Use `Ramdom#nextInt(int)` to get a bounded random number.
- Avoid using `Random`, instead use 
  - `ThreadLocalRandom`
  - In case of fork join pool and multi-threaded environment, use `SplittableRandom`
- `InputStream#transferTo`
  - added in Java 9