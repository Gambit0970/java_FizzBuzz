package gamePackage;
import java.util.Scanner;
public class Game implements GameI {
    private final Scanner user_input = new Scanner(System.in);
    private final User user = new User();
    private final Counter count = new Counter();
    private final Multiple currI = new Multiple();
    public Game(){
        System.out.println("Please enter your name");
        user.setName(user_input.nextLine());
    }
    public void playGame() {
        System.out.println("Hello "+user.getName() +" ,Please enter your number");
        count.setCount(user_input.nextInt());

        for (currI.setNum(1); currI.getNum()<=count.getCount(); currI.incNum()){
            System.out.println(currI.getMult());
        }
    }
}