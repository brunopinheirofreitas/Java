#Java Notes

- Notes from Java: How To Program - Deitel - 10th Edition and Alura online course.

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
30. Use the statement IMPORT to import some packages, which means you do not have to use the FQN of the class when importing.
31. It's common to organize classes in packages. In a class should be:
    1.  import first
    2.  package after
32. Function Object: An object that encapsule a function, for instance, when you override a method from a superclass to attend specific proposit.
33. Anonymous class: When you create an class in the mid of a code. The compilator automatic creates the class for you.
34. Lambdas: '->' it's a form to diminish coding. An anonymous class, for instance, is automatic created when you use lambdas, the main goal is to shorten the code you write.
35. ```private static final long serialVersionUID = 1L;``` //This identify the version of the class, therefore all objects of this class could be different.
36. transient means the attribute should not be serializied.
37. ArrayList aren't good if you want to change/remove elements in some position, however it's good to return a specific element in a position and to add elements.
38. Linkedlist is good if you have a list that changes it's elements a lot, by removing it, for instance, however itsn't good to return a specific element in a position or to add elements. Linked keeps order.
39. Map is a class, it work like a data structure based in a key and a value. In this structure, if you repeat a key, its value is overrided.
40. The "hash" term in hashSet and hashMap means that the group is organized by a special form o table that group similar elements, making the searching for an element much more faster than using normal Sit or List classes.
41. Lambdas and method references are forms to shorten the quantity of code that you write. Lambdas is known by '->' and usefull when handling anonymous class with one method different from 'default' or 'abstract'. 
42. Methods Reference are like lambdas, however using it you invoke a specific method from a class.
43. After java 8, every collection has a Stream method. A Stream is a stream of objects, it's not a collection, hence the form to handle data is different.
44. The manjor classes to handle time and date are: java.time
45. It's possible to return the a object of the class in a method within the class. Ex: return this, will return an object of the class.
46. Test Data Builders are classes that construct the data that you must have to evaluate your class through test classes.
47. Low dependecy is when you have classes and methods that can work independently, despeite the fact that your code will have a strong depedence for other classes, those other class has implemented methods and attributes that can work separetadly and any changes on those methods or attributes might not make any differece in your code.
48. When handling tests, it's possible to wait for an exception by doing @Test(expected=RuntimeException.class).
49. ENUM is an object that receives a specific value predfined.
50. @Deprecated means somethins is old/not to be used.
51. ..ToMany: Whem using this notation in a code, API JPA uses Lazyness to execute queries that have relation ToMany. This makes the performance better due to the fact that those queries are executed only when needed.
  - @OneToMany(mappedBy="attribute", fetch = FetchType.EAGER): Opposite of lazyness, API JPA will execute queries with ToMany relations since the begining.
52. DAO is a project pattern, the idea is to create a layer between DATA and CODE, DAO menas Data Access Object.
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
|Enum| It's a class. You can creat a enum by creating an object of the type ENUM, ex private enum Status {value1, value2, value3}; hence, Status become a type and you can create a variable of this type, ex: Status var1. Var1 by default has the values: value1, value2 or value3. Moreove, a ENUM should have a string value over a numeric value, it's easier to read the code. Or you can create in a separeted class, like a type.|
|->| Lambdas|
|::| Method References. Is equivalent to lambdas, but you invoke a specific method of a class, ex: System.out::println|

---

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

import java.lang.number
- Motherclass of all numeric types in java. You can create a reference of Number to manipulate different types.

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
16. Always organize your classes in a package.
17. To specify a data structure to only use a type, use <>, ex: ArrayLlist<Type> array1. The variable array1 only can store information of the *Type*.
18. Unicode is the best option to handle special characters and UTF-8 is the best encoding, normally you have:
    1.  Unicode it's a table that transliterate the char in a codepoint.
    2.  The Codepoint need to pass through an encoding, normally those encoding are:
        1.  ASCII, UTF8, UTF16, windows 1252
19. Use serialVersionUID when creating a class.
20. Generic is GOOD, specific is sometimes BAD.
21. HashSet is better to handle large amount of elements, however for basic purpose, such as finding an element or using a specific position, lists are better.
22. hashCode is a good practice for working with strings, to see if them are equals.
23. Iterator == foreach, pretty common in old java.
24. Vector is thread-safe, because it's sincronyzed.
25. Not sure about what type of collection to use, declare Collection, because it's a motherClass and after that you can decided what to use. Remember, List and Set are sonClasses of Collection. And do not mistake Collection with Collections. Collection is a motherClass and Collections is an interface.
26. TreeSet keeps order and do not allow repetition of elements.
27. hash make things faster. Link order this. Set store things without the need of order.
28. ```default``` statement it's used when a method within an interface have a body. Ex: ```default void sort(...)```.
29. It's a good idea to use an anonymous implementation inside a class, without to have to create another class just to use a few methods, for instance:
30. Try to begin by the tests.
31. Pay attention to class responsabilities. For instance, Dao class should not instantiate Entity Manager. Always pass the responsability of dependencies and other things to classes that will invoke your methods. 
32. The model should have the @NamedQueries notation, because JPA is OO and you will use classnames and attributes.
```
Consumer<String> stringEater = new Consumer<String>() { //By doing this I can use the method **accept** without creating a class
   @Override
   public void accept(String s) {
      System.out.println(s);
   }
}
```
30. Anonymous class is praticle.
31. It's a good pratcice to use anonymous class implementations as an argument for something, however compromise legibility. ex:
```
forEach(new Consumer<String>() { 
   @Override
   public void accept(String s) {
      System.out.println(s);
   }
});
```
32. If possible, use lambdas to shorten your code:
```
//The code above using lambdas:
forEach((String s) -> {
   System.out.println(s);
});
//-------------shorten more-----------
forEach(s -> System.out.println(s));
```
32. Fucntional Interface is an interface with one abstract method, lambdas work in this cases. Resuming: Lambdas only work with functional interfaces that has one abstract method and receive one argument. The function interface can also have default or statics methods, however, only one abstract method.
33. Using lambdas:
```
//----------Withou lambdas

public class StringOrdenation {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        Comparator organizedByLenght = new SizeComparator();
        words.add("Fazenda vegana");
        words.add("Farm of the godd will");
        words.add("Armamento do amor");
        words.add("Trator de paz");
        words.add("Zigdust Stardust");
        
        System.out.println("---------Using Java 8------------");
        words.sort(organizedByLenght); //Java8, arguments are shorter
        System.out.println(words);
        
}


public class SizeComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
    }
    

}

//----------With lambdas

public class StringOrdenation {

    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        Comparator organizedByLenght = new SizeComparator();
        words.add("Fazenda vegana");
        words.add("Farm of the godd will");
        words.add("Armamento do amor");
        words.add("Trator de paz");
        words.add("Zigdust Stardust");
        
        System.out.println("---------Using Java 8 with lambdas------------");
        words.sort((s1, s2) -> {
        if(s1.length() < s2.length())
            return -1;
        if(s1.length() > s2.length())
            return 1;
        return 0;
      });
        System.out.println(words);

      System.out.println("---------Using Java 8 with lambdas, even more short------------");
        words.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println(words);
        
}
```
34. In Java8 you have a class called Factory, it has usefull methods. Using methods references (::) you can shorten even more coding, because you can pass those methods references as arguments, invoking specific methods.
35. import static is a good option for test classes, avoiding you to write Assert. many times.
36. Think small to think big. Maybe it'd a good idea to think first in methods and last in classes, since  you can use your IDE to create those methods in a class after.
37. Try to use *@before* and *@after* in your test classes to help you see through it.
38. It's not possible to test a class by referencing throws statements.
39. Arrays.asList: Create a list of objects automaticaly.
40. ..ToOne: Will be always connected by a FK.
41. TypedQuery<Type> name = EntityManager.createQuery(variableName, className): Specify what you are doing in your code, turns it easier to read.
  - variableName: is a String that stores the SQL query.
  - variableName.getResultList(): execute query
42. When using JPA remember: You are dealing with OO, hence use the class names, not the table names. JPA is caseSensitivy.
43. AVG always with double.
44. Use criteria for dynamic queries.

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

Arrays can be created using primitive types and other objects: 

```
//Primitive
int [] name = new int [lenght]; // creating an int array
String[] name = new String[length], name2 = new String[lenght]; //referencing a position of an array with a object
int [] name = { 1, 2, 3, 4, ...}; //creating a literal array

//When using primitives, the default value of an array is 0.

//Other objects

Class Conta {
   int conta;
}

TestaArrayObject {
   Main {
      Conta [] contas = new Conta [5];
   }
}

//When creating arrays from objects, the default value of an array is NULL.
//A reference is when you handle an and object in a code. 
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

Method(type... name)
```

- Three types: 
  - Sequency
  - Selection
    - if, if-else, switch, else if
  - Repetition
    - for, while, do-while
```
*if*
```
if (condition){
   statement;
}
```
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
```
##Encapsulation

Public - You can access this information at any moment.
Private - You can only access this information through an object of the class.
Protected - You can access this information through an object of the class or through objects from classes that inherits this attribute.

1. A public thing is visible anywere.
2. A private thing is visible only in its own package.
3. A protected thing is something accessible by sonclasses that extends motherclasses, however the sonclass doesn't need to be in the same package, hence protected is visible in the same package and visible in other packages since the class extends another motherclass which have an protected attribute.
4. defaut or package private is a thing visible only in the class and in the same package. 

---

##Abstract concept

The abstrat concept represents the idea of something needed for the logic, however there will be no objects of this thing in the code. 

**Abstract Classes**
You cannot instatiate abstract classes. 
If the abstract class is a superClass, the sonClass are obliged to implement abstract methods.
You do not have to implement abstract methods in the abstract class. 

**Abstract Methods**
sonClasses are obliged to implement abstract methods inherited from superClasses. 

---

##Classes

**Creating a class:**
```
public abstract classFuncionario
```
where:
|public|abstract class|Funcionario|
|------|--------------|-----------|
|Public, private, protected: visibiliy/encapsulation|can't instantiate because is an abstract conecept|ClassName|

**Creating an instance:**
```
Funcionario g1 = new Funcionario();
```

where:

g1 is a variable of the type Funcionario. 
new Funcionario() creates an object of the Class Funcionario. 

**Creating an instance using polymorphism**

```
Funcionario g1 = new Gerente();
```

where:

g1 is a variable of the type Funcionario. 
new Gerente() creates an object of the class Gerente.
This is only possible because Gerente is a sonClass of the superClass Funcionario.

---

##Inheritance

*extends*

```
public class Gerente extends Funcionario
```

Gerente => Son Class
Funcionario => MotherClass or SuperClass

When a class inherits another, it inherits all characteristics of the superClass, this means it inherits attributes, methods and behaviors. However, sonClasses do not inherits constructors.  
Gerente is a Funcionario.

Constructor are not inherited. You have to create a constructor in the sonClass, or use super. to invoke constructors from superClasses.

To use the superClass's constructor/method in a sonClass you have to use the statement super(). You can create a specific method/constructor in the superClass and use it in the sonClass, as bellow. Anyhow, you can just invoke the default superCLass's method/constructor .
The code *super.* should also bring superClass's methods.

```
public class ContaCorrente extends Conta {

        public ContaCorrente() { //uses the superClass constructor
            super();
        }
}
```

**Simple x Multiple Inheritance**

A class cannot extends multiple classes, this is called multiple inheritance, it is not allowed in Java.
Simple inheritance is when a class inherits only one superClass, this is the only way in Java.

Code not allowed in Java:
```
public class Gerente extends Autenticavel, Funcionario
```

--- 

##Methods

A method signature is the form needed to invoke the method. For instance, maybe you have to input some parameters, maybe not. 

Rewriting a method occur when you have a method in the superClass and you rewrite it in the sonClass, aiming a specific result for a class that inherits another. In this case the method in the sonClass have priority over the method in the superClass. A rewrite method must have the same original method's characteristics, such as return type and encapsulation.

Method overload is when you have more than one method with the same name, doing basicaly the same thing, the only differece will be the arguments.

**Abstract Methods**

Same logic of Abstract Classes. You do not want the method to return anything, but the method, due to logic, should exists in a superClass. All in all, the method do not have a body.
An abstract item in a superClass oblige the sons to implementate the actions expected.

```
        public abstract double getBonificacao();
```
|public|abstract|double|getBonificacao()|
|------|--------|------|----------------|
|Encapsulation: public, private, protected|The method do not have a body|type|MethodName|

**Method Override**
Occurs when you recreate a superClass's method in a sonClass body. Normally, IDE allows the use of shortcuts to help you handle those modifications.
Override is a notation in the code that helps the compilation proccess, informing that the intention is to override a method.

```
        @Override
        public method {

        }
```

---

##Polymorphism

Exists due to inheritance.

```
Funcionario g1 = new Gerente();
```

You can only create this because:
1. Funcionario is a generic type.
2. Gerente is a specific type of Funcionario. Gerente inherits Funcionario.

By doing this:
1. You created an object Gerente of the type Funcionario.
2. You can make your code smaller, for instance, if you have a simmilar method for some classes, you can create a more generic method that absorb the needs of all classes, and by doing this your code will be smaller, you will write less and maintenance will become easier. By creating an object of a more generic type you can just invoke this method. Example:

```
public boolean transfere(double valor, Conta destino) {

    if(this.saca(valor)) {
        destino.deposita(valor);
        return true;
    } else {
        return false;
    }
}
```
3.  This method will work with any son of the class Conta.
   
---

##Interface

Interfaces are *intermediate classes* between sonClasses and superClasses. It is needed to attend particular needs, like, methods or attributes that only make sense for some sonClasses. 

An interface is an abstract class, moreover, when a class *implements* a interface, it do not inherits nothing. However, abstract objects must be implemented in the class that *implements* the interface.

An interface is a type, hence you can create objects from it.

A class can *implements* multiple interfaces.

**Interface**
```
public abstract interface Autenticavel {

        public abstract void setSenha(int senha);

        public abstract boolean autentica(int senha);

}
```

**Class implementing a interface**
```
public class Gerente extends Funcionario implements Autenticavel, Bonificavel {

}
```

---

##Variable Size

|Type|Lenght|Wrappers|
|----|------|-----------------------|
|boolean|1 bit|java.lang.Boolean|
|byte|1 byte|java.lang.Byte|
|short|2 bytes|java.lang.Short|
|char|2 bytes|java.lang.Character|
|int|4 bytes|java.lang.Integer|
|float|4 bytes|java.lang.Float|
|long|8 bytes|java.lang.Bytes|
|double|8 bytes|java.lang.Double|

##Variable Manipulation

**Casting**
To use when you want to convert numbers, usually *double* to *int*.

```
double salario = 1270.50;
int valor = (int) salario;
```

**Implicit and Explicit Casting**
|From/To|byte|short|char|int|long|float|double|
|-------|----|-----|----|---|----|-----|------|
|byte|----|Impl.|(char)|Impl.|Impl.|Impl.|Impl.|
|short|(byte)|----|(char)|Impl.|Impl.|Impl.|Impl.|
|char|(byte)|(short)|----|Impl.|Impl.|Impl.|Impl.|
|int|(byte)|(short)|(char)|----|Impl.|Impl.|Impl.|
|long|(byte)|(short)|(char)|(int)|----|Impl.|Impl.|
|float|(byte)|(short)|(char)|(int)|(long)|----|Impl.|
|double|(byte)|(short)|(char)|(int)|(long)|(float)|----|

Implicit means that the value of the variable fits the *bigger* type. 
Explicit means the you'll lose part of the information when casting. That's why you have to write the conversion by doing (type), see the code above.

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

##Code Smells
Too many conditionals. 

---

###JAVADOC and Notes
Javadoc: 
```
/**
*
*   @AuthorName. Give a information about this part of the code.
*
*/
```

Notes
- A substitute for the former way of notations, XML.
- Use @ instead of XML. Example:

```
@basic
@column
@Id
@Entity
@table
```

- By doing this, a library knows how to read this configuration and know , for instance, what that method does. The purpose for those notes is to configurate some details for some libraries.
- Ex: JPA, Hibernate. Those libraries know how to read notes. 
- Notes are like a class, you can create your own.

---

###Exceptions

- Normally, compilators stack blocks of code when executing a code. When encountering an error, the compiler stops when the error occour if the error is not handled by the code.

Consider this:

```
Main {
    method 1 {
        method 2
    }
}
```

When executing, stacks are:
    - Main
    - Main > Method1
    - Main > Method1 > Method2
    - Main > Method1
    - Main

Every exception launched shows the position in the stack where the error occour and the line.

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
    at Fluxo.metodo2(Fluxo.java:22) // top stack, line 22
    at Fluxo.metodo1(Fluxo.java:12) // middle stack, line 12
    at Fluxo.main(Fluxo.java:6) // bottom stack, line 6
```

**Try and Catch**

```
try {
}
catch (exception_name variable) {
   here_you_treat_the_exception (sysout, for ex)
} catch (exception_name variable) {
   here_you_treat_the_exception (sysout, for ex)
} catch (exception_name variable) {
   here_you_treat_the_exception (sysout, for ex)
}
```
- You can use the Try-Catch in any part of the code that are relationad with the part of the code that can generate an exception.
  - That's why the exceptions shows the stack of execution and the line.
- You can have multiples parameters in catch statement:

```
try {
}
catch (exception_name | exception_name | exception_name variable) {
   here_you_treat_the_exception (sysout, for ex)
}
```

- 'Variable' is a reference, so you can use . to invoke methods of this reference. Ex:
  - variable.printStackTrace();
  - variable.getMessage();

```
try {
            metodo1();      
        } catch(ArithmeticException ex) {
            ex.printStackTrace();
        }       
```
**Throw**

You use 'throw' to create an exception in a code. As exceptions are classes, you can create an object of this class and throw your own exceptions. Ex:

```
ArithmeticException ex = new ArithmeticException("Deu errado");
        throw ex; //could be throw new ArithmeticException();

When executing:
    java.lang.ArithmeticException: Deu errado
    at Fluxo.metodo2(Fluxo.java:29)
    at Fluxo.metodo1(Fluxo.java:23)
    at Fluxo.main(Fluxo.java:12)
```

When executing this code, the compiler will stop at this part of the code. Throw is simmilar to a 'return' statement. Nothing above a throw will be executed. Mostly compilers/IDE will present an error in lines bellow a throw statement. 

**Creating your own exceptions**
You can create your own classes extending RuntimeException or another class that throw exceptions.
Some classes are only used by the VM, developers normally do not use them.

```
Example:

public class MyException extends RuntimeException {};

In main: throw new MyException("Deu mais ou menos errado");

Console:
Ini do main
Ini do metodo1
Ini do metodo2
Exception Deu mais ou menos errado
MyException: Deu mais ou menos errado
    at Fluxo.metodo2(Fluxo.java:29)
    at Fluxo.metodo1(Fluxo.java:23)
    at Fluxo.main(Fluxo.java:12)
Fim do main
```

However, if you change the inheritance of the class, you should consider this:
- Some classes are not verified by compilers, which means, the throw statement in unchecked. Normally classes that extends RuntimeException are unchecked.
  -  RuntimeException is a motherclass of some exceptions in java, so the compiler do not check some throws exceptions when the motherclass is RuntimeException. This occours because some errors happens because of the code.
  -  If you inherits directly from a any superclass above RuntimeException, the compiler will check some throw exceptions and normally IDE's could launch some errors depending on the way you create your code.

```
How handle exception inherit other superclasses:

If:
public class MyException extends Exception{} //Compiler will check throws.

public class Fluxo extends Conta {
    private static void metodo2() throws MyException { //this will work
    }

    or

    private static void metodo1() {
    System.out.println("Ini do metodo1");
    try { //try - catch will make the code work as well
        metodo2();
    } catch(MyException ex) {}
    System.out.println("Fim do metodo1");
}
```
**Generic Try and Catch  - Classes extending Class Exception**

```
try {

} catch (Exception ex) {
    treatment;
}
```
The superclass Exception is the mother of all exceptions, so you can use it as a generic catch.

**Finally**

Finally will always be executed in a try-catch statement.
You can use try-finally, as well. Meaning you do not want to treat the exception.
Finally is not mandatory.

```
try {
    something...;
} catch (execption_name ex) {
    solve the exception issue;
} finally {
    get back to to something after the exception;
}
```

**AutoCloseable interface**

Every time you open a conection with something, you need to close it. Instead of invoking your own openings and closings statements, you can try *implements* the AutoCloseable interface. 
After that you can proceed as bellow:

```
        try (Conection conection = new Conection()) {
        }
```

Automaticaly the conection will be opened and closed by the interface. 

###JAVADOC

1. /** and close with */, for an example:
   1. /**
   2. * This class represents an account 
   3. * it's used to storage account values.
   4. * @author brunoFreitas.
   5. * @version 1.0
   6. */
2. In eclipse, click on Project and Generate Javadoc.
3. An HTML page will be created with the description of the classes/packages selected. This page can be accessed in index.html in the doc folder.
4. Only public things are presented in this documentation.
5. Some tags taht could be used:
    @author (usado na classe ou interface)
    @version (usado na classe ou interface)
    @param (usado no método e construtor)
    @return (usado apenas no método)
    @exception ou @throws (no método ou construtor)
    @see
    @since
    @serial
    @deprecated

###Java .JAR - Java Archive

- You can import JAR libraries by clicking with the right buttom of the mouse and selectin "build path":
  - If the libs are in the project folder, just select import jar.
  - If the libs aren't in the project folder, select "external jar"

By doing that you can use classes of the JAR file, JAR is kind of a .zip file, compressing all classes and docs of a lib/project.

###Cast

You transform a generic reference in a specific reference. Ex:
It's possible to use with objects as well.

```
//Explicit Cast
Double number1 = 2.0;
sysytem.out.println ( (int) number1);

terminal: 2

//Implicit cast
ContaCorrente conta = new ContaCorrente (value);
Conta conta; 

//Conta is a generic type of ContaCorrente.
```

###Java.lang

Strings come from this lib.

To avoid printing the memory information on  the console you can override the method toString in a class.
```
public class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;
public String toString() {
        return "Agencia: "+agencia + " " + "Numero: " + numero;
    }
```

- the method compareTo compare objects in a more natural way, distincts from java.lang.compare interface.
- Other way to compare is by using java.lang.comparable. It's an interface.

###Java.util

- Focus on this class, it's huge and increase productivity.
- LinkedList differs from ArrayList because follows an double order, each element connects into another by references of the next element and the previous element.
- Type List is an interface.
- Vector is also a type of list, however it's thread safe.
- Autoboxing: when java transforms a reference in an object. For instance, an INT in an INTEGER.
- Unboxing: When java transforms an object in a reference. For instance, an INTEGER in an INT.
- Wrapper: It's a class that handle primitive types, allowing autoboxing and unboxing.
- Instead of autoboxing, the good practice is to create an object of the Interger type.
- You can use java.util.compare to compare things. It's an interface.
- You can use java.util.collections to also compare things. A natural order is setted by the user inside the class, the collections order using this specification.
- A lot of parsing stuff.
- HashSet, Lists, Set and other usefull things are here.

###Java.IO

 - Handle the input and output of data in the java world. DB, keyboard, files, network, etc.
 - Serialization is an objtec becoming a binary stream.
 - Descerialization is an binary strema becoming an object.

###java.util.properties

- To handle information regarding values that has no need to be compiled every time, for instance, server names, IP, ports, passwords. You can configure a property document and stablish those constant values in this document and to use in your code you just have to import it.
   - For instance, you can create a conf.properties file by using ```props.store(new FileWriter("conf.properties"), "algum comentário");```
```
Properties props = new Properties();        
props.load(new FileReader("conf.properties"));
String login = props.getProperty("login"); //to read the property value
String senha = props.getProperty("senha");
String endereco = props.getProperty("endereco");
```

###java.nio.charset
- Handle unicode and encoding.

#jUnit
1. jUnit is a library that helps you to handle automatized software test.
2. In Eclipse: Right buttom > Build Path > Add Libraries > Junit
3. A test class must have "methods" that deal with the tests and it should be:
  1. Must have a name that express its responsability.
  2. public void.
  3. Without arguments.
  4. @test notation above name.
  5. Use Assert class from jUnit for test results.
  6. You can use deltas to stablish a margin error.
  7. Execute code as a jUnit test.
4. You can segment a test in:
  1. Cenario definiton
  2. Action
  3. Validation
5. Always test every conditional, hence, the number of tests should always be the same number of conditionals.
6. *@before* helps you to create public methods to be used by your test class. Testing sometimes means you will repeat code, by doing that jUnit will use this method to instantiate your test objects before every test method.

**Equivalent classes**
It's a class similar to another class, might be of any type. When handling tests, it's important to see if one class can support every cenario.
   


