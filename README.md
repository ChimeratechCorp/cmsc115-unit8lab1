# Lab Reflection: Unit 8 Lab 1 - Git Version Control + Debugging (BuggyProgram)

## Student Name
Robert Cruz

## GitHub Repository URL
https://github.com/ChimeratechCorp/cmsc115-unit8lab1.git
---

# Commit 1: Initial Commit

## What did you include in this commit?
- BuggyProgram starter with JUnit tests

## What was the purpose of this commit?
- his commit represents the baseline version of your project.

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
- testEdges()
- testGrades()

## What was the issue in the code?
- Ran Task1Test. Showed 2 test failed testEdges() and testGrades()
The expected and actual results were shown.

## What change did you make to fix it?
- Changed the nested if-else to check >= 90 "Exceeds", then >= 80 "Meets", else "Does Not Meet".

## How did the tests help guide your fix?
- I was given the expected results and I changed to code to reflect that goal. 

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
- testEmpty()
- testOddNumbers()
- testSumEvenNumbers()


## What was the issue in the code?
- sum was initialized to 1 instead of 0, so every
result was off by one.
- the loop condition was <= instead of < operator, 
which caused an ArrayIndexOutOfBoundsException
because index values.length is past the end of the array.

## What change did you make to fix it?
- Initialize sum to 0 instead of 1
- Changed the operator in the loop condition from <= to <

## How did the tests help guide your fix?
- Logic error of the initialized of sum, since the code still ran, 
but was easy to visual because everything was off my 1. 
- The TheArrayIndexOutOfBoundsException error message was clear indication 
at the loop going one index too far.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
- testSumRangeReverseOrder

## What was the issue in the code?
- BuggyProgrom.sumRange() was getting called with 5, 1 parameters.
- The for loop only run when start was less than or equal to end. 
In this case it would not run at all and returned 0 instead of the correct sum.

## What change did you make to fix it?
- I added a simple if statement that checked if start was greated than end
and if so swapped them. 

## How did the tests help guide your fix?
- The testSumRangeReverseOrder() test expected 15 but
got 0. The expected value told me the method should produce the same sum
regardless of argument order, and the actual value of 0 told me the loop
was being skipped entirely.

---

# Overall Reflection

## Which task was the easiest to fix? Why?
- Task 1 (getGrade) was the easiest. The bug was visible just by reading the
code — the return values were swapped and the boundaries used `>` instead
of `>=`. Once I ran the test and saw the expected values, the fix was
obvious.

## Which task was the most difficult? Why?
- Task 3 (sumRange) was the hardest. The loop looked correct at first glance
because it works fine for normal ranges where start < end. The bug only
appeared when start > end, which I wouldn't have thought to test on my own.
The test class had a "reverse order" test that caught it.

## How did Git help you track your progress through the debugging process?
- Each fix was its own commit with a clear message, so I could look back at
the history and see exactly what changed for each task. If I broke
something, I could compare against the previous commit to find the
difference.

## Why is it important to make small, frequent commits when debugging code?
- Small commits isolate one change at a time. If a commit introduces a bug,
it's easy to see exactly what caused it and revert just that change. If
everything is lumped into one commit, you can't tell which change broke
what.

## What did you learn about using JUnit tests to guide debugging?
- The tests define the expected behavior, including boundary cases I might
not think to check. The failure messages show expected vs. actual values,
which points directly at the bug instead of forcing me to guess. Running
tests after each fix confirms the change actually worked.

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
- I finished the Overall Reflection section, verified that all three task
reflections were complete, and confirmed my name and the GitHub repository
URL were in the README.

## Why is it useful to document your work after completing a programming task?
- Documentation explains the 'why' a change was made, not just what changed.
A commit message says "fixed the loop." I made a mistake and didn't change the commit messages.
I thought I was updating them. But it kept the initial commit message. Now going back to review my commits,
I have to search harder to find exactly what I'm looking for. It would have been a lot easier, if they were named properly.
