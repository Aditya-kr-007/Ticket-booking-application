# Train Ticket Booking System

A Java command-line application that simulates core train ticket booking workflows such as user signup, login, train search, seat availability, seat booking, and booking cancellation.

## Features

- User signup and login
- Password hashing with BCrypt
- Train search by source and destination
- Seat availability display
- Seat booking and cancellation flow
- Local JSON persistence for users and trains

## Tech Stack

- Java 17
- Gradle
- Jackson Databind
- BCrypt
- JUnit

## Run Locally

```powershell
.\gradlew.bat run
```

## Run Tests

```powershell
.\gradlew.bat test
```

## Project Structure

```text
app/src/main/java/ticket/booking
├── App.java
├── entities
├── service
├── util
└── localDb
```
