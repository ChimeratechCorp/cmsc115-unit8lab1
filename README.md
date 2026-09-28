# Lab Reflection: Unit 8 Lab 1 - Git Version Control + Debugging (BuggyProgram)

## Student Name
Robert Cruz

## GitHub Repository URL
https://github.com/ChimeratechCorp/cmsc115-unit8lab1.git
---

# Commit 1: Initial Commit

## What did you include in this commit?
-BuggyProgram starter with JUnit tests

## What was the purpose of this commit?
-This commit represents the baseline version of your project.

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
-testEdges()
-testGrades()

## What was the issue in the code?
-Ran Task1Test. Showed 2 test failed testEdges() and testGrades()
The expected and actual results were shown.

## What change did you make to fix it?
-Changed the nested if-else to check >= 90 "Exceeds", then >= 80 "Meets", else "Does Not Meet".

## How did the tests help guide your fix?
-I was given the expected results and I changed to code to reflect that goal. 

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
-testEmpty()
-testOddNumbers()
-testSumEvenNumbers()


## What was the issue in the code?
-sum was initialized to 1 instead of 0, so every
result was off by one.
-the loop condition was <= instead of < operator, 
which caused an ArrayIndexOutOfBoundsException
because index values.length is past the end of the array.

## What change did you make to fix it?
-Initialize sum to 0 instead of 1
-Changed the operator in the loop condition from <= to <

## How did the tests help guide your fix?
-Logic error of the initialized of sum, since the code still ran, 
but was easy to visual because everything was off my 1. 
-The TheArrayIndexOutOfBoundsException error message was clear indication 
at the loop going one index too far.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
-testSumRangeReverseOrder

## What was the issue in the code?
-BuggyProgrom.sumRange() was getting called with 5, 1 parameters.
-The for loop only run when start was less than or equal to end. 
In this case it would not run at all and returned 0 instead of the correct sum.

## What change did you make to fix it?
-I added a simple if statement that checked if start was greated than end
and if so swapped them. 

## How did the tests help guide your fix?
-The testSumRangeReverseOrder() test expected 15 but
got 0. The expected value told me the method should produce the same sum
regardless of argument order, and the actual value of 0 told me the loop
was being skipped entirely.

---

# Overall Reflection

## Which task was the easiest to fix? Why?
-

## Which task was the most difficult? Why?
-

## How did Git help you track your progress through the debugging process?
-

## Why is it important to make small, frequent commits when debugging code?
-

## What did you learn about using JUnit tests to guide debugging?
-

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
-

## Why is it useful to document your work after completing a programming task?
-