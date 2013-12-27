import org.junit.Test

/**
 * Created by haloz on 27.12.13.
 */
class CustomerTest extends groovy.util.GroovyTestCase {
    void setUp() {
        super.setUp()

    }

    void tearDown() {

    }

    @Test
    public void testRentingOneMovie() {
        Customer customer = new Customer()
        customer.rentMovie 1
        assertTrue customer.getTotalCharge() == 2
    }
}
