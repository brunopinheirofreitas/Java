#Alura Notes

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
2. You can make your code smaller, because you can use as reference for sonClasses the superClass.

##Methods

A method signature is the form needed to invoke the method. For instance, maybe you have to input some parameters, maybe not. 

Rewriting a method occur when you have a method in the superClass and you rewrite it in the sonClass, aiming a specific result for a class that inherits another. In this case the method in the sonClass have priority over the method in the superClass.

Method overload is when you have more than one method with the same name, doing basicaly the same thing. 

##Encapsulation

Public - You can access this information at any moment.
Private - You can only access this information through an object of the class.
Protected - You can access this information through an object of the class or through objects from classes that inherits this attribute.

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

**Inheritance**
*extends*

```
public class Gerente extends Funcionario
```

Gerente => Son Class
Funcionario => MotherClass or SuperClass

When a class inherits another, it inherits all characteristics of the superClass, this means it inherits attributes, methods and behaviors. 
Gerente is a Funcionario.

**Code Smells**
Too many conditionals. 

