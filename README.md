# FitnessTracker (Java Console Application)

## Project Overview

**FitnessTracker** is a simple Java console-based application created to practice **Java programming and collaborative version control**.

The goal of the project was not only to build a small Java program but also to simulate **real-world developer collaboration using Git and GitHub**.

The application demonstrates basic Java concepts such as:

* Classes and Objects
* Inheritance
* Method Overloading
* Multi-file project structure

At the same time, the project was used to practice **team collaboration workflows**, including branching, pull requests, and merge conflict resolution.

---

## Project Structure

```
FitnessTracker
│
├── Main.java
├── Workout.java
├── Running.java
└── (future classes)
```

### File Descriptions

**Main.java**

* Entry point of the application
* Displays the menu and executes program flow

**Workout.java**

* Parent class that stores common workout details

**Running.java**

* Child class that extends `Workout`
* Demonstrates inheritance in Java

---

## Java Concepts Used

### 1. Inheritance

`Running` class extends `Workout`.

Example:

```java
class Running extends Workout {
    int distance;

    void showRunning() {
        System.out.println("Running distance: " + distance);
    }
}
```

### 2. Classes and Objects

Objects are created in `Main.java` to demonstrate usage of classes.

---

## Git Collaboration Workflow

The project was developed collaboratively using **Git and GitHub** to simulate real team development.

### Scenario 1 — Basic Collaboration

1. Developer A created the repository and pushed initial files:

   * `Main.java`
   * `Workout.java`

2. Developer B cloned the repository.

3. Developer B:

   * Modified `Main.java`
   * Created `Running.java`
   * Committed and pushed changes.

4. Developer A pulled the latest changes from GitHub.

This demonstrated **multiple developers working on the same repository**.

---

### Scenario 2 — Feature Branch Development

Instead of pushing directly to `main`, feature branches were used.

Example branch:

```
feature-user-menu
```

Steps followed:

1. Create branch from main
2. Modify code
3. Push branch to GitHub
4. Create Pull Request
5. Merge into main

This simulates **real industry workflows used in software teams**.

---

### Scenario 3 — Merge Conflict Simulation

To understand conflict resolution, both developers intentionally modified the same file.

Example:

Both developers edited:

```
Main.java
```

Git detected conflicting changes when merging the branches.

Conflict markers appeared like:

```
<<<<<<< HEAD
Developer A code
=======
Developer B code
>>>>>>> branch-name
```

The conflict was resolved manually and committed.

This helped understand how Git handles simultaneous edits.

---

## Problems Faced During Development

### 1. Code Changes Not Visible Locally

**Problem**

Developer A pulled the latest changes from GitHub, but the local IDE still showed the old code in `Main.java`.

However, GitHub displayed the updated version correctly.

**Cause**

The local file had uncommitted or conflicting changes, preventing Git from replacing the file automatically.

**Solution**

The issue was resolved using:

```
git restore Main.java
```

or by forcing the latest remote version:

```
git fetch
git reset --hard origin/main
```

This synchronized the local repository with the remote repository.

---

### 2. Understanding Branch Synchronization

Initially, there was confusion about why local code did not match GitHub.

This helped us understand the importance of:

```
git pull origin main
```

and verifying repository status with:

```
git status
```

---

## What We Learned

Through this project we learned:

* How developers collaborate using Git
* Branch-based development workflow
* Pull requests and code reviews
* Merge conflict detection and resolution
* Synchronizing local and remote repositories

---

## Future Improvements

Possible improvements to the project:

* Add **Cycling and Swimming workouts**
* Implement **Calorie Calculator**
* Add **user menu system**
* Store workouts using **file handling**

---

## Authors

## Contributors

| Name | GitHub |
|-----|------|
| Prashanth T  | [@Prashanthcoder](https://github.com/Prashanthcoder) |
| Manjunath A R | [@Manjunath-5717](https://github.com/Manjunath-5717) |

Collaborative project built for practicing **Java and Git workflows**.
