package Assignment.Constructor;

public class Teacher extends Person {

    public Teacher(String name, int age, String degree){

        System.out.println("-----Teacher-----");
        System.out.println("Your name is " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your degree is " + degree +"\n");
        System.out.println("-----Person-----");
        super.Person(name, age);
    }

    public static void main(String[] args) {
        
        Teacher one = new Teacher("Kishore", 22 , "MCA");

    }
    
}
