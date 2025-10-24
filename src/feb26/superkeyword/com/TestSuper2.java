package feb26.superkeyword.com;

//The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. 
//In other words, it is used if method is overridden
class Animals{  
void eat(){System.out.println("eating...");}  
}  
class Dogs extends Animals{  
void eat(){System.out.println("eating bread...");}  
void bark(){System.out.println("barking...");}  
void work(){  
super.eat();  
bark();  
}  
}  
class TestSuper2{  
public static void main(String args[]){  
Dogs d=new Dogs();  
d.work();  


}
}  