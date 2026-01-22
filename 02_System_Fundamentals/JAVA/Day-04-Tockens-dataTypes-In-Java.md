# 📘 Java Programming – Day 4 (Tokens, Data Types & Type Casting)

> 🎯 **Goal (Off-Campus Placement Prep):** Build strong Java fundamentals by understanding tokens deeply and connecting them with real-world coding concepts like data types and type casting.

---

## 🔹 What are Tokens in Java?

Tokens are the **smallest meaningful units** in a Java program. The Java compiler reads your code token by token, not line by line.

📦 Java Tokens include:

* Keywords
* Identifiers
* Literals
* Operators
* Separators
* Escape Sequences

Today’s focus goes deeper into **operators, separators, escape sequences**, and how tokens connect with **type casting**.

---

## 🔹 Escape Sequence Characters

Escape sequences are special characters used inside **strings and character literals** to represent actions or symbols that cannot be typed directly.

| Escape Sequence | Meaning         |
| --------------- | --------------- |
| `\n`            | New line        |
| `\t`            | Tab space       |
| `\b`            | Backspace       |
| `\r`            | Carriage return |
| `\f`            | Form feed       |
| `\\`            | Backslash       |
| `\"`            | Double quote    |
| `\'`            | Single quote    |

📌 **Why important?**

* Used in output formatting
* Frequently asked in MCQs
* Considered part of **tokens** in Java

---

## 🔹 Separators in Java

Separators are symbols that help **structure Java code**.

| Separator | Use                      |
| --------- | ------------------------ |
| `( )`     | Method calls, conditions |
| `{ }`     | Code blocks              |
| `[ ]`     | Arrays                   |
| `;`       | Statement termination    |
| `,`       | Multiple variables       |
| `.`       | Access members           |

📌 **Compiler depends heavily on separators** to understand code structure.

---

## 🔹 Operators in Java

Operators perform **operations on variables and values**.

### 1️⃣ Unary Operators

Operate on a **single operand**.

* `+` (Unary plus)
* `-` (Unary minus)
* `++` (Increment)
* `--` (Decrement)
* `!` (Logical NOT)

📌 Example use-case: counters, flags

---

### 2️⃣ Binary Operators

Operate on **two operands**.

* Arithmetic: `+  -  *  /  %`
* Relational: `> < >= <= == !=`
* Logical: `&& ||`
* Bitwise: `& | ^ << >>`

📌 Most commonly used operators in **real projects**.

---

### 3️⃣ Ternary Operator

A **short form of if-else**.

Syntax:

```
condition ? value_if_true : value_if_false
```

📌 Used in:

* Clean code
* Inline decision making
* Interview favorite ❗

---

## 🔹 Number System Conversion

Understanding number systems helps in:

* Logical thinking
* Bitwise operations
* Low-level concepts

### 🔸 Decimal to Binary

Steps:

1. Divide number by 2
2. Store remainder
3. Reverse the remainders

Example:

```
10 → 1010
```

---

### 🔸 Binary to Decimal

Steps:

1. Multiply each bit by powers of 2
2. Add all values

Example:

```
1010 → 10
```

📌 Commonly linked with **bitwise operators**.

---

## 🔹 Data Types in Java

Data types define:

* Size of data
* Type of data
* Memory allocation

### 🔸 Primitive Data Types

| Type    | Size            |
| ------- | --------------- |
| byte    | 1 byte          |
| short   | 2 bytes         |
| int     | 4 bytes         |
| long    | 8 bytes         |
| float   | 4 bytes         |
| double  | 8 bytes         |
| char    | 2 bytes         |
| boolean | 1 bit (logical) |

📌 Java is **strongly typed** language.

---

## 🔹 Variables in Java

Variables are **named memory locations**.

Types:

* Local Variables
* Instance Variables
* Static Variables

Rules:

* Must be declared before use
* Cannot use reserved keywords
* Case-sensitive

---

## 🔹 Type Conversion & Type Casting

This is where **tokens + data types + operators** connect.

### 🔸 Implicit Type Conversion (Widening)

* Done automatically
* Smaller type → Bigger type

Example flow:

```
int → long → float → double
```

📌 No data loss

---

### 🔸 Explicit Type Conversion (Narrowing)

* Done manually
* Bigger type → Smaller type

Syntax:

```
(type) value
```

📌 Risk of **data loss**

---

## 🔹 Binding Tokens with Type Casting (Core Concept)

* **Operators** decide how casting happens
* **Separators** define scope
* **Data types** define memory
* **Type casting** converts values

📌 This connection is critical for:

* Understanding compiler behavior
* Writing optimized code
* Clearing tricky interview questions

---

## 🧠 Interview Notes

✔ Why Java doesn’t allow implicit narrowing?
✔ Why char uses 2 bytes?
✔ Difference between type conversion and casting
✔ Ternary vs if-else

---

## 📅 Day 4 Summary

✔ Deep dive into Java Tokens
✔ Operators (Unary, Binary, Ternary)
✔ Number System Conversion
✔ Data Types & Variables
✔ Implicit & Explicit Type Casting

This day builds a **solid Java foundation** for off-campus placements.

---
🚀 *Consistency beats intensity. Day 4 completed, fundamentals upgraded.*
@TANISH