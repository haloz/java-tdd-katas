import FizzBuzz
import org.junit.After
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.assertEquals
import static org.junit.Assert.assertTrue

/**
 * Created with IntelliJ IDEA.
 * User: slange
 * Date: 02.12.13
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
class FizzBuzzTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream()

    @Before
    void setUp() {
        System.setOut new PrintStream(outContent)
    }

    @After
    void tearDown() {
        System.setOut null
    }

    @Test
    void canFetchSystemOutPrintAsString() {
        System.out.print "hello world"
        assertEquals "hello world", outContent.toString()
    }

    @Test
    void noFizzShouldReturnNumber() {
        FizzBuzz.printNumbersZeroToHundred()
        assertEquals Integer.parseInt(outContent.toString().charAt(1).toString()), 2
    }

    @Test
    void shouldPrintFizzInsteadMultiplesOfThrees() {
        FizzBuzz.printNumbersZeroToHundred()
        assertTrue outContent.toString().matches("^12Fizz4.*Fizz78Fizz.*11Fizz.*\$")
    }

    @Test
    void shouldPrintBuzzInsteadOfMultiplesOfFives() {
        FizzBuzz.printNumbersZeroToHundred()
        assertTrue outContent.toString().startsWith("12Fizz4BuzzFizz78FizzBuzz11Fizz")
    }

    @Test
    void shouldPrintFizzBuzzWhenMultiplesOfThreeAndFive() {
        FizzBuzz.printNumbersZeroToHundred()
        String test = outContent.toString()
        assertTrue outContent.toString().startsWith("12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz16")
    }
}
