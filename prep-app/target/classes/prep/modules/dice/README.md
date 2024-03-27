Write a class with a score() method that accepts an array of dice values (up to 6). Scoring rules are as follows:
• A single one (100)
• A single five (50)
• Triple ones [1,1,1] (1000)
• Triple twos [2,2,2] (200)
• Triple threes [3,3,3] (300)
• Triple fours [4,4,4] (400)
• Triple fives [5,5,5] (500)
• Triple sixes [6,6,6] (600)

Note that the scorer should work for any number of dice up to 6.
• Four-of-a-kind (Multiply Triple Score by 2)
• Five-of-a-kind (Multiply Triple Score by 4)
• Six-of-a-kind (Multiply Triple Score by 8)
• Three Pairs [2,2,3,3,4,4] (800)
• Straight [1,2,3,4,5,6] (1200)

# development

- Interfaces are used to facilitate dependency injection
- To assist mocking dependency injection, Helper classes are not instantiated in same place of use
- helper methods are drawn out to separate class. This way they are only known to the client class and not likely to be incorrectly used where not required

# Unit Tests

Where arrays are checking, and the size of the array is relevent, the size "should" be chaecked, but can be dropped
for reasons

- Tech debt
- Performance
- code bloat
  Business decision that the "assumption" that the check is done elsewhere is sufficient,

## Interfaces 
Interfaces are used to facilitate Dependency Injection. Ordinarily Dependency injection 
would be used throughout so that any error only occurs in the relevant test. An exception
hase been made for the main class `DiceScore` to demonstrate the overall correctness of the 
solution.