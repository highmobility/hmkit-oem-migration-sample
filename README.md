# hmkit-oem migration to hmkit-crypto-telematics

This repository shows on how to migrate from hmkit-oem to hmkit-crypto-telematics.

<!-- TOC -->
* [Use the new dependencies](#use-the-new-dependencies)
* [Add hmkit-oem classes manually](#add-hmkit-oem-classes-manually)
* [Run the sample](#run-the-sample)
* [Benefits](#benefits)
<!-- TOC -->

### Use the new [dependencies](./build.gradle.kts)
We use `implementation("com.high-mobility:hmkit-crypto-telematics:0.1")` instead of `hmkit-oem`


### Add hmkit-oem classes manually
If we want to have the same interface as `hmkit-oem`, then we can add the main `HMKit.java` class manually to our project. 

Check out the [HMKit.java](./src/main/java/com/highmobility/hmkit/HMKit.java) class that was copied to this project


### Run the sample

Check out the [Main.java](./src/main/java/Main.java) to see that we can use hmkit-oem interface as usual

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
