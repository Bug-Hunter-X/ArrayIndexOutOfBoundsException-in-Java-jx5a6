# ArrayIndexOutOfBoundsException in Java

This repository demonstrates a common Java error: the `ArrayIndexOutOfBoundsException`. This exception occurs when you try to access an array element using an index that is out of the valid range (0 to array.length - 1).

The `bug.java` file contains the code that causes this exception.  The `bugSolution.java` file provides a corrected version.

## How to reproduce

1. Clone this repository.
2. Compile `bug.java` using a Java compiler (javac bug.java).
3. Run the compiled code (java bug). You'll see the exception.

## Solution

The solution involves carefully checking array indices to ensure they fall within the valid range before accessing array elements.  The `bugSolution.java` demonstrates this fix.