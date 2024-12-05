//class A1{
//public void print(String s){
//s.o.p(s);
//}
//
//public void print(Object o){
//s.o.p(o);
//}
//}
//
//class A implements A1{
//A.print(null);
//}
//
//class Main(){
//A1 obj = new A();
//obj.print();
//}
//
//diff between hashmap hashtable
//diff between hashmap and concurrent hashmap
//
//
//1) types of stream: stream and parallelStream(not thread safe)
//2) 
//boolean allMatch(Predicate), anyMatch(Predicate)
//static <T> Stream.Builder<T> builder()	
//<R,A> R collect(Collector<? super T,A,R> collector)
//Collectors.groupingBy()*
//Collectors.counting()*
//distinct()
//empty()
//filter()
//findAny()->Optional
//findFirst()->Optional
//flatMap()
//flatMaptoInt(), Long, Double
//forEach()
//forEachOrdered()
//limit()
//map()
//mapToInt(), map
//min(Comparator)
//max(Comparator)
//noneMatch(Predicate)-> not contains
//Stream.of()
//peek(Consumer)->debugging
//reduce()-> *
//to define our own implementation on sream->sum,max,min
//sorted()
//sorted(Comparator)
//Stream.Of()
//
//3)skip()
//
//
//1)why private and protected not applicable for top level classes?
//private and protected access modifiers are designed to manage access within a class hierarchy, which is not applicable to top-level classes. Instead, package-level access control is typically used to control the visibility of top-level classes.
//
//For top-level classes, Java provides two clear visibility options: public and (default, no modifier). These options define clear boundaries for class accessibility either universally (public) or within the same package.
//
//PRIVATE
//Visibility Scope:
//The private access modifier is designed to restrict access to members (fields, methods, nested classes) within the same class. Applying private to a top-level class would imply that the class is only accessible within itself, which is not practical because a class cannot instantiate or access itself in isolation.
//
//Logical Inconsistency:
//A top-level class with private access would be invisible to all other classes, including those within the same package. This creates a logical inconsistency as there would be no valid use case or mechanism to access or utilize such a class.
//
//PROTECTED(accessible anywhere within same package and in other package only in subclass)
//Top-level classes should be either package-private (default) or public to define clear boundaries of accessibility.
//Introducing protected for top-level classes would complicate the visibility rules without providing practical benefits, as the intended use of protected is already achieved through member-level access control and inheritance mechanisms.
//
//
//
//2)Polymorphism
//Polymorphism in Java is the ability of an object to take on many forms. It is a core concept of object-oriented programming (OOP) and allows one interface to be used for a general class of actions. The specific action is determined by the exact nature of the situation. Polymorphism is mainly categorized into two types: compile-time polymorphism and runtime polymorphism.
//
//a)Compile-Time Polymorphism (Static Polymorphism)
//Compile-time polymorphism is achieved by method overloading.
//Method Overloading
//Method overloading allows a class to have more than one method with the same name, as long as their parameter lists are different (i.e., different number of parameters, different types of parameters, or both).
//class MathOperations {
//    // Method to add two integers
//    int add(int a, int b) {
//        return a + b;
//    }
//
//    // Overloaded method to add three integers
//    int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    // Overloaded method to add two doubles
//    double add(double a, double b) {
//        return a + b;
//    }
//}
//
//public class TestOverloading {
//    public static void main(String[] args) {
//        MathOperations math = new MathOperations();
//        
//        System.out.println(math.add(5, 10)); // Calls method with two int parameters
//        System.out.println(math.add(5, 10, 15)); // Calls method with three int parameters
//        System.out.println(math.add(5.5, 10.5)); // Calls method with two double parameters
//    }
//}
//
//
//b)Runtime polymorphism is achieved through method overriding. It allows a subclass to provide a specific implementation of a method that is already defined in its superclass. The JVM determines the appropriate method to call at runtime based on the actual object being referenced, not the reference type.
//
//Method Overriding
//Method overriding allows a subclass to provide a specific implementation for a method that is already defined in its superclass.
//class Animal {
//    void makeSound() {
//        System.out.println("Animal makes a sound");
//    }
//}
//
//class Dog extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Dog barks");
//    }
//}
//
//class Cat extends Animal {
//    @Override
//    void makeSound() {
//        System.out.println("Cat meows");
//    }
//}
//
//public class TestOverriding {
//    public static void main(String[] args) {
//        Animal myAnimal = new Animal(); // Animal reference and object
//        Animal myDog = new Dog(); // Animal reference but Dog object
//        Animal myCat = new Cat(); // Animal reference but Cat object
//        
//        myAnimal.makeSound(); // Outputs: Animal makes a sound
//        myDog.makeSound(); // Outputs: Dog barks
//        myCat.makeSound(); // Outputs: Cat meows
//    }
//}
//
//3)can we override static methods from parent class to child?
//No, you cannot override static methods in Java in the same way you can override instance methods. Static methods belong to the class itself, not to instances of the class, and they are resolved at compile time, not at runtime. Therefore, they are not subject to the same polymorphic behavior as instance methods.
//
//Method Hiding: Applicable to static methods. Allows a child class to define a new static method with the same signature as one in the parent class. Hiding does not exhibit polymorphic behavior. The method that gets executed is determined by the type of the reference, not the actual object.
//
//Method Hiding-compile time polymorphism-applicable for static methods-The method that gets executed is determined by the type of the reference, not the actual object.
//Method Overriding-runtime polymorphism-applicable for Instance methods-The method that gets executed is not determined by the type of the reference, but the actual object.
//
//class Parent {
//    static void staticMethod() {
//        System.out.println("Static method in Parent");
//    }
//
//    void instanceMethod() {
//        System.out.println("Instance method in Parent");
//    }
//}
//
//class Child extends Parent {
//    static void staticMethod() {
//        System.out.println("Static method in Child");
//    }
//
//    @Override
//    void instanceMethod() {
//        System.out.println("Instance method in Child");
//    }
//}
//public class Test {
//    public static void main(String[] args) {
//        Parent p = new Parent();
//        Parent c = new Child();
//
//        // Static method calls
//        p.staticMethod(); // Outputs: Static method in Parent
//    }
//}
//
//------------------------------------------------------------------
//
//class Parent {
//    static void staticMethod() {
//        System.out.println("Static method in Parent");
//    }
//}
//
//class Child extends Parent {
//    // No static method defined here; inherits the staticMethod from Parent
//}
//
//public class TestInheritance {
//    public static void main(String[] args) {
//        Parent.staticMethod(); // Outputs: Static method in Parent
//        Child.staticMethod(); // Outputs: Static method in Parent
//    }
//}
//-----------------------------------------------------------------
//class Parent {
//    static void staticMethod() {
//        System.out.println("Static method in Parent");
//    }
//}
//
//class Child extends Parent {
//    static void staticMethod() {
//        System.out.println("Static method in Child");
//    }
//}
//
//public class TestHiding {
//    public static void main(String[] args) {
//        Parent.staticMethod(); // Outputs: Static method in Parent
//        Child.staticMethod(); // Outputs: Static method in Child
//
//        Parent p = new Child();
//        p.staticMethod(); // Outputs: Static method in Parent (resolved at compile time)
//    }
//}
//
//------------------------------------------------------------------
//
//4)Can we overload a static method?
//The answer is Yes. We can overload static methods. But remember that the method signature must be different. 
//
//5)are static methods from parent class available to child class?
//yes
//If a static method is public or protected, it is accessible to subclasses.
//If a static method has default (package-private) access, it is accessible to subclasses only if they are in the same package.
//Private static methods are not inherited or accessible.
//A subclass inherits static methods from its superclass, meaning it can call these methods directly. However, the call is resolved based on the type of the reference, not the actual object.
//
//6)synchronized access modifier - multithreading- applied on method or block
//In Java, the synchronized keyword is used to control access to a method or block of code by multiple threads. It ensures that only one thread can execute a synchronized method or block at any given time for a particular object. This is essential for preventing thread interference and consistency problems when multiple threads share data.
//There are two main uses of the synchronized keyword in Java:
//
//1.) Synchronized Method: A method can be declared synchronized by using the synchronized keyword in its declaration. When a thread calls a synchronized method, it automatically acquires the intrinsic lock (or monitor) for that method's object, and no other thread can call any synchronized method on the same object until the lock is released.
//
//public synchronized void synchronizedMethod() {
//    // synchronized code
//}
//
//2.) Synchronized Block: Instead of synchronizing an entire method, you can synchronize a specific block of code within a method. This can provide finer control over the lock and can reduce the scope of synchronization to just the critical section of code that needs it.
//
//public void someMethod() {
//    synchronized (this) {
//        // synchronized code
//    }
//}
//
//Intrinsic Locks and Synchronization
//Each object in Java has an intrinsic lock associated with it. When a thread enters a synchronized method or block, it acquires the intrinsic lock for that object. If another thread tries to enter a synchronized method or block for the same object, it will be blocked until the first thread releases the lock by exiting the synchronized method or block.
//
//Static Synchronization
//If you need to synchronize a static method or block, the intrinsic lock for the Class object associated with the class is used.
//public class StaticSyncExample {
//    // Synchronized static method
//    public static synchronized void staticSyncMethod() {
//        // synchronized code
//    }
//
//    public static void anotherStaticMethod() {
//        synchronized (StaticSyncExample.class) {
//            // synchronized code
//        }
//    }
//}
//
//In this case, the intrinsic lock associated with the StaticSyncExample.class is used, ensuring that the static synchronized method or block is thread-safe.
//Using synchronized properly is crucial for writing concurrent programs that are safe and free from issues like race conditions and data inconsistencies. However, excessive use of synchronization can lead to contention and performance bottlenecks, so it should be used judiciously.
//
//
//7)Java Native Interface: The Java Native Interface (JNI) is a programming framework that allows Java code running in a Java Virtual Machine (JVM) to interact with applications and libraries written in other languages, like C/C++.
//
//The native keyword in Java is used to indicate that a method is implemented in native code using a platform-specific programming language such as C or C++. This allows Java programs to interact with lower-level system APIs, access hardware directly, or perform other tasks that are not possible or practical with pure Java code due to performance issues.
//
//Purpose of the native Keyword
//a) with System Libraries: Allows Java programs to call functions from existing system libraries.
//b) Performance: Can improve performance for critical sections of code where Java's performance might not be sufficient.
//c) Access to Platform-Specific Features: Provides access to features that are specific to the operating system or hardware, which are not accessible through the standard Java API.
//
//Disadvantages:
//Portability: Native code reduces the portability of your Java application, as the native library needs to be compiled separately for each platform.
//Security: Using native methods can introduce security risks, as native code can bypass Java's security model.
//Error Handling: Error handling in native code can be more complex, and errors in native code can crash the JVM.
//Despite these considerations, the native keyword is a powerful tool for integrating Java applications with platform-specific features and optimizing performance-critical sections of code.
//
//
//
//3.) Volatile(a way to provide synchronization in multithreading-applicable to variables)
//volatile is a lightweight synchronization tool that can be useful in specific scenarios but should be used with a clear understanding of its limitations and appropriate use cases.
//In Java, the volatile keyword is used to indicate that a variable's value will be modified by different threads. Declaring a variable as volatile ensures that the value of the variable is always read from and written to the main memory, rather than being stored in a local cache of thread. This helps prevent thread visibility issues where changes made by one thread are not visible to other threads.
//
//
//Usage: volatile is typically used for flags or status variables that are checked and updated by multiple threads. It is not suitable for complex operations that require synchronization.
//
//
//In Java, the volatile keyword is used to ensure that a variable's value is always read from and written to main memory, rather than being cached in a thread's local memory. This is crucial in concurrent programming, where multiple threads might be accessing the same variable simultaneously.
//
//Visibility:
//Without volatile:
//When a thread modifies a non-volatile variable, the changes might not be immediately visible to other threads. This is because each thread can keep a local copy of the variable in its cache for performance reasons.
//
//With volatile:
//When a thread modifies a volatile variable, the changes are immediately flushed to main memory, and all other threads are forced to reread the value from main memory. This ensures that all threads have a consistent view of the variable's value.
//
//volatile guarantees visibility, but not atomicity. Operations like incrementing a volatile variable (volatileVar++) are not atomic, meaning they can lead to race conditions if not handled properly. For atomic operations (e.g., incrementing a value), you should use classes like AtomicInteger.
//Overuse of volatile can hurt performance, so use it only when necessary.
//
//Alternatives to volatile:
//synchronized keyword: Provides both atomicity and visibility, but with more overhead.
//Atomic classes: Provide atomic operations on primitive types.
//Lock interfaces: Provide more fine-grained control over synchronization.
//
//
//4.) Transient(applicable to variables)
//transient variables are not serialized. When applied to a variable, it instructs the Java Virtual Machine (JVM) to exclude that variable from the serialization process. Transient variables are not saved in the serialized form of the object.
//
//In Java, the transient keyword is a modifier applied to instance variables. It indicates that the variable should not be serialized when the object containing it is converted into a byte stream.
//Here's how it works:
//1. Serialization:
//Serialization is the process of converting an object's state into a byte stream, which can then be stored in a file or transmitted over a network.
//2. Transient Variables:
//When you mark a variable as transient, you are telling the Java serialization mechanism to exclude that variable from the serialization process.
//3. Deserialization:
//During deserialization (the reverse process of creating an object from a byte stream), the transient variable will not be restored, and it will typically be assigned its default value (e.g., 0 for int, null for objects).
//
//
//import java.io.*;
//
//class User implements Serializable {
//    private String name;
//    private transient String password;
//
//    // Constructor and other methods...
//}
//
//
//In this example, the password field is marked as transient. This means that when a User object is serialized, the name field will be included in the serialized data, but the password field will not and null will be retrieved during deserialization.
//
//When to use transient:
//Sensitive data:
//Use transient for fields containing sensitive information (e.g., passwords, credit card numbers) that you don't want to store persistently.
//Derived data:
//If a field can be calculated from other fields in the object, mark it as transient to avoid storing redundant data.
//Non-serializable objects:
//If a field references an object that does not implement the Serializable interface, it must be marked as transient to avoid serialization errors.
//
//5.)AutoCloseable Interface
//
//Purpose:
//Classes that implement AutoCloseable are declaring that they hold resources (like files, network connections, etc.) that need to be closed to prevent leaks.
//This interface defines a single method: close().
//
//The close() method of an AutoCloseable object is called automatically when exiting a try -with-resources block for which the object has been declared in the resource specification header.
// 
//import java.io.FileReader;
//import java.io.IOException;
//
//public class MyFileReader implements AutoCloseable {
//    private FileReader reader;
//
//    public MyFileReader(String filename) throws IOException {
//        reader = new FileReader(filename);
//    }
//
//    // ... other methods to read from the file ...
//
//    @Override
//    public void close() throws IOException {
//        if (reader != null) {
//            reader.close();
//        }
//    }
//}
//
//try (MyFileReader fileReader = new MyFileReader("data.txt")) {
//    // Read from the file
//} catch (IOException e) {
//    // Handle exceptions
//}
//
//
//6.) GC- https://www.oracle.com/webfolder/technetwork/tutorials/obe/java/gc01/index.html#:~:text=Stop%20the%20World%20Event%20%2D%20All,to%20store%20long%20surviving%20objects.
//
//The Young Generation is where all new objects are allocated and aged. When the young generation fills up, this causes a minor garbage collection. Minor collections can be optimized assuming a high object mortality rate. A young generation full of dead objects is collected very quickly. Some surviving objects are aged and eventually move to the old generation.
//
//Stop the World Event - All minor garbage collections are "Stop the World" events. This means that all application threads are stopped until the operation completes. Minor garbage collections are always Stop the World events.
//
//The Old Generation is used to store long surviving objects. Typically, a threshold is set for young generation object and when that age is met, the object gets moved to the old generation. Eventually the old generation needs to be collected. This event is called a major garbage collection.
//
//Major garbage collection are also Stop the World events. Often a major collection is much slower because it involves all live objects. So for Responsive applications, major garbage collections should be minimized. Also note, that the length of the Stop the World event for a major garbage collection is affected by the kind of garbage collector that is used for the old generation space.
//
//The Permanent generation contains metadata required by the JVM to describe the classes and methods used in the application. The permanent generation is populated by the JVM at runtime based on classes in use by the application. In addition, Java SE library classes and methods may be stored here.
//
//Classes may get collected (unloaded) if the JVM finds they are no longer needed and space may be needed for other classes. The permanent generation is included in a full garbage collection.