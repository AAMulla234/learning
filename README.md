# JAVA 8,9, 10, 11 learning
JAVA learning 

Private method in Java 9


As we know till Java 7, we are not allowed to add any concrete function to the Interface, All the function should be abstract and must be implemented in Child class which is implementing the interface. i.e. an interface can only have
Constant variable
abstract method

With Java 8, we can add static and default method as well in an Interface. Check my blog on Java 8 for more details. So, an Interface now can have
Constant Variable
Abstract Method
Default Method
Static Method

and with Java 9, It become more powerful and now we can add private method and private static method. but why do we need private function in an Interface. Let’s understand this with an example

![image](https://user-images.githubusercontent.com/53477084/118476588-5277ed00-b72b-11eb-9c83-68b41b053584.png)

Rules For using Private Methods in Interfaces

Private interface method can be static or instance and In both cases, the private method is not inherited by sub-interfaces or implementations.
Private interface method cannot be abstract. it will give compiler error.
Private method can be used only inside interface and other static and non-static interface methods.
Private non-static methods cannot be used inside private static methods.
We should use private modifier to define these methods and no lesser accessibility than private modifier.
