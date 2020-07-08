##Java: How To Program - Deitel - 10th Edition

**Java Core**

1. If a file contains java code its extension is: .***java***.
2. After compilation the IDE generate a file .***class***.
3. JVM is a virtual machine that runs java code through bytecodes. After compilation a java code generates bytecodes. 
The JVM communicate with the computer through machine language, so the program is executed. 
4. ClassName variable_name = new ClassName(Argument): This is called an instantiation. It's a **variable** of the type **ClassName**. New ClassName(Argument) creates an ClassName object.
5. JAVADOC: Are comments that you put in your code and after you can create a *html* document with it. 
6. Java calculation method:
   1. Division, multiplication and mod. Left to Right.
   2. Sum, Subraction and equivalency, after. Left to Right.

```
/**  Comment */
```
6. Classe's name: *ClassName*
7. Variable's name: *variableNameUsedFor*
8. Instead of importing a class, you could just use the fullname of the method that you are intending to use, ex: java.util.Scanner instead of Scanner, when you have imported the class into the code. 
9. Local variables aren't initialized by default, however instance's variables are indeed initialized by default. 
10. If you declare a default constructor in a class, the default constructor that a class have by default is overrided by the constructor created.
---

**Java Types and operators**

Primitives
|Type or Operator|Info|
|----|----|
|*int*|Integer Value|
|*float*|Decimal Values - 7 digits|
|*double*|Decimal Values - 15 digits|
|*char*|Characteres|
|*%* or *mod*|Return the decimal part in a division|
|==|Equal|
|!=|Difference|
| > | Greater than|
| < | Lesser than |
| >=| Greater than or equal to|
| <=| Lesser than or equal to|

---

**Java Identation**

1. *import* - Always before class name.
2. *java.lang* it's always imported in every class. 

---

**Console Commands**:

To compile through command line:
```
JAVAC filename.java

JAVAC -deprecation: inform which obsolete resource you are using.
```

To execute a java program:

```
JAVA filename
```

---

**Java Commands**:

```
System.out.println("Welcome\nto\nJava\nProgramming!")
\n Nova linha. Posiciona o cursor de tela no início da próxima linha.  
\t Tabulação horizontal. Move o cursor de tela para a próxima parada de tabulação.  
\r Retorno de carro. Posiciona o cursor da tela no início da linha atual — não avança para a  próxima linha. Qualquer saída de caracteres depois do retorno de carro sobrescreve a saída de  caracteres anteriormente gerada na linha atual.  
\\ Barras invertidas. Utilizadas para imprimir um caractere de barra invertida.  
\" Aspas duplas. Utilizadas para imprimir um caractere de aspas duplas. Por exemplo,  System.out.println("\"entre aspas\"");  exibe "entre aspas".
Deitel, Paul. Java: como programar (p. 35). Kindle Edition. 
```

```
System.out.printf("%s%n%s%n", "Welcome to", "Java Programming!");
Deitel, Paul. Java: como programar (p. 35). Kindle Edition. 

Presents the output under a specific format acording to % specification in the first argument. 
%s: determines a string type in the output. 
%n: jumps a line.
%d: decimal integer, fix a position in a string ahead. 
%f: for float.
%.2f: A float with 2 digits
%c: for char.

```
---

**Programming good practice**
1. Always choose a variable name according to its usability. 
2. Comments! Always!
3. Class name begin with uppercase, variables and methods names begin with lowcase. 
4. inJavaTheFirstLetterOfTheNextWordBeginWithUpperCase
5. this. is a good practice because it refers to the instance variable instead of the local variable inside the method.
6. 