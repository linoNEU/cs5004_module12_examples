# CS 5004: Object-Oriented Design - Module 4 Exercise

## Overview
This repository contains Java code that demonstrates the use of the Iterator design pattern within the context of a recycling center application. The application models two recycling centers, `Green Earth Recycling Center` and `Eco Recycle Facility`, each managing a collection of recyclable items. The primary focus is on iterating over these collections in a uniform manner, despite the differences in their underlying data structures.

## Exercise Instructions

### Part 1: UML Diagram Review
Students are provided with a UML diagram representing the classes and interfaces in this project. Your first task is to:
- Describe the UML diagram to one of your peers. Focus on the relationships between the `RecyclableCollection` interface, the concrete classes that implement this interface, and the iterator classes.

### Part 2: Understanding Specific Implementations
After reviewing the UML diagram and the provided code, discuss the following:
- Explain why a specific iterator class (`Green Earth Recycling Center Iterator`) was created for the `Green Earth Recycling Center` but not for the `Eco Recycle Facility`. Consider the differences in their data structures and how Java's built-in mechanisms come into play.

### Part 3: Advantages of the Iterator Pattern
By studying the `Main` driver class and its usage of iterators to traverse through collections of recyclable items, describe:
- The advantages of using the iterator pattern, especially in terms of abstraction, encapsulation, and the ease of modifying underlying data structures without affecting client code.

## Learning Objectives
- Understand and apply the Iterator design pattern in a practical context.
- Recognize the benefits of design patterns in software development for achieving cleaner, more maintainable code.
- Enhance skills in object-oriented analysis and design, with a focus on interfaces and class relationships.

## Getting Started
To get started with this exercise, clone this repository and review the `src` directory for the Java code files. Pay special attention to the implementation details of the iterator pattern within the project.

## Submission Guidelines
After completing the exercise, submit a document containing your explanations for Part 2 and Part 3, along with any observations or questions you might have about the design pattern's application in this project.