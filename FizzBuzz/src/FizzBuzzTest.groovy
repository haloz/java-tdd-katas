import org.junit.After
import org.junit.Before
import org.junit.Test
import static org.junit.Assert.assertEquals

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
    void shouldPrintOutNumbersZeroToHundred() {
        String numbersZeroToHundred = "";
        for(int i=1; i<=100; i++)
            numbersZeroToHundred += i.toString()
        FizzBuzz.printNumbersZeroToHundred();
        assertEquals numbersZeroToHundred, outContent.toString()
    }
}
