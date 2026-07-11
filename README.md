# Practical Task: Animal Shelter Console App

Starter project for M3A practical task: Create a simple Java console application for managing animals in an animal shelter.

## Task
Complete all of the 'TODO' portions of the code. Finished application should support:
- Adding a new animal
- Listing all animals
- Searching animals by species
- Marking an animal as adopted
- Displaying only available animals

## OOP Requirements
- Class anatomy: fields, constructors, methods
- Object isntantiation and usage
- Constructor overloading
- Immutable class usage (AnimalId)
- Lombok usage for reducing boilerplate
- A basic sealed class hierarchy
- Generic (Shelter<T>) class that stores animals

## Project Structure
``` text
src
├── Main.java
├── menu/
│   └── ConsoleMenu.java
│   └── MenuOption.java
├── model/
│   ├── Animal.java
│   ├── Dog.java
│   ├── Cat.java
│   ├── Bird.java
│   ├── AnimalId.java
│   └── AdoptionStatus.java
└── shelter/
    └── Shelter.java
```
## Stretch goals
- Add a new animal type without modifying existing functionality
- Allow sorting animals by age or name
- Validate user input (no empty names, age cannot be negative etc.)
- Create a generic utility class for searching and filtering collections (Average animal age, Oldest animal, Number of animals of each species etc.)
- Add adoption history that tracks:
    - Animal
    - Adoption Date
    - Adopter Name
## Teacher's comments
``` text
AnimalId is a good class to have its equals() method overridden, to compare ID strings directly instead of comparing values in shelter class. getAllAnimals() returns the original list, so outside code could change shelter contents directly. Safer would be returning a copy. markAsAdopted() does not tell whether an animal was actually found, so menu prints "marked as adopted" even for a wrong ID. start() method is getting long, good rule if possible it should fit in a screen, by possible -> have you tried extracting a method. Even if an if statement, that is followed by single line of code is permitted by syntax, it is always preferred to still use {}. Comparing enums with == is valid, however prefer to use equals anyway and start from given value to avoid NPE -> AdoptionStatus.AVAILABLE.equals(animal.getAdoptionStatus()).
```
