# kotlin-lambda-crash

To build run `gradlew clean zipLambda`

Works fine with kotlin 1.1.3-2, crashes with kotlin 1.1.4-2 with the following stacktrace

```
Exception in thread "main" java.lang.Error: java.lang.TypeNotPresentException: Type chesterm8.kotlin.ScheduledEvent not present
	at lambdainternal.AWSLambda.<clinit>(AWSLambda.java:64)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:348)
	at lambdainternal.LambdaRTEntry.main(LambdaRTEntry.java:94)
Caused by: java.lang.TypeNotPresentException: Type chesterm8.kotlin.ScheduledEvent not present
	at sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:117)
	at sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:125)
	at sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)
	at sun.reflect.generics.visitor.Reifier.reifyTypeArguments(Reifier.java:68)
	at sun.reflect.generics.visitor.Reifier.visitClassTypeSignature(Reifier.java:138)
	at sun.reflect.generics.tree.ClassTypeSignature.accept(ClassTypeSignature.java:49)
	at sun.reflect.generics.repository.ClassRepository.getSuperInterfaces(ClassRepository.java:108)
	at java.lang.Class.getGenericInterfaces(Class.java:913)
	at lambdainternal.EventHandlerLoader.findInterfaceParameters(EventHandlerLoader.java:676)
	at lambdainternal.EventHandlerLoader.wrapRequestHandlerClass(EventHandlerLoader.java:714)
	at lambdainternal.EventHandlerLoader.loadStreamingRequestHandler(EventHandlerLoader.java:772)
	at lambdainternal.EventHandlerLoader.loadEventHandler(EventHandlerLoader.java:781)
	at lambdainternal.AWSLambda.findUserMethods(AWSLambda.java:105)
	at lambdainternal.AWSLambda.startRuntime(AWSLambda.java:272)
	at lambdainternal.AWSLambda.<clinit>(AWSLambda.java:62)
	... 3 more
Caused by: java.lang.ClassNotFoundException: chesterm8.kotlin.ScheduledEvent
	at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
	at java.lang.Class.forName0(Native Method)
	at java.lang.Class.forName(Class.java:348)
	at sun.reflect.generics.factory.CoreReflectionFactory.makeNamedType(CoreReflectionFactory.java:114)
	... 17 more
```