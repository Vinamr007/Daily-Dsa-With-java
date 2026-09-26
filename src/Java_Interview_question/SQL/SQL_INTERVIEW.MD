Yes. Here are the **same 25 SQL/MySQL theory interview questions we covered in the mock, with concise interview-ready answers**, formatted so you can put them in your GitHub README/notes.

# SQL / MySQL — 25 Interview Questions & Answers

### 1. What is a Database?

**Answer:**
A database is an organized collection of data used to store, manage, retrieve, and update data efficiently.

---

### 2. What is DBMS?

**Answer:**
DBMS stands for **Database Management System**. It is software used to create, store, manage, retrieve, and manipulate data in a database.

**Examples:** MySQL, Oracle, PostgreSQL.

---

### 3. What is RDBMS? How is it different from DBMS?

**Answer:**
RDBMS stands for **Relational Database Management System**. It stores data in tables and allows relationships between tables using keys.

**Difference:**

* DBMS → manages databases.
* RDBMS → manages relational databases using tables and relationships.

---

### 4. What is SQL and how is it different from MySQL?

**Answer:**
SQL stands for **Structured Query Language**. It is a language used to interact with databases.

MySQL is an **RDBMS/software** that uses SQL to store, retrieve, update, and manage data.

```text
SQL   → Language
MySQL → RDBMS / Software
```

---

### 5. What are DDL, DML, DQL, DCL and TCL?

**Answer:**

| Type | Purpose                    | Commands                              |
| ---- | -------------------------- | ------------------------------------- |
| DDL  | Defines database structure | `CREATE`, `ALTER`, `DROP`, `TRUNCATE` |
| DML  | Manipulates data           | `INSERT`, `UPDATE`, `DELETE`          |
| DQL  | Retrieves data             | `SELECT`                              |
| DCL  | Controls permissions       | `GRANT`, `REVOKE`                     |
| TCL  | Manages transactions       | `COMMIT`, `ROLLBACK`, `SAVEPOINT`     |

---

### 6. Difference between DELETE, TRUNCATE and DROP?

**Answer:**

**DELETE**

* Removes specific rows.
* Can use `WHERE`.
* Table structure remains.

**TRUNCATE**

* Removes all rows.
* Table structure remains.

**DROP**

* Removes the entire table, including its data and structure.

---

### 7. What is a Primary Key?

**Answer:**
A primary key is a constraint used to uniquely identify each row in a table.

Properties:

* Values must be unique.
* Cannot contain `NULL`.
* A table can have only one primary key.
* A primary key can consist of multiple columns.

---

### 8. What is a Foreign Key?

**Answer:**
A foreign key is a constraint used to establish a relationship between two tables. It references a key in another table and maintains **referential integrity**.

Example:

```text
Department
-----------
dept_id → Primary Key

Employee
-----------
emp_id
dept_id → Foreign Key
```

---

### 9. Difference between WHERE and HAVING?

**Answer:**

`WHERE` filters **individual rows** before grouping.

`HAVING` filters **groups** after `GROUP BY`, usually using aggregate functions.

```sql
SELECT department, AVG(salary)
FROM Employee
WHERE salary > 30000
GROUP BY department
HAVING AVG(salary) > 50000;
```

---

### 10. Difference between GROUP BY and ORDER BY?

**Answer:**

`GROUP BY` groups rows having the same values, usually with aggregate functions.

`ORDER BY` sorts the result.

```sql
GROUP BY → Group data
ORDER BY → Sort data
```

---

### 11. What is a JOIN? What are its types?

**Answer:**
A JOIN is used to combine data from two or more tables based on a related column.

Main types:

* INNER JOIN
* LEFT JOIN
* RIGHT JOIN
* FULL OUTER JOIN
* CROSS JOIN
* SELF JOIN

**Note:** MySQL does not directly support `FULL OUTER JOIN`.

---

### 12. Difference between INNER JOIN and LEFT JOIN?

**Answer:**

**INNER JOIN:** Returns only matching records from both tables.

**LEFT JOIN:** Returns all records from the left table and matching records from the right table. If there is no match, right-side columns contain `NULL`.

---

### 13. What is a Subquery? What are its types?

**Answer:**
A subquery is a query written inside another query.

Common types:

1. **Single-row subquery** → returns one row/value.
2. **Multi-row subquery** → returns multiple rows/values.
3. **Correlated subquery** → depends on the outer query.

Example:

```sql
SELECT *
FROM Employee
WHERE salary > (
    SELECT AVG(salary)
    FROM Employee
);
```

---

### 14. What is a CTE?

**Answer:**
CTE stands for **Common Table Expression**. It creates a temporary named result set using the `WITH` keyword.

It is mainly used to make complex queries more **readable, manageable, and reusable within that query**.

```sql
WITH HighSalary AS (
    SELECT *
    FROM Employee
    WHERE salary > 50000
)
SELECT *
FROM HighSalary;
```

---

### 15. What is a View?

**Answer:**
A View is a **virtual table** based on a SQL query.

It is useful when we repeatedly need the same query or want to simplify complex queries.

```sql
CREATE VIEW employee_view AS
SELECT name, salary
FROM Employee;
```

Then:

```sql
SELECT * FROM employee_view;
```

---

### 16. What is a Stored Procedure? How is it different from a View?

**Answer:**
A Stored Procedure is a set of SQL statements stored in the database that can be executed when required.

It can accept parameters and perform operations.

A **View** is a virtual table mainly used for retrieving data, while a **Stored Procedure** can perform a series of operations.

---

### 17. What is a Function? How is it different from a Stored Procedure?

**Answer:**
A function is a stored program that performs a specific operation and **returns a value**.

A Stored Procedure is a stored set of SQL statements that can perform one or more operations.

Important difference:

> A function must return a value, while a procedure does not have to return a value.

Both can accept parameters.

---

### 18. What is a Trigger?

**Answer:**
A Trigger is a database object that automatically executes when a specified event occurs on a table.

Common events:

```text
INSERT
UPDATE
DELETE
```

Triggers can execute **BEFORE** or **AFTER** the event.

---

### 19. What is Indexing? Why do we use it?

**Answer:**
An index is a data structure used to improve the speed of data retrieval/searching.

However, indexes have a drawback: they can slow down `INSERT`, `UPDATE`, and `DELETE` operations because the index also needs to be maintained.

```text
Index
 ↓
Faster SELECT
 ↓
But additional maintenance during INSERT/UPDATE/DELETE
```

---

### 20. What is a Transaction? Explain COMMIT, ROLLBACK and SAVEPOINT.

**Answer:**
A transaction is a group of SQL operations treated as a **single unit of work**.

* **COMMIT** → permanently saves changes.
* **ROLLBACK** → undoes uncommitted changes.
* **SAVEPOINT** → creates a point inside a transaction to which we can roll back.

---

### 21. What are ACID properties?

**Answer:**

**A — Atomicity**
All operations happen successfully, or none of them happen.

**C — Consistency**
A transaction takes the database from one valid state to another valid state.

**I — Isolation**
Multiple transactions should not improperly interfere with each other.

**D — Durability**
Once a transaction is committed, the changes remain saved even after a system failure.

---

### 22. What is a Deadlock?

**Answer:**
A deadlock occurs when two or more transactions are waiting for each other to release locks, so none of them can continue.

Example:

```text
Transaction A → locks Row 1 → waits for Row 2
Transaction B → locks Row 2 → waits for Row 1

        ↓

      DEADLOCK
```

Databases can detect deadlocks and resolve them by rolling back one of the transactions.

---

### 23. What is Normalization? Explain 1NF, 2NF and 3NF.

**Answer:**
Normalization is the process of organizing data to reduce **data redundancy** and improve **data integrity**.

**1NF — First Normal Form**

* Each column should contain atomic/single values.
* No repeating groups.

**2NF — Second Normal Form**

* Must be in 1NF.
* Every non-key attribute must depend on the entire primary key.

**3NF — Third Normal Form**

* Must be in 2NF.
* Non-key attributes should not depend on another non-key attribute.

Simple flow:

```text
1NF
 ↓
Remove repeating/multiple values

2NF
 ↓
Remove partial dependency

3NF
 ↓
Remove transitive dependency
```

---

### 24. Difference between View and Temporary Table?

**Answer:**

**View:**

* Virtual table.
* Based on a saved SQL query.
* Used like a table.
* Usually remains available until the view is dropped.

**Temporary Table:**

* Actual temporary table.
* Exists temporarily, generally for the current session.
* Automatically removed when the session ends.

---

### 25. Difference between Primary Key and Foreign Key?

**Answer:**

| Primary Key                         | Foreign Key                              |
| ----------------------------------- | ---------------------------------------- |
| Uniquely identifies each row        | Establishes relationship between tables  |
| Must be unique                      | Can contain duplicate values             |
| Cannot contain NULL                 | Can contain NULL depending on definition |
| Identifies records in its own table | References a key in another table        |
| Maintains entity integrity          | Maintains referential integrity          |

**Simple way to remember:**

```text
PRIMARY KEY
     ↓
Identifies the row

FOREIGN KEY
     ↓
Connects tables
```

---

## 🔥 Your GitHub Title

You can put this on GitHub as:

**`SQL-MySQL-Interview-Questions-and-Answers.md`**

And a good repository section would be:

```text
SQL / MySQL Interview Preparation
│
├── Theory Questions
│   └── 25 SQL Interview Questions & Answers
│
├── Practical Queries
│   └── SQL Query Practice
│
└── Scenario Based Questions
    └── SQL Interview Scenarios
```

These 25 are based on the **mock we actually conducted**, so they match what you practiced rather than being a random SQL question list.
