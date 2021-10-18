1.What is Java?
Java is the high-level, object-oriented, robust, secure programming language, platform-independent, high performance, Multithreaded, and 
portable programming language. 
It was developed by James Gosling in June 1991. 
It can also be known as the platform as it provides its own JRE and API.

2.List the features of Java Programming language?
Simple:Java is easy to learn.
       The syntax of Java is based on C++ which makes easier to write the program in it.

Object-Oriented:Java follows the object-oriented paradigm which allows us to maintain our code as the combination of different type of objects that incorporates both data and behavior.

Portable:Java supports read-once-write-anywhere approach. We can execute the Java program on every machine. 
         Java program (.java) is converted to bytecode (.class) which can be easily run on every machine.

Platform Independent:Java is a platform independent programming language. 
                     It is different from other programming languages like C and C++ which needs a platform to be executed. 
                     Java comes with its platform on which its code is executed.
                     Java doesn't depend upon the operating system to be executed.

Secured: Java is secured because it doesn't use explicit pointers. 
         Java also provides the concept of ByteCode and Exception handling which makes it more secured.

Robust: Java is a strong programming language as it uses strong memory management. 
        The concepts like Automatic garbage collection, Exception handling, etc. make it more robust.

3.How many types of memory areas are allocated by JVM?
  1.Class(Method) Area
  2.Heap
  3.Stack
  4.Program Counter Register
  5.Native Method Stack

4.What is the platform?
A platform is the hardware or software environment in which a piece of software is executed. 
There are two types of platforms, software-based and hardware-based. 
Java provides the software-based platform.

5.What gives Java its 'write once and run anywhere' nature?
The bytecode. Java compiler converts the Java programs into the class file (Byte Code) which is the intermediate language between source code and machine code. 
This bytecode is not platform specific and can be executed on any computer.

6.What is an object?
The Object is the real-time entity having some state and behavior. 
In Java, Object is an instance of the class having the instance variables as the state of the object and the methods as the behavior of the object. 
The object of a class can be created by using the new keyword.

7.What are the various access specifiers in Java?
In Java, access specifiers are the keywords which are used to define the access scope of the method, class, or a variable. 
In Java, there are four access specifiers given below.
Public: The classes, methods, or variables which are defined as public, can be accessed by any class or method.
Protected :Protected can be accessed by the class of the same package, or by the sub-class of this class, or within the same class.
Default :Default are accessible within the package only. By default, all the classes, methods, and variables are of default scope.
Private: The private class, methods, or variables defined as private can be accessed within the class only.

8.What are the advantages of Packages in Java?
Packages avoid the name clashes.
The Package provides easier access control.
We can also have the hidden classes that are not visible outside and used by the package.
It is easier to locate the related classes.

9.How many types of constructors are used in Java?
Based on the parameters passed in the constructors, there are two types of constructors in Java.
Default Constructor: default constructor is the one which does not accept any value. The default constructor is mainly used to initialize the instance variable with the default values.
It can also be used for performing some useful task on object creation. 
A default constructor is invoked implicitly by the compiler if there is no constructor defined in the class.
Parameterized Constructor: The parameterized constructor is the one which can initialize the instance variables with the given values.
In other words, we can say that the constructors which can accept the arguments are called parameterized constructors.


10.What are the restrictions that are applied to the Java static methods?
Two main restrictions are applied to the static methods.
The static method can not use non-static data member or call the non-static method directly.
this and super cannot be used in static context as they are non-static.


11.Which class is the superclass for all the classes?
The object class is the superclass of all other classes in Java.

12.Why is Java not a pure object oriented language?
Java supports primitive data types - byte, boolean, char, short, int, float, long, and double and hence it is not a pure object-oriented language.

13.Why Java is platform independent?
Java is called platform independent because of its byte codes which can run on any system irrespective of its underlying operating system.




