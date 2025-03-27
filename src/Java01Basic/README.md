# Chapter 1 Basic Java Fundamentals

[Topic 1 - JVM, JDK, and JRE Explained](#Topic-1-Notes)

### [Topic 1 Notes]

## JVM, JDK, and JRE Explained

Java has three main components: JVM (Java Virtual Machine), JRE (Java Runtime Environment), and JDK (Java Development Kit). Let's break them down.

1. **JVM (Java Virtual Machine)**

- JVM is the engine that runs Java programs.
- It converts Java bytecode into machine code (native code) for your system.
- JVM (Java Virtual Machine) is an abstract machine. It is a specification that provides a runtime environment in which Java bytecode can be executed.

- JVMs are available for many hardware and software platforms (i.e., JVM is platform-dependent).

- JVMs are designed to be platform-dependent, meaning they are tailored to specific hardware and software platforms. This flexibility allows JVM implementations to optimize performance and compatibility for various systems, enabling Java applications to run consistently across diverse environments.

```
javac Main.java  # Compiles to bytecode (Main.class)
java Main        # JVM runs Main.class

```

2. **JRE (Java Runtime Environment)**

- JRE is a package that includes the JVM and necessary libraries to run Java programs.
- It does NOT include the compiler (javac), so you can't write or compile Java programs with JRE alone.
- If you just want to run Java applications (not develop them), you only need JRE.
- JVM (to execute programs)
- Core Java libraries (Java APIs)
- Configuration files
- End-users who only need to run Java applications (e.g., Java-based desktop apps).

3. **JDK (Java Development Kit)**

- JDK is a complete development package that includes:
- JRE (to run Java programs)
- Java Compiler (javac) to convert Java code into bytecode
- Debugging tools
- Additional libraries for development
- If you want to write, compile, and run Java programs, you need JDK.
- JRE (includes JVM)
- Compiler (javac) → Converts .java to .class
- Development tools (debugger, profiler)
- Developers who want to write and compile Java programs.

<!-- -- ![alt text](http://url/to/img.png) -->
