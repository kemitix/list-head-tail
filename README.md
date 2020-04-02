# List Head/Tail

![Sonatype Nexus (Release)](https://img.shields.io/nexus/r/https/oss.sonatype.org/net.kemitix/list-head-tail.svg?style=for-the-badge)
![Maven Central](https://img.shields.io/maven-central/v/net.kemitix/list-head-tail.svg?style=for-the-badge)

Provides a `head()` and `tail()` implementation for `List<>` objects in Java.

## Usage

```java
import net.kemitix.list.HeadTail;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
class Usage {
  List<String> list = Arrays.asList("a", "b", "c");
  Optional<String> head = HeadTail.head(list);      // head()
  assertThat(head).contains("a");
  List<String> tail = HeadTail.tail(list);          // tail()
  assertThat(tail).containsExactly("b", "c");
}
```

Statically importing the `head()` and `tail()` methods will be more
readable and idiomatically FP.

```java
import static net.kemitix.list.HeadTail.*;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
class Usage {
  List<String> list = Arrays.asList("a", "b", "c");
  Optional<String> head = head(list);               // head()
  assertThat(head).contains("a");
  List<String> tail = tail(list);                   // tail()
  assertThat(tail).containsExactly("b", "c");
}
```
