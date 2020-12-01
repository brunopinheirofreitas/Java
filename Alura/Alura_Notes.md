#Alura Notes

##Encapsulation

Public - You can access this information at any moment.
Private - You can only access this information through an object of the class.
Protected - You can access this information through an object of the class or through objects from classes that inherits this attribute.

---

##Abstract concept

The abstrat concept represents the concept of something needed for the logic, however there will be no objects of this thing in the code. 

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

|Type|Lenght|
|----|------|
|boolean|1 bit|
|byte|1 byte|
|short|2 bytes|
|char|2 bytes|
|int|4 bytes|
|float|4 bytes|
|long|8 bytes|
|double|8 bytes|

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


