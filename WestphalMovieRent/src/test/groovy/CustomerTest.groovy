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
        super.setUp()
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

    @Test
    public void testRentingThreeMoviesAndRentingThreeDays() {
        customer.rentMovie 1
        customer.rentMovie 2
        customer.rentMovie 3
        assertEquals 7.75, customer.getTotalCharge(), 0.001
    }

    @Test
    public void testRentingFourMovies() {
        customer.rentMovie 1
        customer.rentMovie 2
        customer.rentMovie 3
        customer.rentMovie 4
        assertEquals( (2 + 2 + 2+1.75 + 2+2*1.75), customer.getTotalCharge(), 0.001)
    }
}
