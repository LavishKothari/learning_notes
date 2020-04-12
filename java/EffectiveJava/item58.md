# Prefer for-each loop over traditional for loop
- No performance penalty
- less scope for errors
- clarity
- flexibilty
- bug prevention

3 situations when you can't use for-each loop:
- When you need to remove elements using `iterator`
- When you need to transform each element of your collection
- When you need to parallely traverse over more than one collections.

Other learnings from this Item:
- Collection interface extends Iterable
- Collection.removeIf removes elements based on the `Predicate` given in parameter to it.
