**Workshop Tasks**

---

**Task 1: Create Modules and Define Their Dependencies**
1. Create two modules:

- `eu.chrost.math` – contains a `Calculator` class with the following methods:


```java
public int add(int a, int b);
public int subtract(int a, int b);
```

- `eu.chrost.main` – contains a `Main` class that uses the `Calculator` class.

2. In the `eu.chrost.math` module:
- Create a `module-info.java` file with the module declaration.

- Export the `eu.chrost.math` package.

3. In the `eu.chrost.main` module:
- Create a `module-info.java` file.

- Add a dependency on `eu.chrost.math`.

---

**Task 2: Use Transitive Dependencies**
1. Add a module `eu.chrost.utils` containing a `Logger` class.

2. Ensure that `eu.chrost.math` uses `Logger` and exports this dependency for other modules.

3. Use the `Logger` class in the `Main` class within the `eu.chrost.main` module.
   Was it necessary to modify the descriptor of this module?

---

**Task 3: Services with `provides` and `uses`**
1. Create an `Operation` interface in the `eu.chrost.math` module.

```java
public interface Operation {
    int apply(int a, int b);
}
```

2. Add two implementations: `Addition` and `Subtraction` in the `eu.chrost.math` module.

3. Modify the `Main` class so that instead of using the `Calculator` class, it dynamically discovers and uses the operation implementations.
   For each discovered operation, perform it on two arbitrary arguments.
   **Hint** : Use the `ServiceLoader` class provided by the JDK.

---

**Task 4: Use `opens` for Reflection Access**
1. Create a `eu.chrost.model` module containing a `Person` class with a single `String` field `name`.
   When declaring the field, assign it an initial value.
   **NOTE** : Do not export anything from the `eu.chrost.model` module.

2. Using reflection only, try to create an object of the `Person` class and read the value of the `name` field in the `Main` class within the `eu.chrost.main` module.
