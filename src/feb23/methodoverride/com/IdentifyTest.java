package feb23.methodoverride.com;

class LivingThing {
    LivingThing getIdentity() {
        System.out.println("LivingThing's identity");
        return this;
    }
}

class Human extends LivingThing {
    @Override
    Human getIdentity() {
        System.out.println("Human's identity");
        return this;
    }
}

class Student extends Human {
    @Override
    Student getIdentity() {
        System.out.println("Student's identity");
        return this;
    }
}

public class IdentifyTest {
    public static void main(String[] args) {
        LivingThing livingThing = new LivingThing();
        livingThing.getIdentity(); // Output: LivingThing's identity

        Human human = new Human();
        human.getIdentity(); // Output: Human's identity

        Student student = new Student();
        student.getIdentity(); // Output: Student's identity
    }
}
