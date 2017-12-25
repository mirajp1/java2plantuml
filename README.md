# Java2Plantuml
This is a library which started from the CMPE202 course project [UML-Coder](https://github.com/nguyensjsu/uml-coder-2017). There was a need to develop a library which converts the java source code into plantuml syntax and then feed it to plantuml library to generate class diagrams.


## Using jar file

  1. Use the following command to use the jar file.
     ```sh
        java -jar java2plantuml.jar source
     ```
     "source" can be path to file or a folder.
  2. File "ouput.puml" will be generated with plantuml syntax for class diagram.

## Use it in existing project

1. Look into example on how to use the api for generating class diagram syntax into MainDriver.java file.