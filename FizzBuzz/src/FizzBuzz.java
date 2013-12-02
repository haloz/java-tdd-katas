/**
 * Created with IntelliJ IDEA.
 * User: slange
 * Date: 02.12.13
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {
    static public void printNumbersZeroToHundred() {
        for(Integer i=1; i<=100; i++) {
            if((i+1) % 3 == 1) {
                System.out.print("Fizz");
            } else {
                if((i+1) % 5 == 1) {
                    System.out.print("Buzz");
                } else {
                    System.out.print(i.toString());
                }
            }
        }


    }
}
