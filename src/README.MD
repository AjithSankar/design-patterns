# Java Design Patterns Cheat Sheet (All 23 Patterns)

This README gives a concise yet thorough interview-ready guide to the **23 classic Gang of Four (GoF) design patterns**—divided into *creational*, *structural*, and *behavioral* categories. For each pattern:
- **What:** summary
- **When to Use:** typical scenarios
- **Analogy:** memorable real-world parallel
- **Pros & Cons:** main advantages and drawbacks

---

## Creational Patterns

### 1. Singleton

**What:** Ensures a class has only one instance and provides a global access point.

**When to Use:**
- When only one class instance is needed (configuration, logging).

**Analogy:**
- President of a country—only one official at a time.

**Pros:**
- Controlled single instance
- Lazy initialization possible

**Cons:**
- Difficult to test/mocks
- Encourages global state

---

### 2. Factory Method

**What:** Defers instantiation to subclasses by defining an interface for creating an object.

**When to Use:**
- When you want child classes to decide how to instantiate objects.

**Analogy:**
- Different factories (car, bike) producing vehicles based on request.

**Pros:**
- Decouples object creation from use
- Supports adding new types easily

**Cons:**
- More classes
- Slightly more complexity

---

### 3. Abstract Factory

**What:** Produces families of related objects without specifying their concrete classes.

**When to Use:**
- When your system needs to support multiple product families (e.g., UI themes: light vs. dark).

**Analogy:**
- IKEA: Sell different furniture sets for kitchen/bedroom, all matching.

**Pros:**
- Ensures product compatibility
- Clean interfaces

**Cons:**
- Difficult to add new families
- Lots of boilerplate

---

### 4. Builder

**What:** Separates construction of complex objects from their representation—stepwise construction.

**When to Use:**
- Creating objects with many optional fields.

**Analogy:**
- Making a burger with various custom ingredients in sequence.

**Pros:**
- Greater control over construction
- Immutable objects possible

**Cons:**
- More code
- Sometimes overkill for simple cases

---

### 5. Prototype

**What:** Clone objects instead of reallocating, using a prototype instance.

**When to Use:**
- When instances are expensive or complicated to create.

**Analogy:**
- Photocopying a key instead of cutting a new one from scratch.

**Pros:**
- Speeds up object creation
- Reduces complexity

**Cons:**
- Deep/shallow copy issues
- Cloning can be tricky

---

## Structural Patterns

### 6. Adapter

**What:** Converts one interface to another, allowing incompatible systems to work together.

**When to Use:**
- Integrating incompatible APIs/libraries.

**Analogy:**
- Power plug adapter for EU device in US socket.

**Pros:**
- Reuses existing code
- Increases compatibility

**Cons:**
- Extra layer
- Can reduce performance

---

### 7. Bridge

**What:** Decouples abstraction from implementation so they can vary independently.

**When to Use:**
- When you need to combine and extend two dimensions independently.

**Analogy:**
- TV remote controls (UI) for multiple TV brands (implementations).

**Pros:**
- Flexibility
- Easier to extend

**Cons:**
- More abstraction
- Sometimes overdesign

---

### 8. Composite

**What:** Lets you treat individual objects and compositions uniformly (tree structure).

**When to Use:**
- When working with recursive tree structures (file system, menus, org charts).

**Analogy:**
- Folder (can contain files or subfolders, all manipulated the same way).

**Pros:**
- Simplifies client code
- Flexible structure

**Cons:**
- Can hide complex hierarchies
- Difficult to enforce constraints

---

### 9. Decorator

**What:** Adds behavior to objects at runtime without modifying their code.

**When to Use:**
- When you need flexible, combinable modifications to objects.

**Analogy:**
- Wrapping a present—more layers = more decoration.

**Pros:**
- No subclass explosion
- Combine effects dynamically

**Cons:**
- Many small classes
- Debugging more complex

---

### 10. Facade

**What:** Simplifies interaction with complex subsystem by offering a single API.

**When to Use:**
- When you want to shield clients from a complex subsystem.

**Analogy:**
- Universal TV remote: one control, many devices behind the scenes.

**Pros:**
- Easier use
- Decouples client and subsystem

**Cons:**
- Can become a god object
- Extra abstraction

---

### 11. Flyweight

**What:** Shares common state across many objects to save memory.

**When to Use:**
- Many small, similar objects (game pieces, icons).

**Analogy:**
- Chess pieces: physically identical pawns are reused on different squares.

**Pros:**
- Major memory savings
- Efficient

**Cons:**
- Complicates code
- Split between shared and unique state

---

### 12. Proxy

**What:** Provides a surrogate for an object to control access/resources.

**When to Use:**
- Access control, lazy loading, logging, caching.

**Analogy:**
- Receptionist screening visitors before allowing access.

**Pros:**
- Adds security, caching, etc.
- Transparent to client

**Cons:**
- Adds indirection
- Can affect performance

---

## Behavioral Patterns

### 13. Chain of Responsibility

**What:** Sends requests down a chain until handled (or end of chain).

**When to Use:**
- Multiple possible handlers, all decoupled from sender.

**Analogy:**
- Helpdesk call escalated from intern to supervisor to manager.

**Pros:**
- Decouples sender & handlers
- Flexible chain construction

**Cons:**
- Request may go unhandled
- Can be hard to trace

---

### 14. Command

**What:** Encapsulates requests/operations as objects.

**When to Use:**
- Queuing, logging, undo/redo, parameterizing actions.

**Analogy:**
- Restaurant order: waiter writes command, kitchen executes it.

**Pros:**
- Supports undo, logging, queuing
- Decouples sender & receiver

**Cons:**
- Many classes
- Somewhat verbose

---

### 15. Interpreter

**What:** Defines grammar for simple “language,” interprets statements/sentences.

**When to Use:**
- When you need domain-specific languages or expression processing.

**Analogy:**
- Calculator parsing formula input.

**Pros:**
- Flexible for new grammar
- Easy extension

**Cons:**
- Poor performance for complex grammars
- Can get unwieldy

---

### 16. Iterator

**What:** Provides a uniform way to traverse collections.

**When to Use:**
- When you need to traverse complex structures (lists, maps, trees).

**Analogy:**
- TV channel up/down button moves through channels sequentially.

**Pros:**
- Unified traversal interface
- Hides collection internals

**Cons:**
- May add overhead
- Can expose implementation if not careful

---

### 17. Mediator

**What:** Centralizes complex communications and control between related objects.

**When to Use:**
- Objects communicate in a complicated mesh.

**Analogy:**
- Air traffic control: planes don’t communicate directly, but via control tower.

**Pros:**
- Reduces direct coupling
- Simplifies object relationships

**Cons:**
- Mediator can become complex
- Centralized bottleneck risk

---

### 18. Memento

**What:** Captures and restores an object's state without exposing details.

**When to Use:**
- Undo, rollback, or history features.

**Analogy:**
- Game save—return to last checkpoint.

**Pros:**
- Supports undo/restore
- Object encapsulation preserved

**Cons:**
- Can use a lot of memory
- Difficult with big objects

---

### 19. Observer

**What:** One-to-many dependency—subscribers automatically updated on changes.

**When to Use:**
- Event systems, GUIs, pub-sub.

**Analogy:**
- You follow someone on social media; you’re notified of their new post.

**Pros:**
- Loose coupling
- Dynamic subscription

**Cons:**
- Unpredictable notification order
- Potential memory leaks

---

### 20. State

**What:** Alters object behavior when its state changes.

**When to Use:**
- When an object’s behavior varies by state (vending machines, TCP connections).

**Analogy:**
- Turnstile at subway—locked, unlocked, alarmed states drive different behavior.

**Pros:**
- Removes big switch statements
- Clearer code

**Cons:**
- More classes
- May be overkill for simple cases

---

### 21. Strategy

**What:** Defines a family of algorithms, encapsulates, and switches them at runtime.

**When to Use:**
- When multiple interchangeable behaviors (sorting, compression, etc.).

**Analogy:**
- GPS route: choose driving, walking, cycling.

**Pros:**
- Open/closed principle
- Switch strategy at runtime

**Cons:**
- More objects
- Code navigation can be trickier

---

### 22. Template Method

**What:** Outlines skeleton of algorithm in base class; subclasses override steps.

**When to Use:**
- Algorithms with fixed steps plus customizable hooks.

**Analogy:**
- Recipe: prepare, cook, serve—subclasses change only the ingredients.

**Pros:**
- Reuse code for invariant parts
- Enforces structure

**Cons:**
- Inflexible for major changes
- Inheritance can be limiting

---

### 23. Visitor

**What:** Adds new operations to an object structure without modifying the elements.

**When to Use:**
- Performing unrelated operations across classes in a structure.

**Analogy:**
- Health inspector visits departments; each department takes different action.

**Pros:**
- Add operations easily
- Good for traversals

**Cons:**
- Hard to add new structure types
- Breaks encapsulation if not careful

---

## Summary Table

| Pattern Name            | Category      | Real-World Analogy                    | Key Strength                             | Typical Use Case                   |
|------------------------|--------------|---------------------------------------|------------------------------------------|------------------------------------|
| Singleton              | Creational   | President                             | Strictly one instance                    | Config, caching, logging           |
| Factory Method         | Creational   | Vehicle factory                       | Decoupled creation                       | Object creation delegation         |
| Abstract Factory       | Creational   | IKEA furniture set                     | Product set consistency                  | UI toolkit themes                  |
| Builder                | Creational   | Custom burger                         | Step-by-step, complex object creation    | Objects with many options          |
| Prototype              | Creational   | Photocopy                             | Fast cloning                             | Dungeon map, graphical shapes      |
| Adapter                | Structural   | Plug adapter                          | Interface compatibility                  | Integrate external systems         |
| Bridge                 | Structural   | Universal remote                      | Abstraction from implementation          | Graphics, cross-platform UIs       |
| Composite              | Structural   | File system hierarchy                 | Treat individual/collection uniformly    | UI trees, menu hierarchies         |
| Decorator              | Structural   | Gift wrapping                         | Dynamic behavior addition                | Streams, windowing systems         |
| Facade                 | Structural   | Universal remote                      | Simplified subsystem access              | Wrapper APIs                       |
| Flyweight              | Structural   | Chess pieces                          | Efficient memory for many objects        | Text rendering, icons              |
| Proxy                  | Structural   | Receptionist                          | Controlled access                        | Caching, remote proxies            |
| Chain of Responsibility| Behavioral   | Helpdesk escalation                   | Flexible pipeline of handlers            | Logging, authorization, filters    |
| Command                | Behavioral   | Restaurant order                      | Encapsulated commands                    | Undo/redo, macro recording         |
| Interpreter            | Behavioral   | Calculator                            | Grammar evaluation                       | Scripting, formula parsing         |
| Iterator               | Behavioral   | TV remote sequential buttons          | Standard traversal                       | Collections                        |
| Mediator               | Behavioral   | Air traffic control tower             | Simplified object coordination           | Chat servers, UI forms             |
| Memento                | Behavioral   | Game save                             | State snapshots                          | Undo/redo, history                 |
| Observer               | Behavioral   | Social media follow                   | Pub-sub notifications                    | GUIs, event systems                |
| State                  | Behavioral   | Turnstile                             | Clean stateful behavior switch           | Workflow, protocol handling        |
| Strategy               | Behavioral   | GPS transportation mode               | Algorithm family interchange             | Sorting, authentication            |
| Template Method        | Behavioral   | Cooking recipe                        | Workflow skeleton                        | Report generators, ETL pipelines   |
| Visitor                | Behavioral   | Health/safety inspector               | Separate operations from structure       | XML, AST traversals                |

---

**Tip:** Learn these patterns by:
- Knowing their intent and structure
- Implementing at least one example project per pattern
- Explaining real-world analogies and trade-offs confidently—exactly as above—in interviews[1]