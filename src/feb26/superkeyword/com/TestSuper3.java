package feb26.superkeyword.com;

//The super keyword can also be used to invoke the parent class constructor. 
class Animal1{  
Animal1(){System.out.println("animal is created");}  
}  
class Dog1 extends Animal1{  
Dog1(){  
super();  
System.out.println("dog is created");  
}  
} 

class TestSuper3{  
public static void main(String args[]){  
Dog1 d=new Dog1();  
}
}  