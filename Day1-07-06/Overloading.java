package Assignment;


public class Overloading {

    public void talk(){
        System.out.println("hello!");
    }

    public void talk(String name){
        System.out.println("hello! " + name);
    }

    public static void main(String[] args) {
        
        String name = "Kishore";

        Overloading talking = new Overloading();
        talking.talk(name);
    }
    
}
