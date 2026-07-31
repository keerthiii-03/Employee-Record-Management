# Employee Records Management System

**RAMPeX Elite, Batch 14 — Console CRUD Project (Team 3)**

## Domain
HR Employee Records Management — a menu-driven Java console application that lets HR
staff add, view, search, update, and delete employee records during a single run.

- **Storage:** In-memory only (`ArrayList<Employee>`). No database, no file I/O.
- **Data is lost when the program exits** — this is expected per project scope.

## Entity Fields (`Employee`)

| Field        | Type   | Description                     |
|--------------|--------|----------------------------------|
| employeeId   | int    | Unique identifier for employee   |
| name         | String | Employee's full name             |
| department   | String | Department name                  |
| designation  | String | Job title / role                 |
| salary       | double | Monthly/annual salary            |

## Project Structure

```
EmployeeRecordsManagement/
├── README.md
└── src/
    ├── Employee.java         # Entity class (fields, constructor, getters/setters, toString)
    ├── EmployeeManager.java  # ArrayList + business logic (add/view/search/update/delete)
    └── Main.java             # Menu loop only — no business logic
```

## Features

- ✅ Add employee (rejects duplicate employee IDs)
- ✅ View all employees + headcount per department
- ✅ Search by department (case-insensitive)
- ✅ Update designation and/or salary by employee ID
- ✅ Delete employee by ID
- ✅ Exit
- ✅ Input validation — no crashes on invalid numbers, empty strings, or missing IDs

## How to Run

### Option A — VS Code (recommended)

1. Install the **Extension Pack for Java** in VS Code (includes Language Support for Java,
   Debugger for Java, Test Runner, Maven, and Project Manager).
2. Make sure you have a **JDK (11 or newer)** installed on your machine and that VS Code
   can detect it (`Java: Configure Java Runtime` in the Command Palette if needed).
3. Open the `EmployeeRecordsManagement` folder in VS Code (`File > Open Folder`).
4. Open `src/Main.java`.
5. Click **Run** above the `main` method (VS Code shows this automatically once the
   Java extension loads), or press `F5`.
6. The program runs in the **Debug Console / Terminal** — interact with the menu there.

### Option B — Command Line

```bash
cd EmployeeRecordsManagement/src
javac Employee.java EmployeeManager.java Main.java
java Main
```

## Sample Menu

```
--------------- MENU ---------------
1. Add Employee
2. View All Employees
3. Search by Department
4. Update Employee (Designation / Salary)
5. Delete Employee
6. Exit
-------------------------------------
```

## Team Split (6 members)

| # | Member | File / Section                                  |
|---|--------|--------------------------------------------------|
| 1 | —      | `Employee.java`                                   |
| 2 | —      | `EmployeeManager.java` — add / view / search half |
| 3 | —      | `EmployeeManager.java` — add / view / search half |
| 4 | —      | `EmployeeManager.java` — update / delete half     |
| 5 | —      | `EmployeeManager.java` — update / delete half     |
| 6 | —      | `Main.java`                                       |

> Fill in member names above before submitting.

## Team Rules

- 🔹 Method names are locked once agreed — don't rename (other members' code depends on them).
- 🔹 Test your section independently before merging into the shared repo.
- 🔹 Commit under your own name/account — individual commits are required for grading.
- 🔹 Push to one shared GitHub repository, including this README.

## Git Workflow Suggestion

```bash
git clone <shared-repo-url>
cd EmployeeRecordsManagement
git checkout -b <your-name>-<your-section>
# make your changes
git add .
git commit -m "Add: <your name> - <what you implemented>"
git push origin <your-name>-<your-section>
# open a Pull Request into main for review before merging
```
