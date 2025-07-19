# Java Design Patterns Detailed Wiki

This page explains, in interview-ready detail, the **23 classic (GoF) design patterns**, clearly describing *what* each pattern is, along with when to use it, real-world analogies, pros, and cons.

---

## Creational Design Patterns

### 1. Singleton


Ensures that a class has only one instance throughout the application, and provides a single point of access to it. The instance is created lazily or eagerly, and any request for this object returns the same reference every time. This centralizes control, making it ideal for resources that must be globally consistent, like configuration settings or logging services.

---

### 2. Factory Method


Defines an interface or abstract method for creating an object, but lets subclasses decide which specific class to instantiate. Instead of using `new` directly all over the code, creation is centralized and controlled via factory methods, making code more robust to change and extensible when adding new “products.”

---

### 3. Abstract Factory


Provides an interface to create families of related or dependent objects, without specifying their concrete classes. It groups object factories together so you can change the entire product family with one switch (e.g., switching from a Windows UI to a Mac UI with one change), ensuring products from the same family are used together.

---

### 4. Builder


Separates the construction of a complex object from its actual representation, enabling the same construction process to create various representations (e.g., text, XML, or PDF reports). Step-by-step construction allows for fine control and readable code when creating objects with many configuration options or parts.

---

### 5. Prototype


Creates new objects by copying a fully initialized, existing object, known as the prototype. Instead of manufacturing new objects from scratch, cloning is used to create copies, greatly simplifying the creation of complex or resource-intensive objects and reducing creation cost.

---

## Structural Design Patterns

### 6. Adapter


Enables objects with incompatible interfaces to work together by acting as a middleman (adapter) that translates one interface into another. The adapter wraps one object, exposing an expected interface to clients, thereby integrating legacy or third-party code seamlessly with new code.

---

### 7. Bridge


Decouples an abstraction (high-level control) from its implementation (underlying details) so they can evolve and be extended separately. Both abstraction and implementation are defined in distinct class hierarchies linked by composition, helping avoid a combinatorial explosion of subclasses.

---

### 8. Composite


Enables clients to treat individual objects and compositions (groups of objects) uniformly, by organizing both in a tree structure. Both leaf nodes (individual items) and composites (containers) share the same interface, making recursive operations and tree traversal simple and transparent.

---

### 9. Decorator


Lets you dynamically add new functionality and responsibilities to objects without altering their structure. Wrapping an object in a new decorator object allows additional behavior before, after, or surrounding existing methods, enabling flexible and pluggable feature extensions.

---

### 10. Facade


Provides a single, unified interface to an otherwise complex subsystem or set of interfaces. The facade pattern shields clients from the detailed inner workings, allowing them to interact with a simple API while hiding complex configurations and dependencies.

---

### 11. Flyweight


Optimizes memory usage for large numbers of similar objects by sharing common (“intrinsic”) data among them, rather than keeping duplicate data in each object. Only the unique (“extrinsic”) state is kept externally or passed at runtime, allowing applications (like word processors or games) to efficiently manage millions of objects.

---

### 12. Proxy


Acts as a stand-in or surrogate for another object to control access, add functionality (like caching or security), or manage resource usage. The proxy forwards requests to the real object and can perform additional operations before or after forwarding, such as lazy initialization or access checks.

---

## Behavioral Design Patterns

### 13. Chain of Responsibility


Lets you pass a request along a chain of multiple potential handlers, where each handler can process the request or pass it onward. The sender is decoupled from the receiver, making it easy to modify request processing logic, order, or composition at runtime.

---

### 14. Command


Encapsulates all information needed to perform an action or trigger an event at a later time, into a single object—the command. This object can be passed, stored, queued, and undone/redone. The actual execution is decoupled from the invocation.

---

### 15. Interpreter


Defines a grammatical representation for a language and provides an interpreter to process sentences in that language. Each grammar rule is represented by classes, allowing evaluation or execution of parsed expressions, commonly used in compilers or scripting.

---

### 16. Iterator


Provides a standard way to sequentially traverse the elements of a collection, without exposing internal representation. The iterator maintains its position and allows external code to loop over collections with a uniform interface, regardless of data structure.

---

### 17. Mediator


Defines an object (the mediator) to centralize and control complex communication between related objects (colleagues). Objects interact indirectly via the mediator, reducing direct dependencies and simplifying interactions.

---

### 18. Memento


Stores a snapshot of an object’s state, externally, so that the object can be restored or rolled back to that state later—without violating encapsulation. Commonly used for undo/redo and state rollback features.

---

### 19. Observer


Defines a one-to-many dependency so multiple observer objects are notified and updated automatically whenever the “subject” object changes its state. This decouples subjects from observers and is widely used for event systems or model-view updates.

---

### 20. State


Organizes an object’s behavior into separate state objects, letting the object change its behavior when its internal state changes. The context delegates requests to the current state, simulating a class change based on state.

---

### 21. Strategy


Defines a family of interchangeable algorithms or behaviors, encapsulates each as an object, and lets the algorithm be selected at runtime by the context. This eliminates conditional logic and supports open-closed principle.

---

### 22. Template Method


Establishes the skeleton steps of an algorithm in a base class “template” method, where one or more steps are deferred to subclasses for implementation. This maintains the invariant sequence but allows flexible details for specialized behavior.

---

### 23. Visitor


Lets you define new operations on a set of objects, separating the operation logic from the object structure. A visitor object is accepted by elements in the structure, performing actions as it visits each one—helpful for traversals or applying functions to element groups.

---

## At-a-Glance Pattern Reference

| Pattern Name            | Category      | Real-World Analogy   | When to Use                         | Pros          | Cons             |
|------------------------|--------------|----------------------|--------------------------------------|---------------|------------------|
| Singleton              | Creational   | President            | One instance needed                  | Controlled    | Hinders testing  |
| Factory Method         | Creational   | Factory              | Subclass decides instantiation       | Decoupling    | More classes     |
| Abstract Factory       | Creational   | IKEA set             | Related objects, same family         | Consistency   | Boilerplate      |
| Builder                | Creational   | Burger shop          | Step-by-step complex object          | Customizable  | Verbose          |
| Prototype              | Creational   | Key copier           | Cloning complex objects              | Speed         | Cloning issues   |
| Adapter                | Structural   | Plug adapter         | Integrate incompatible APIs          | Reuse         | Overhead         |
| Bridge                 | Structural   | Remote+TV            | Separate abstraction, impl           | Extendable    | Abstraction      |
| Composite              | Structural   | Files/Folders        | Trees, part-whole hierarchies        | Uniformity    | Complexity       |
| Decorator              | Structural   | Gift wrap            | Add behavior at runtime              | Flexibility   | Many classes     |
| Facade                 | Structural   | Universal remote     | Simplify subsystem                   | Simplicity    | God object risk  |
| Flyweight              | Structural   | Chess pawns          | Many similar objects                 | Memory        | Intricate        |
| Proxy                  | Structural   | Receptionist         | Control, delay, check access         | Control       | Indirection      |
| Chain of Responsibility| Behavioral   | Support escalation   | Pipeline of handlers                 | Flexible      | Tracing logic    |
| Command                | Behavioral   | Waiter order slip    | Encapsulate request/operation        | Undo/Redo     | Verbose          |
| Interpreter            | Behavioral   | Calculator           | Expression evaluation                | Extensible    | Inefficient      |
| Iterator               | Behavioral   | TV channel up/down   | Traverse collections                 | Uniformity    | Overhead         |
| Mediator               | Behavioral   | Air traffic control  | Central communication                | Simplicity    | Bottleneck risk  |
| Memento                | Behavioral   | Game save            | Undo/Restore state                   | Encapsulation | Memory           |
| Observer               | Behavioral   | News subscription    | One-to-many updates                  | Scalable      | Memory leaks     |
| State                  | Behavioral   | Turnstile at subway  | Behavior by state                    | Maintainable  | Many classes     |
| Strategy               | Behavioral   | GPS travel mode      | Switchable algorithms                | Run-time flex | Code bloat       |
| Template Method        | Behavioral   | Recipe               | Skeleton with customizable steps     | Consistency   | Inherit limits   |
| Visitor                | Behavioral   | Inspector visit      | New ops on object structures         | Easy extensn. | Intrusive        |

---

**Pro-Tip:**  
In interviews, focus on the *what* by clearly explaining the intent, structure, and motivation for each pattern, as well as how it addresses specific coding or architectural challenges in real systems.
