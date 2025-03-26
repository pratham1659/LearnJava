# Chapter 1 Basic Java Fundamentals

[Topic 1 - JVM, JDK, and JRE Explained](#Topic-1-Notes)

### [Topic 1 Notes]

## JVM, JDK, and JRE Explained

Java has three main components: JVM (Java Virtual Machine), JRE (Java Runtime Environment), and JDK (Java Development Kit). Let's break them down.

1. JVM (Java Virtual Machine)

- JVM is the engine that runs Java programs.
- It converts Java bytecode into machine code (native code) for your system.
- You write Java code (.java file).
- The Java compiler converts it into bytecode (.class file).
- The JVM executes this bytecode on your system.

```
javac Main.java  # Compiles to bytecode (Main.class)
java Main        # JVM runs Main.class

```

2. JRE (Java Runtime Environment)

- JRE is a package that includes the JVM and necessary libraries to run Java programs.
- It does NOT include the compiler (javac), so you can't write or compile Java programs with JRE alone.
- If you just want to run Java applications (not develop them), you only need JRE.
- JVM (to execute programs)
- Core Java libraries (Java APIs)
- Configuration files
- End-users who only need to run Java applications (e.g., Java-based desktop apps).

3. JDK (Java Development Kit)
   -JDK is a complete development package that includes:

- JRE (to run Java programs)
- Java Compiler (javac) to convert Java code into bytecode
- Debugging tools
- Additional libraries for development
- If you want to write, compile, and run Java programs, you need JDK.
- JRE (includes JVM)
- Compiler (javac) → Converts .java to .class
- Development tools (debugger, profiler)
- Developers who want to write and compile Java programs.

![alt text](http://url/to/img.png)
