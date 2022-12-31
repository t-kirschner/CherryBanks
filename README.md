# CherryBanks
Project for university lecture. Represents simple bank account system in OOP:
- adding and deleting customers to/from bank
- choosing customers and adding/deleting different types of bank accounts
- deposit and withdraw amounts to/from accounts
- data is collected from console input
- actions are displayed on console output

To run the program you can execute the "Main.jar" (CherryBanks/src/main/kotlin/Main.jar) file on the Java Virtual Machine (JVM):

- Download and install the Java Development Kit (JDK)
- Open command line and navigate to the directory where the "Main.jar" file is located
- Enter the following command on the command line: "java -jar Main.jar"


If you want to compile the Kotlin code by yourself you need:

- The Java Development Kit (JDK)
- The Kotlin Compiler Plugin: This plugin adds the ability to compile Kotlin code to the JDK. You can install the plugin either from the command line or from your development environment.

Once you have installed the required tools, you can run the Kotlin application as follows:

- Open a command line and navigate to the directory where the Kotlin code ("Main.kt" file, "backend", "controlling" and "frontend" folders) is located.
- Run the "kotlinc-jvm -include-runtime Main.kt backend controlling frontend -d Main.jar" command to compile the Kotlin file into a Java archive (.jar file). This command also creates all the required classes and resources to run the application.

- Run the "java -jar Main.jar" command to run the application. You should now see the Main Menu of "CherryBanks".

If you are using a development environment such as IntelliJ IDEA or Eclipse, you can also run the Kotlin application directly from the development environment by executing the Run command.


Have fun banking!
