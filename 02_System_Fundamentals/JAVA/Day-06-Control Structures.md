# 🇮🇳 Republic Day Java Fundamentals – Control Structures & Logic Building

> Republic Day productive banate hue Java ke core fundamentals revise kiye 🇮🇳  
> Focus: Flow of Control, Jump Statements, Number Logic (Exam + Viva Ready)

---

## 📚 Syllabus Focus
This repository covers **important Java fundamentals** frequently asked in:
- Semester exams
- Practical exams
- Viva voce

---

## 🔁 Flow of Control in Java (Control Structures)

Control structures define **how a program executes statements**.

### 🔹 Types of Control Structures in Java

---

## 1️⃣ Sequential Control Structure
- Default execution flow
- Statements execute **line by line**
- No condition checking, no repetition

📌 Example:
```java
int a = 10;
int b = 20;
int sum = a + b;
System.out.println(sum);

✔ Used when logic is simple and straightforward.

2️⃣ Selection (Decision-Making) Control Structure

Used to select one path based on conditions.

🔸 Types:

if

if-else

if-else-if

switch

📌 Example:
if (marks >= 40) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}

✔ Uses relational and logical operators.

3️⃣ Iteration (Looping) Control Structure

Used to repeat a block of code until condition becomes false.

🔸 Types of Loops:

while

do-while

for

📌 Example:
int i = 1;
while(i <= 5) {
    System.out.println(i);
    i++;
}
✔ Helps reduce code repetition.

🚦 Jump Statements in Java

Used to change the normal flow of execution.

Statement	Purpose
break	Exits loop or switch
continue	Skips current iteration
return	Exits method

📌 Example:
if(i == 5)
    break;

🔢 Digit Extraction in Java

Used to extract digits from a number.

🔑 Key Logic:

% 10 → gives last digit

/ 10 → removes last digit

📌 Example:
digit = num % 10;
num = num / 10;

🔄 Reverse a Number (Using while Loop)
Logic Steps:

Extract last digit

Multiply reverse number by 10

Add digit

Remove last digit

Repeat until number becomes 0

📌 Example:
while(num > 0) {
    digit = num % 10;
    rev = rev * 10 + digit;
    num = num / 10;
}


📝 Exam Short Notes (Quick Revision)

Java executes programs using control structures

Sequential flow is default

Selection uses conditions to decide path

Iteration repeats code using loops

Jump statements alter loop execution

% and / are key operators for number logic

while loop is best when number of iterations is unknown



🎤 Java Viva Questions (Important)


What is flow of control in Java?

Name the types of control structures.

Difference between if-else and switch?

Difference between while and do-while loop?

What is the use of break statement?

What does continue do?

How do you extract digits from a number?

Explain logic to reverse a number.

Which loop is entry-controlled?

Which loop executes at least once?



Author @TANISH
Structured by @ChatGPT