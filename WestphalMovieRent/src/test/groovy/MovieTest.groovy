import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * Created by slange on 27.12.13.
 */
class MovieTest extends GroovyTestCase {
    @Test
    public void testMovieBasePrice() {
        assertEquals 2.0, Movie.getCharge(1), 0.001
        assertEquals 2.0, Movie.getCharge(2), 0.001
    }

    @Test
    public void testMoviePricePerDay() {
        assertEquals 3.75, Movie.getCharge(3), 0.001
        assertEquals 5.50, Movie.getCharge(4), 0.001
    }
}
