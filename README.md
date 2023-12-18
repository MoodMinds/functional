# Functional Interfaces throwing checked exceptions

**Functional** is a collection of Functional Interfaces allowing declaration of throwing exceptions.

## In a Nutshell

**Functional interfaces with checked exceptions.** Multi-ary (up to 8 arguments) consuming and supplying generic functional
interfaces with checked exception parameters - `Executable[n][Throwing][n]`, `Evaluable[n][Throwing][n]`, `Testable[n][Throwing][n]`.

## Brief overview

The purpose of the functional interfaces provided in this project is to bring more than the functionality of JDK's existing
functional interfaces (Runnable, Consumer, Supplier, Function, and Predicate) by incorporating exception throwing capabilities.
By allowing declared exceptions to be thrown within these interfaces, they provide a more robust and flexible approach to handle
exceptional scenarios in functional programming.

### Advantages over JDK's Functional Interfaces

1. **Checked Exception Throwing**: Unlike JDK's standard functional interfaces, the interfaces in this project allow
for the declaration of exceptions. This feature simplifies error handling and promotes more reliable and maintainable code.
2. **Flexible Parameterization**: The functional interfaces in this project support a variable number of parameters for both
values and exceptions (ranging from 0 to 8), allowing for greater flexibility in designing functional operations. This enables
developers to define and work with operations that require a specific number of input parameters and throwing exceptions.
3. **Categorization of Operations**: The interfaces are categorized into three types (**Executable**, **Evaluable** and **Testable**) based
on their specific use cases. This categorization provides a clear distinction between different types of functional operations,
making the code more readable and maintainable.
4. **Consistent Naming Convention**: The interfaces follow a consistent naming convention, clearly indicating their purpose and
exception-handling capabilities. This helps developers quickly identify the appropriate interface based on their specific requirements.
5. **Seamless Integration**: These interfaces seamlessly integrate with existing Java code and libraries, allowing developers
to leverage the power of exception handling while maintaining compatibility with the Java ecosystem.

By utilizing these functional interfaces, developers can write more expressive and robust code that handles exceptions gracefully,
promotes code reusability, and provides better control over functional operations.

**Let's examine the usage of functional interfaces by examples**:

```java
import org.moodminds.function.Evaluable2Throwing2;
import org.moodminds.function.Executable1Throwing1;
import org.moodminds.function.Testable1Throwing2;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.text.ParseException;

class Sample {

    public void exec() throws IOException {

        Executable1Throwing1<String, IOException> executable = s -> {
            if ("s".equals(s)) throw new IOException(s);
        };

        executable.exec("d");
    }

    public long eval() throws IOException, SAXException {

        Evaluable2Throwing2<String, Long, Long, IOException, SAXException> evaluable = (s, l) -> {
            if ("s".equals(s)) throw new IOException(s);
            if (l == 34L) throw new SAXException(s);
            return l;
        };

        return evaluable.eval("d", 45L);
    }

    public boolean test() throws IOException, ParseException {

        Testable1Throwing2<String, IOException, ParseException> testable = s -> {
            if (s == "45") throw new IOException(s);
            if (s == "34") throw new ParseException(s);
            return true;
        };

        return testable.test("67");
    }

    public long func() {

        Evaluable2<String, Long, Long> evaluable = (s, l) -> l + Long.parseLong(s);

        return evaluable.eval("d", 45L);
    }
}
```

## Getting Started

Include **Functional** in your project by adding the dependency.

## Maven configuration

Artifacts can be found on [Maven Central](https://search.maven.org/) after publication.

```xml
<dependency>
    <groupId>org.moodminds.functional</groupId>
    <artifactId>functional</artifactId>
    <version>${version}</version>
</dependency>
```

## Building from Source

You may need to build from source to use **Functional** (until it is in Maven Central) with Maven and JDK 1.8 at least.

## License
This project is going to be released under version 2.0 of the [Apache License][l].

[l]: https://www.apache.org/licenses/LICENSE-2.0