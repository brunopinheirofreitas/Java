#Alura Notes

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

```
public class Gerente extends Funcionario
```

Gerente => Son Class
Funcionario => MotherClass or SuperClass

When a class inherits another, it inherit all characteristics of the superClass, this means it inherits attributes, methods and behaviors. 
Gerente is a Funcionario.

**Code Smells**
Too many conditionals. 

