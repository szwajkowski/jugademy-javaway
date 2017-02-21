# Simple app with dependency

* compiling sources with everything from libs/ directory on a classpath  
`javac -cp libs/* src/main/java/pl/poznan/jug/javac/*.java`

* running compiled classes with libs/ on a classpath  
`java -cp 'libs/*:src/main/java/.' pl.poznan.jug.javac.Main`
