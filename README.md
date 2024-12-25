# Mous Language

A high level, dynamically typed, interpreted programming language, designed as a member of the C family of programming languages.
Uses tracing garbage collection for automatic memory management.

## Hello World
```
print "Hello, Mous!";
```

## Data Types

### Boolean: Good ol' true and false
```
true;
false;
```

### Numbers: Double precision floating point numbers
```
1234;
12.34;
```

### Strings: String literals
```
"Hello, Mous!";
```

### Nil: Represents the absence of a value

## Expressions

### Arithmetic

Basic arithmetic operations are supported: `+`, `-`, `*`, `/`.
```
add + me;
subtract - me;
multiply * me;
divide / me;
```

### Comparison and Equality

Comparing numbers
```
less < than;
lessThan <= orEqual;
greater > than;
greaterThan >= orEqual;
```

Testing the equality of two values (even different types, which would always return false)
```
equal == to;
notEqual != to;
123 == "123"; 
```

### Logical

Uses the prefix operators `!` for negation, `and` for conjunction, and `or` for disjunction.
```
!true
!false
true and false;
true and true;
false or false;
true or false;
```