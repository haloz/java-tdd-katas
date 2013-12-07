package main.java;

/**
 * Created with IntelliJ IDEA.
 * User: slange
 * Date: 02.12.13
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
public class FizzBuzz {

    static private boolean isMultipleOfN(int number, int multiple) {
        return (number) % multiple == 0;
    }

    static private boolean isMultipleOfThree(int number) {
        return isMultipleOfN(number, 3);
    }

    static private boolean isMultipleOfFive(int number) {
        return isMultipleOfN(number, 5);
    }

    static private void output(String part) {
        System.out.print(part);
    }

    static private void handleNumber(Integer i) {
        if(isMultipleOfThree(i) && isMultipleOfFive(i)) {
            output("FizzBuzz");
        } else if(isMultipleOfThree(i)) {
            output("Fizz");
        } else if(isMultipleOfFive(i)) {
            output("Buzz");
        } else {
            output(i.toString());
        }
    }

    static public void printNumbersZeroToHundred() {
        for(Integer i=1; i<=100; i++) {
            handleNumber(i);
        }
    }
}
