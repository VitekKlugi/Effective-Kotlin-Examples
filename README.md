# Effective Kotlin - poznámky, příklady a pokusy

## Good Code
### Safety - Item 1 - 10
#### Item 1: limit mutability
* Mutation point
    * potential conflict - [MutableVarInCoroutine.kt](src/goodcode/safety/item1/MutableVarInCoroutine.kt)
* Read Only Property
    * can mutate - [ReadOnlyPropertiesCanMutate.kt](src/goodcode/safety/item1/ReadOnlyPropertiesCanMutate.kt)
    * final property - [FinalProperty.kt](src/goodcode/safety/item1/FinalProperty.kt)
    * copy in data classes - [CopyInDataClass](src/goodcode/safety/item1/CopyInDataClass.kt)
* Separation between mutable and read-only collections
    * never downcast immutable collection - [NeverDownCastImmutableCollection.kt](src/goodcode/safety/item1/NeverDownCastImmutableCollection.kt)
    * multiple mutation points - [MultipleMutationPoints.kt](src/goodcode/safety/item1/MultipleMutationPoints.kt)
* Do not leak mutation points
    * a defensive copy for standard objects
    * for collections upcast to readonly interfaces
#### Item 2: Minimize the scope of variables
* Use local variables instead of properties
* Use variables in the narrowest scope possible
    * Destructuring declarations can help - [DestructuringDeclarationHelpNarrowTheScope.kt](src/goodcode/safety/item2/DestructuringDeclarationHelpNarrowTheScope.kt)
    * Capturing - [PrimeNumbers.kt](src/goodcode/safety/item2/PrimeNumbers.kt)
        * Sieve of Eratosthenes
#### Item 3: Eliminate platform types as soon as possible
* Platform type - a type that comes from another language and has unknown nullability
* Platform vs. stated type - [PlatformVsStatedType.kt](src/goodcode/safety/item3/PlatformVsStatedType.kt)
#### Item 4: Do not expose inferred types
* inferred type exposition can be really dangerous - [DangerousInferredTypeExposion.kt](src/goodcode/safety/item4/DangerousInferredTypeExposion.kt)
#### Item 5: Specify your expectations on arguments and state
* require block - a universal way to specify expectations on arguments.
    * lazy message
    * smart cast - contract
* check block - a universal way to specify expectations on the state.
* assert block - a universal way to check if something is true. Such checks on the JVM will be evaluated only on the testing mode.
* Elvis operator with return or throw - popular for null check
    * [ElvisReturn.kt](src/goodcode/safety/item5/ElvisReturn.kt)
#### Item 6: Prefer standard errors to custom ones
* IllegalArgumentException and IllegalStateException - expectations on arguments and state
* IndexOutOfBoundsException
* ConcurrentModificationException
* UnsupportedOperationException
* UnsupportedOperationException
    * should be avoided - Interface Segregation Principle
        * no client should be forced to depend on methods it does not use
* NoSuchElementException
#### Item 7: Prefer null or Failure result when the lack of result is possible
* we should prefer returning null or Failure when an error is expected
    * Result as a sealed class - [ReturnFailure.kt](src/goodcode/safety/item7/ReturnFailure.kt)
    * getOrNull - as an example in stdlib - [GetOrNull.kt](src/goodcode/safety/item7/GetOrNull.kt)
* throwing an exception when an error is not expected
    * The way exceptions propagate is less readable for most programmers and might be easily missed in the code.
    * In Kotlin all exceptions are unchecked. Users are not forced or even encouraged to handle them. They are often not well documented. They are not really visible when we use an API.
    * Because exceptions are designed for exceptional circumstances, there is little incentive for JVM implementers to make them as fast as explicit tests.
    * Placing code inside a try-catch block inhibits certain optimizations that compiler might otherwise perform.
### Item 8: Handle nulls properly
* Handling nulls safely
    * 

### Readability - Item 11 - 18

## Code Design
### Reusability Item 19 - 25
### Abstraction desing Item 26 - 32
### Object creation Item 33 - 35
### Class Design Item 36 - 44

## Efficiency
### Make it cheap Item 45 - 48
### Efficinet collection processing Item 49 - 52 