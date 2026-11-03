# JavaInterviewPrep

A repository dedicated to tracking classic Java programming challenges, Data Structures and Algorithms (DSA) problems, and key coding interview prep material.

## Java Execution Commands

Use these commands to compile your Java source files, store the compiled `.class` outputs inside a designated `bin` directory, and execute them cleanly from that location:

```powershell
# 1. Navigate into the specific subfolder containing your code
cd respectiveFolderName

# 2. Compile and direct the output class file to the local bin directory
javac -d .\bin javaFileName.java

# 3. Execute your program by referencing the compiled class file from the bin path
java -cp .\bin javaClassName
```

## Repository Structure

This learning project is strictly organized into targeted subfolders based on problem categories:

### 📁 Classic-Java-Coding-Program
* **Purpose:** Houses fundamental logic and mathematical interview programs.
* **Exclusions:** Does not contain complex algorithmic datasets or shape-printing algorithms.
* **Examples:** Leap Year verification, Prime Number validation, Even/Odd detection.

### 📁 Java-DSA-Program
* **Purpose:** Consolidates Data Structures and Algorithms solutions.
* **Organization:** Grouped clearly by structural subtopics.
* **Examples:** Arrays, Linked Lists, ArrayLists, HashMaps.

### 📁 Java-Pattern-Program
* **Purpose:** Dedicated to building spatial and loop-nested logic patterns.
* **Examples:** Triangle Star Pattern, Pyramid Star Pattern.

## References & Resources

* [GeeksforGeeks - Java Programming Examples](https://geeksforgeeks.org)
* [Kunal Kushwaha - DSA Bootcamp Java Repository](https://github.com)
