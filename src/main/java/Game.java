public class Game {

    public void playGame (User inGameUser) {
        for (int n = 0; n <= inGameUser.getCounter(); n++) {
            if (n % 3 == 0 && n % 5 != 0) {
                // print Fizz
                System.out.println("Fizz");
            } else if (n % 3 != 0 && n % 5 == 0) {
                // print Buzz
                System.out.println("Buzz");
            } else if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(n);
            }
        }
    }

}
