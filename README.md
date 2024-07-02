# hmkit-oem migration to hmkit-crypto-telematics

This repository shows on how to migrate from hmkit-oem to hmkit-crypto-telematics.

<!-- TOC -->
* [Use the new dependencies](#use-the-new-dependencies)
* [Add hmkit-oem classes manually](#add-hmkit-oem-classes-manually)
* [Run the sample](#run-the-sample)
* [Benefits](#benefits)
<!-- TOC -->

### Use the new [dependencies](./build.gradle.kts)
Use `implementation("com.high-mobility:hmkit-crypto-telematics:0.1")` instead of `hmkit-oem` and `hmkit-crypto`

### Add hmkit-oem classes manually
We add the main `HMKit.java` and `ContentType.java` classes from `hmkit-oem` manually to our project.

Check out the [HMKit.java/ContentType.java](./src/main/java/com/highmobility/hmkit/) classes that were copied to this project

### Run the sample

Check out the [Main.java](./src/main/java/Main.java). It uses `hmkit-oem` interface as usual

```java
import com.highmobility.hmkit.HMKit;

class Main {
  public static void main(String[] args) {
    HMKit hmkit = HMKit.getInstance();
    hmkit.decrypt(...)
    hmkit.encrypt(...)
  }
}
```

### Benefits

`hmkit-crypto-telematics` is written in pure Java, and therefore doesn't need to use the previous JNI libraries.
