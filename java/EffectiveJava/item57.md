# Minimize the scope of Local variables

- Declare the local variable when it's first used.
- Nearly every local variable declaration should contain initializer.
- Use traditional `for` loop or `for-each` loop instead of `while loop`
  - You can declare local variable inside `for` loop's scope and that's not possible with `while` loop
- Keep methods small and focused