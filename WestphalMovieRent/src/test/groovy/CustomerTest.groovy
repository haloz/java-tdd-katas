import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by haloz on 27.12.13.
 */
class CustomerTest extends groovy.util.GroovyTestCase {

    private Customer customer;

    @Before
    void setUp() {
        customer = new Customer()
    }

    @After
    void tearDown() {
        customer = null
    }

    @Test
    public void testRentingOneMovie() {
        customer.rentMovie 1
        assertTrue customer.getTotalCharge() == 2
    }

    @Test
    public void testRentingTwoMovies() {
        customer.rentMovie 1
        customer.rentMovie 2
        assertEquals 4, customer.getTotalCharge()
    }
}
