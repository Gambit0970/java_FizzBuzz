import java.util.Scanner;

public class User {

    private String name;
    private int counter;
    Scanner user_input = new Scanner(System.in);

    public void setNameFromInput(){
        System.out.println("Please enter your name");
        this.name = user_input.next();
    }

    public void setCounterFromInput(){
        System.out.println("How high shall we go?");
        this.counter = user_input.nextInt();
    }

    public String getName (){
        return name;
    }

    public int getCounter (){
        return counter;
    }

}
