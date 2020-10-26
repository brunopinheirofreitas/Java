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

Constructor are not inherited. You have to create a constructor in the sonClass, case necessary. 

To use the superClass's constructor/method in a sonClass you have to use the statement super(). You can create a specific method/constructor in the superClass and use it in the sonClass, as bellow. Anyhow, you can just invoke the default superCLass's method/constructor .
The code *super.* should also bring superClass's methods.

```
public class ContaCorrente extends Conta {

        public ContaCorrente() { //uses the superClass constructor
            super();
        }
}
```

**Code Smells**
Too many conditionals. 

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

##Abstract concept

The abstrat concept represents the concept of something needed for the logic, however there will be no objects of this thing in the code. 

**Abstract Classes**
You cannot instatiate abstract classes. 
If the abstract class is a superClass, the sonClass are obliged to implement abstract methods.
You do not have to implement abstract methods in the abstract class. 

**Abstract Methods**
sonClasses are obliged to implement abstract methods inherited from superClasses. 

##Interface

Interfaces are *intermediate classes* between sonClasses and superClasses. It is needed to attend particular needs, like, methods or attributes that only make sense for some sonClasses. 
