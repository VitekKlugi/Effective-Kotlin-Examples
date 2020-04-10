# Effective Kotlin - poznámky, příklady a pokusy

## Good Code
### Safety - Item 1 - 10
#### Item 1 - limit mutability
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

### Readability - Item 11 - 18

## Code Design
### Reusability Item 19 - 25
### Abstraction desing Item 26 - 32
### Object creation Item 33 - 35
### Class Design Item 36 - 44

## Efficiency
### Make it cheap Item 45 - 48
### Efficinet collection processing Item 49 - 52 