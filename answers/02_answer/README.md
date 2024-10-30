# 💡 Exercise 2 - TDD

## 🎯 Objective
This exercise is designed to help you get familiar with using AI tools in the practice of test-driven development (TDD).

In TDD, unit tests are written before even writing the code itself. These tests define the expected behavior of the functions. Once the code is implemented, the tests validate its functionality.

In this exercise, you’ll work with the `DateTimeHelper` class, which provides utility functions for date processing with or without time. You will first write the tests for the desired functions, then implement the code for those functions.

## 🐾 Steps

### 1. Writing Functions from Unit Tests
For the first part of this exercise, you will implement processing functions for `LocalDate`. In the `DateTimeHelperTest` class, a series of unit tests define the expected behavior for three functions. Use these tests as a guide to implement the methods with the help of Continue.

- **Implement the `formatDate(LocalDate date)` method**:
  - Use the `testFormatDate_ValidDate` test already written in `DateTimeHelperTest`.
  - This method should accept a `LocalDate` object and return a `String` in the `yyyy-MM-dd` format.

- **Implement the `parseDate(String date)` method**:
  - Use the `testParseDate_ValidDate` test in `DateTimeHelperTest`.
  - This method should accept a `String` in the `yyyy-MM-dd` format and return a `LocalDate` object.

- **Implement the `formatDate(LocalDate date, String pattern)` method**:
  - Use the `testFormatDate_WithPattern` test in `DateTimeHelperTest`.
  - This method should accept a `LocalDate` object and a `String` representing the desired format (e.g., `yyyy-MM-dd`) and return a formatted `String`.

### 2. Writing Unit Tests Then Functions
In this second part, you will create tests for the `LocalDateTime` processing methods, then implement the functions to make them pass.

- **For the `formatDateTime(LocalDateTime dateTime)` function**:
  - Write a test `testFormatDateTime_ValidDateTime` that verifies that the `formatDateTime` function returns a string in the `yyyy-MM-ddThh:mm:ss` format for a given `LocalDateTime`, e.g., _"2024-08-31T08:46:00"_.
  - Then implement the `formatDateTime(LocalDateTime dateTime)` function to pass the test.

- **For the `parseDateTime(String dateTimeString)` function**:
  - Write a test `testParseDateTime_ValidDateTime` that checks that a string in the `yyyy-MM-ddThh:mm:ss` format is correctly converted into a `LocalDateTime` object, e.g., _"2024-08-31T08:46:00"_.
  - Write a test `testParseDateTime_InvalidDateTime` that verifies that a string in an incorrect format throws a `DateTimeParseException`, e.g., _"invalid-date"_.
  - Then implement the `parseDateTime(String dateTimeString)` function to pass the tests.

- **For the `formatDateTime(LocalDateTime dateTime, String pattern)` function**:
  - Write a test `testFormatDateTime_WithPattern` that checks that a given `LocalDateTime` and format pattern (e.g., `dd/MM/yyyy HH:mm:ss`) produce a formatted string, e.g., _"31/08/2024 08:46:00"_.
  - Then implement the `formatDateTime(LocalDateTime dateTime, String pattern)` function to pass the test.

## ✅ Answer
In the `DateTimeHelper` and `DateTimeHelperTest` classes, you will find the various functions and tests created for this exercise.

### 🚀 How to Run the Tests
Run Maven in the terminal to execute the tests:

```bash
mvn clean test
```