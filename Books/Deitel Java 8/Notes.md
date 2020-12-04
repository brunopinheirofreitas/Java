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
7. Classe's name: *ClassName*
8. Variable's name: *variableNameUsedFor*
9. Instead of importing a class, you could just use the fullname of the method that you are intending to use, ex: java.util.Scanner instead of Scanner, when you have imported the class into the code. 
10. Local variables aren't initialized by default, however instance's variables are indeed initialized by default. 
11. If you declare a default constructor in a class, the default constructor that a class have by default is overrided by the constructor created.
12. A static method can be invoked by another static method, because a static method can be invoked without a class intantiation.
13. Double type is preferible than float due to its precision.
14. Break; if you want to break free of a interation.
15. Continue; basically does nothing, just avoid a certain condition.
16. A static method is a method that you can invoke through class_name.method. Hence, you don't have to creat an object of this class. It's different from using a variable, that you have instanciated from a class, and then usin '.' and the name of the method. Thus, you have 03 forms of inoking a method:
    1. In the same class, just invoking the name of the method.
    2. Through a variable that you have used to instantiate a class.
    3. Or using the name of the class.method, for static methods.
17. You can create a static attribute, which means the attribute is common for all objects of the class. (It's called Class variable, the set of static variables in a class is called 'field').
18. Pacotes de Java API são as bibliotecas Java.
19. 'FINAL' means that you have a variable that cannot be changed after initialization. 
20. array_name.lenght returns the lenght of the array.
21. Arrays are an object.
22. Try and Catch are used to treat exceptions. Any excepctions caught in an execution inside a 'try' will occasionate an execution of the block 'catch'. Any variable described in the block 'try' only exists in this block. 
23. JAVA doesn't have multidimensional arrays, every line in a multidimensional array is seen as a unidimensional array.
24. Array class has a sort of methods to manipulate arrays.
25. *this.* is a reference to a class variable of the object.
26. *return -1* when you want something to not return anything, but, beware, if you are dealing with numbers, this might result in a contabil error.
27. The first line in a class, when dealing with packages, should be the package name.
28. You can organize folders in eclipse in Navigator, however this could mess up your packages e make your code not to compile.
29. Classes should be classified by the name of the package + name of the class: PackageName.ClassName.java
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
| +=| Add a value |
| -=| Subtract a value |
| *=| Multiply a value |
| /=| Divide a value |
| %=| Set the remainder of a division to a variable  |
| ++a| Add 1 to a |
| a++| Use a, then increment 1|
| --b| Subtract 1 from b |
| b--| Use b, then decrease 1|
| ?:| Conditional, see statement below|
| &&| Conditional AND |
| II| Conditional OR |
|  &| Conditional AND that evaluate both conditions|
|  I| Conditional OR that evaluate both conditions|
|  ^| Conditional OR EXCLUSIVE| 
|  !| Conditional NOT|
|Enum| It's a class. You can creat a enum by creating an object of the type ENUM, ex private enum Status {value1, value2, value3}; hence, Status become a type and you can create a variable of this type, ex: Status var1. Var1 by default has the values: value1, value2 or value3. Moreove, a ENUM should have a string value over a numeric value, it's easier to read the code.|

---

###Enum
1. Enum are types.
2. Enum are implicit final and static.
3. Enum are objects in a roll.

```
	public enum Priority {
      
	MIN(1), NORMAL(5), MAX(10);
	
	private int valor;
	
	Priority(int valor) {
		this.valor = valor;
	}
	
	public int getValor() {
		return this.valor;
	}

}
```

enum.Name = Strings of the enum: MIN, NORMAL or MAX.
enum.Ordinal = Position in the roll of the enum: MIN = 0, NORMAL = 1 and MAX = 2.
enum.method = You can create methods in an enum, it work just like a class, however you can't instantiate a ENUM. 

Example of a mainclass invoking an enum class.
```
public class testeEnum {

	public static void main(String[] args) {
		
		Priority pMin = Priority.MIN;
		Priority pNormal = Priority.NORMAL;
		Priority pMax = Priority.MAX;
		
		System.out.println(pMin.name()); //should appear MIN
		System.out.println(pMin.ordinal()); // should appear 0
		System.out.println(pMin.getValor()); // should appear 1

	}

}
```



**Java Identation**

1. *package* - Always before *import*.
2. *import* - Always before class name.

---

**Important classes to import**
 
import java.math.BigDecimal;
- To work with monetary values.

import java.util.Scanner;
- To read values from keyboard.

import java.lang
- By default it's already imported in every java class.

import java.util.*
- Import every class from a package.
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
6. In a control instruction do not use a local variable. Ex: Do not use this.variable.
7. Normally control instructions are better in the main class.
8. API Java: http://download.java.net/jdk8/docs/api/ 
9. Always use UPPERCASE in constants.
10. Create variables near the part of the code they will be used.
11. You can create a bunch of methods with the same name and same or similar results. This is called overload methods. This happens, for instance, when you have different arguments for the same method, in cases that a method could receive different types to do the same thing.
12. You can count with arrays by doing:
```
++name[method];
\\ The position in the array will increment by the result
```
13. NullPointerException occour when you invoke a method with a null reference.
14. When using this. in an method, the logic lead us to look for an attribute in this class. If the attribute is inherited from another class, the good practice ask us to use super., this makes the code more practical to read.
15. When a method needs to be rewrited for a sonClass, the good practice ask us to maintain the same visibility, return, name and parameters, if it's case.

**Control Instruction and other objects**

*Declaration*

- private: only accesible by class, the opposite is public. **See more in Encapsulation**
- final: after initialization cannot be changed.
- static: assume the same value for all objects of the class.

```
private final static name_variable = initialization_value;
```
*Exceptions*
try {

}
catch (exception name) {
   here_you_treat_the_exception (sysout, for ex)
}

*Arrays*
```
int [] name = new int [lenght];
String[] name = new String[length], name2 = new String[lenght];
int [] name = { 1, 2, 3, 4, ...};
```

*Multidimensional Arrays*
```
int[][] name = new int [length][lenght];

int[][] name = new int [length][];
name[0]  = new int [length];
name[1]  = new int [length];
-- Create first lines, then columns. Each line can have different lenght.

int[][] name = {{value1, value2}, {value3, value4}};
-- First element is line, second element is column
-- The position in the multidimensional array is automaticaly aproprieted by the number of elements of the line or column, hence are the values responsible to set the lenght of a dimension in an array.

array.lenght -> returns the lenght of the line.
array[line].length -> returns the lenght of the columns.
```

*Unknown lenght of a argument in a method*
- You can pass in an argument of a method an array with a unknown lenght. You only have to specify the type.

```
Method(type... name)
```

- Three types: 
  - Sequency
  - Selection
    - if, if-else, switch, else if
  - Repetition
    - for, while, do-while

*if*
```
if (condition){
   statement;
}
```` 

*if-else*
```
if (condition){
   statement;
} else {
   statement;
}
``` 
*else if*
```
if (condition){
   statement;
} else if (condition) {
   statement;
} else if (condition) {
   statement;
} else {
   statement;
}
```

*?:*
```
(booleanExpression ? statement if true : statement if false)
Example:
println(StudentGrade>=60 ? "Passed" : "Failed");
```

*while*
```
while (condition) {
   statement;
}
```
**For**
```
for (initialization; condition; increment) {
   statement;
}

-- to get elements of an array
for (parameter : arrayName) {
   statement;
}
```

**Do---While**
```
do {
   statement;
} while (condition);
```

**Case**
```
switch(condition) {
   case condition match:
      statement;
      break; 
   case condition match: case condition match: case condition match: 
      statement;
      break;
   default:
      statement;
      break;
}

