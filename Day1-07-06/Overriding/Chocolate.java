package Assignment.Overriding;


public class Chocolate extends Candy {
    //override the taste method from the candy class in the chocolate class to return "taste chocolate". 
    //it should print taste sweet as then taste chocolates.
   
    @Override
    public void taste(){
        super.taste();
        System.out.println("Taste Chocolatey");
    }

    public static void main(String[] args) {
        Candy Choco = new Chocolate();

        Choco.taste();
    }
}


