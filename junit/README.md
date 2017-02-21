# Running tests with JUnit

* compile sources:

`javac -cp libs/* src/main/java/pl/poznan/jug/javac/*.java`

* compile tests:

`javac -cp libs/junit-4.12.jar:src/main/java/. src/test/java/pl/poznan/jug/javac/HelloTest.java`

* run tests:

`java -cp 'libs/*:src/main/java/.:src/test/java/.' org.junit.runner.JUnitCore pl.poznan.jug.javac.HelloTest`

* run compiled classes:

`java -cp 'libs/*:src/main/java/.' pl.poznan.jug.javac.Main`

* build jar from compiled classes and dependencies:

`jar cvfm javac.jar MANIFEST.MF -C src/main/java/ . libs/`

* run jar

`java -jar javac.jar`
